package ru.annasashkova.university.entity;

public class Teacher implements Teaching, LivingBeing {
    public static University university;
    public static Student student;
    public int age;
    public String name;
    public String subject;

    @Override
    public void teach() {
        eat();
        sleep();
        comeUniversity(university);
        System.out.println("Учитель по имени " + name + " возраста " + age + " препадающий предмет " + subject + " сейчас обучает!");
        studyStudent(student);
    }

    public void eat() {
        System.out.println("Учитель поел!");
    }

    public void sleep() {
        System.out.println("Учитель поспал!");
    }

    public static void studyStudent(Student student) {
        System.out.println("Учитель учит " + student.name);
    }

    public void comeUniversity(University university) {
        System.out.println("Учитель " + name + " пришел в универститет " + university.name);
    }

}
