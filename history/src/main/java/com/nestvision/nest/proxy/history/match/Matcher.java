package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.nestvision.nest.proxy.base.util.JSONUtil;

public class Matcher implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5522005767921672746L;

    private List<Join> joins;

    public Matcher() {
        this.joins = new ArrayList<>();
    }

    public Matcher join(JoinType joinType, Matcher... matchers) {
        for (Matcher matcher : matchers) {
            this.joins.add(new Join(joinType, matcher));
        }

        return this;
    }

    public Matcher join(JoinType joinType, Pattern... patterns) {
        for (Pattern pattern : patterns) {
            this.joins.add(new Join(joinType, pattern));
        }

        return this;
    }

    public Matcher and(Matcher... matchers) {
        for (Matcher matcher : matchers) {
            this.joins.add(new Join(JoinType.AND, matcher));
        }

        return this;
    }

    public Matcher and(Pattern... patterns) {
        for (Pattern pattern : patterns) {
            this.joins.add(new Join(JoinType.AND, pattern));
        }

        return this;
    }

    public Matcher or(Pattern... patterns) {
        for (Pattern pattern : patterns) {
            this.joins.add(new Join(JoinType.OR, pattern));
        }

        return this;
    }

    public Matcher or(Matcher... matchers) {
        for (Matcher matcher : matchers) {
            this.joins.add(new Join(JoinType.AND, matcher));
        }

        return this;
    }

    protected boolean isFinish(JoinType joinType, boolean isMatch) {

        return (joinType == JoinType.OR && isMatch) || (joinType == JoinType.AND && !isMatch);
    }

    public boolean execute(Object object) {

        boolean isMatch = false;
        boolean lastMatch = false;
        for (int i = 0; i < joins.size(); i++) {
            Join join = joins.get(i);
            Object value = join.joinValue;
            boolean joinMatch = false;
            if (value instanceof Pattern) {
                joinMatch = ((Pattern) value).match(object);
            } else {
                joinMatch = ((Matcher) value).execute(object);
            }
            if (i > 0) {
                if (isFinish(join.joinType, joinMatch)) {
                    return joinMatch;
                } else {
                    if (join.joinType == JoinType.OR) {
                        isMatch = joinMatch || lastMatch;

                    } else if (join.joinType == JoinType.AND) {
                        isMatch = joinMatch && lastMatch;

                    }
                }
            } else {
                isMatch = joinMatch;
            }

            lastMatch = isMatch;

        }
        return isMatch;
    }

    public MatcherConfiguration toMatcherConfiguration() {

        MatcherConfiguration matcherConfiguration = new MatcherConfiguration();
        List<JoinConfiguration> joinConfigurations = new ArrayList<>();
        for (Join join : this.joins) {
            JoinConfiguration joinConfiguration = new JoinConfiguration();
            joinConfiguration.setJoinType(join.joinType);

            if (join.joinValue instanceof Pattern) {
                Pattern p = (Pattern) join.joinValue;
                PatternConfiguration config = p.toPatternConfiguration();
                joinConfiguration.setJoinValueData(JSONUtil.toJSONString(config));
                joinConfiguration.setJoinValueClass(config.getClass().getName());

            } else if (join.joinValue instanceof Matcher) {
                Matcher m = (Matcher) join.joinValue;
                MatcherConfiguration config = m.toMatcherConfiguration();
                joinConfiguration.setJoinValueData(JSONUtil.toJSONString(config));
                joinConfiguration.setJoinValueClass(config.getClass().getName());
            } else {
                joinConfiguration.setJoinValueData(JSONUtil.toJSONString(join.joinValue));
                joinConfiguration.setJoinValueClass(join.joinValue.getClass().getName());
            }
            joinConfigurations.add(joinConfiguration);
        }
        matcherConfiguration.setJoins(joinConfigurations);
        return matcherConfiguration;
    }

}
