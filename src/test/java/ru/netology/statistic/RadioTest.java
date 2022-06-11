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
        radio.setCurrentNumber(9);
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentNumberUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentNumberUnderLimitWithAmount() {
        Radio radio = new Radio(35);
        radio.setCurrentNumber(-1);
        int actual = radio.getCurrentNumber();
        int expected = 34;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(100);
        int actual = radio.getCurrentSound();
        int expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void currentSoundOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(121);
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
        radio.setCurrentNumber(8);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void increaseNumberWithAmount() {
        Radio radio = new Radio(35);
        radio.setCurrentNumber(30);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 31;
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
    void increaseNumberOverLimitWithAmount() {
        Radio radio = new Radio(35);
        radio.setCurrentNumber(34);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void increaseNumber2() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void increaseNumber2WithAmount() {
        Radio radio = new Radio(35);
        radio.setCurrentNumber(33);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 34;
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
        radio.setCurrentNumber(2);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void reduceNumberForOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 0;
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
    void increaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(99);
        radio.nextSound();
        int actual = radio.getCurrentSound();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseSound2() {
        Radio radio = new Radio();
        radio.setCurrentSound(6);
        radio.nextSound();
        int actual = radio.getCurrentSound();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void increaseSoundOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentSound(100);
        radio.nextSound();
        int actual = radio.getCurrentSound();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void reduceSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(100);
        radio.prevSound();
        int actual = radio.getCurrentSound();
        int expected = 99;
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

    @Test
    void currentNumberOverLimitWithAmount() {
        Radio radio = new Radio(40);
        radio.setCurrentNumber(40);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentNumberWithAmount() {
        Radio radio = new Radio(40);
        radio.setCurrentNumber(39);
        int actual = radio.getCurrentNumber();
        int expected = 39;
        Assertions.assertEquals(expected, actual);
    }

}


