package ru.annasashkova.university.entity;

public class Student implements Studying, LivingBeing {
    public static University university;
    public Teacher teacher;
    public int age;
    public String name;
    public int groupnamber;
    public String faculty;

    public Student(){

    }
    public Student(int age, String name, int groupname, String faculty) {
        this.age= age;
        this.name = name;
        this.groupnamber = groupname;
        this.faculty = faculty;
    }

    @Override
    public void study() {
        eat();
        sleep();
        comeUniversity(university);
        System.out.println("Студент " + name + " возраста " + age + " из группы " + groupnamber + " факультета " + faculty + " на данный момент учится!");
        listenTeacher(teacher);
    }

    @Override
    public void eat() {
        System.out.println("Студент поел!");
    }

    @Override
    public void sleep() {
        System.out.println("Студент поспал!");
    }

    public void listenTeacher(Teacher teacher) {
        System.out.println("Студент слушает учителя по имени " + teacher.name);
    }

    public void comeUniversity(University university) {
        System.out.println("Студент " + name + " пришел в универститет " + university.name);
    }
}
