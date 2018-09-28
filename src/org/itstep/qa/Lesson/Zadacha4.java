package org.itstep.qa.Lesson;

import java.util.Random;

public class Zadacha4 {
    public static int random(int a, int b) {
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }
}
