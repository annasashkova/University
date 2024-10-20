package ru.annasashkova.university.entity;

public class Teacher implements Teaching, LivingBeing {
    University university;
    Student student;
    public int age;
    public String name;
    public String subject;

    @Override
    public void teach() {
        eat();
        sleep();
        comeUniversity();
        System.out.println("Учитель по имени " + name + " возраста " + age + " препадающий предмет " + subject + " сейчас обучает!");
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

    public void comeUniversity() {
        University university1 = new University();
        university1.name = "Медицинский университет";
        System.out.println("Учитель " + name + " пришел в универститет " + university1.name);
    }

}
