package com.generic.universitycoursemanagement;

public abstract class CourseType {
	protected String evaluationMethod;

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract void evaluateStudent();
}
