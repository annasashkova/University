package ru.annasashkova.university._main;

import ru.annasashkova.university.entity.Student;
import ru.annasashkova.university.entity.Teacher;
import ru.annasashkova.university.entity.University;
import ru.annasashkova.university.service.UniversityLiveDemonstrator;

public class _Main {
    public static void main(String[] args) {
        University uni = new University();
        Student st1 = new Student(19,"Павел", 5, "Лечебное дело");
        Teacher tch1 = new Teacher();
        uni.name = "Медицинский институт";
        tch1.name = "Мария Анатольевна";
        tch1.subject = "Анатомия";
        tch1.age = 51;
        Student.university = uni;
        Teacher.university = uni;
        st1.teacher = tch1;
        tch1.student = st1;
        University.nameTeacher(tch1);
        University.nameStudent(st1);
        UniversityLiveDemonstrator.studentLive(st1);
        UniversityLiveDemonstrator.teacherLive(tch1);
    }
}
