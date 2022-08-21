package by.itacademy.hw7.task1;

public class Member {

    protected String firstName, surName;
    protected int group;
    protected String cource;
    protected float academicPerformance;
    protected int grants;
    private String scientificWork;


    public Member(String firstName, String surName, int group, String cource, float academicPerformance) {
        this.firstName = firstName;
        this.surName = surName;
        this.group = group;
        this.cource = cource;
        this.academicPerformance = academicPerformance;
    }
    protected int getGrants() {
        if (academicPerformance >= 5.0) {
            return 100;
        } else return 80;
    }

    public String getInfo() {
        return "Name: " + firstName + " " + surName + "\nGroup&curce:  " + group + " " + cource + "\nPerformance: " + academicPerformance + "\nGrants: " + getGrants();

    }
}
