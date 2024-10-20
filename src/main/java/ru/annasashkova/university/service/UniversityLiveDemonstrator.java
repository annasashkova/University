package ru.annasashkova.university.service;

import ru.annasashkova.university.entity.Studying;
import ru.annasashkova.university.entity.Teaching;

public class UniversityLiveDemonstrator {
    public static void studentLive(Studying studying) {
        studying.study();
    }

    public static void teacherLive(Teaching teaching) {
        teaching.teach();
    }
}
