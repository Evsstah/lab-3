package ru.staheeva.time;

// Задание 1.2
public class Time {
    // поля
    private int seconds;

    // свойства
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // вычисляю кол-во часов
    public int getHour() {
        return seconds / 3600;
    }

    // вычисляю кол-во минут
    public int getMinute() {
        return (seconds % 3600) / 60;
    }

    // вычисляю кол-во секунд
    public int getSecond() {
        return seconds % 60;
    }

    // конструкторы
    public Time() {
        this.seconds = 0;
    }

    public Time(int seconds) {
        if (seconds >= 0 && seconds <= 86400) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Количество секунд должно быть от 0 до 86400.");
        }
    }

    // методы
    public String toString() {
        return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}