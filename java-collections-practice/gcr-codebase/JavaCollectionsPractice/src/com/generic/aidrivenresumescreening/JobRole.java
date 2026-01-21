package com.generic.aidrivenresumescreening;

public abstract class JobRole {

    protected String roleName;

    public String getRoleName() {
        return roleName;
    }

    // each role has its own evaluation logic
    public abstract void evaluateResume();
}

