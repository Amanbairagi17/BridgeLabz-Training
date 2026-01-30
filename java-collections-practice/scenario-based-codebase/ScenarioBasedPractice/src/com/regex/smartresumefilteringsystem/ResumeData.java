package com.regex.smartresumefilteringsystem;

public class ResumeData {
    String email;
    String phone;
    int keywordCount;
    String fileName;

    ResumeData(String email, String phone, int keywordCount, String fileName) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
        this.fileName = fileName;
    } 

    @Override
    public String toString() {
        return "Resume{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", keywordCount=" + keywordCount +
                ", file='" + fileName + '\'' +
                '}';
    }
}
