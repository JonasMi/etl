package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;
import java.util.List;

import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.history.exception.MatcherBuildException;

import lombok.Data;

@Data
public class MatcherConfiguration implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 745976372673330291L;

    private List<JoinConfiguration> joins;

    public Matcher buildMatcher() {

        Matcher matcher = new Matcher();
        if (joins != null) {
            for (JoinConfiguration joinConfiguration : joins) {
                String joinValueClassName = joinConfiguration.getJoinValueClass();
                Class<?> joinValueClass;
                try {
                    joinValueClass=Class.forName(joinValueClassName);
                } catch (ClassNotFoundException e) {
                    throw new MatcherBuildException("无法在当前上下文当中找到类:" + joinValueClassName, e);
                }
                if (PatternConfiguration.class.isAssignableFrom(joinValueClass)) {
                    PatternConfiguration patternConfiguration = JSONUtil.readObject(joinConfiguration.getJoinValueData(), PatternConfiguration.class);
                    Pattern pattern = patternConfiguration.buildPattern();
                    matcher.join(joinConfiguration.getJoinType(), pattern);
                } else if (MatcherConfiguration.class.isAssignableFrom(joinValueClass)) {
                    MatcherConfiguration nextMatcherConfiguration = JSONUtil.readObject(joinConfiguration.getJoinValueData(), MatcherConfiguration.class);
                    Matcher nextMatcher = nextMatcherConfiguration.buildMatcher();
                    matcher.join(joinConfiguration.getJoinType(), nextMatcher);
                }

            }
        }

        return matcher;
    }

}
