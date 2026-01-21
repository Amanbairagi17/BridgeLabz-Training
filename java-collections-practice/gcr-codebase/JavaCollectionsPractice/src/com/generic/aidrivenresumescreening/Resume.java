package com.generic.aidrivenresumescreening;

public class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void processResume() {
        System.out.println(
            "\nCandidate: " + candidateName +
            " | Role: " + jobRole.getRoleName()
        );
        jobRole.evaluateResume();
    }
}
