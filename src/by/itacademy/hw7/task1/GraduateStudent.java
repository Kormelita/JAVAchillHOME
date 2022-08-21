package by.itacademy.hw7.task1;

public class GraduateStudent extends Member {
    private String scientificWork;

    public GraduateStudent(String firstName, String surName, int group, String cource, float academicPerformance, String scientificWork) {
        super(firstName, surName, group, cource, academicPerformance);
        this.scientificWork = scientificWork;
    }

    public int getGrants() {
        if (academicPerformance == 5.0f) {
            return 200;
        }
        return 180;
    }
}





