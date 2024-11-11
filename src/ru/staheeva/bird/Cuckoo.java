package ru.staheeva.bird;

import java.util.Random;

public class Cuckoo extends Birds {

    @Override
    public void sing() {
        Random random = new Random();
        int times = random.nextInt(10) + 1;
        for (int i = 0; i < times; i++) {
            System.out.println("ку-ку");
        }
    }
}