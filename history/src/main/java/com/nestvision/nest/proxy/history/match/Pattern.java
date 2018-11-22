package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;

public interface Pattern extends Serializable{

    public boolean match(Object objet);
    public PatternConfiguration toPatternConfiguration();
}
