package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void currentNumberOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        int actual = radio.getCurrentNumber();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentNumberUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void currentSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(9);
        int actual = radio.getCurrentSound();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void currentSoundOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(13);
        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void currentSoundUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(-1);
        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void increaseNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(6);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 7;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void increaseNumberOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);


    }


    @Test
    void reduceNumberOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(3);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceNumberForZero() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceNumberForOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(7);
        radio.nextSound();
        int actual = radio.getCurrentSound();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseSoundOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(10);
        radio.nextSound();
        int actual = radio.getCurrentSound();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void reduceSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(9);
        radio.prevSound();
        int actual = radio.getCurrentSound();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceSoundUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(0);
        radio.prevSound();
        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
