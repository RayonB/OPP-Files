package LabFinalsno1;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Evarine Rayon", 1999, "November 01", "Information Technology");
        Instructor instructor = new Instructor("Phoebe Ruth Alithea Sudaria", 1985, "July 05", 60000);

        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
