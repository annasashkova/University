package ru.annasashkova.university.entity;

public class Student implements Studying, LivingBeing {
    University university;
    Teacher teacher;
    public int age;
    public String name;
    public int groupnamber;
    public String faculty;

    @Override
    public void study() {
        eat();
        sleep();
        comeUniversity();
        System.out.println("Студент " + name + " возраста " + age + " из группы " + groupnamber + " факультета " + faculty + " на данный момент учится!");
    }

    public void eat() {
        System.out.println("Студент поел!");
    }

    public void sleep() {
        System.out.println("Студент поспал!");
    }

    public static void listenTeacher(Teacher teacher) {
        System.out.println("Студент слушает учителя по имени " + teacher.name);
    }

    public void comeUniversity() {
        University university1 = new University();
        university1.name = "Медицинский университет";
        System.out.println("Студент " + name + " пришел в универститет " + university1.name);
    }
}
