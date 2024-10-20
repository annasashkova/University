package ru.annasashkova.university.entity;

public class University {
    public static Teacher teacher;
    public static Student student;
    public String name;

    public static void nameTeacher(Teacher teacher) {
        System.out.println("В университете сейчас преподает учитель " + teacher.name + " который ведет предмет " + teacher.subject);
    }

    public static void nameStudent(Student student) {
        System.out.println("В университете сейчас обучается студент " + student.name + " на факультете " + student.faculty);
    }
}
