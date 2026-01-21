package com.generic.aidrivenresumescreening;

import java.util.List;

public class ResumeScreener {
	// generic method
    public static <T extends JobRole>
    void screenResume(Resume<T> resume) {

        resume.processResume();
        System.out.println("AI Score Generated");
    }

    // wildcard method
    public static void bulkScreen(
            List<? extends JobRole> roles) {

        System.out.println("\n--- Bulk Role Screening ---");

        for (JobRole role : roles) {
            System.out.print(role.getRoleName() + ": ");
            role.evaluateResume();
        }
    }
}
