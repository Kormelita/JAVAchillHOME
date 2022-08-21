package by.itacademy.hw7.task1;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Ivan", "Ivanov", 2, "surgeon", 5.0f);
        students[1] = new Student("Petr", "Petorv", 3, "pediatrician", 4.2f);
        GraduateStudent[] graduateStudents = new GraduateStudent[2];
        graduateStudents[0] = new GraduateStudent("Semen", "Semenov", 1, "pulmonologist", 5.0f, "Cats");
        graduateStudents[1] = new GraduateStudent("Sidor", "Sidorov", 1, "phthisiatrician", 2.0f, "Dogs");


        for (Student student : students) {
            System.out.println(student.getInfo());
            for (GraduateStudent graduateStudent : graduateStudents) {

                System.out.println(graduateStudent.getInfo());
            }
        }
    }
}

