package ru.netology.statistic;

public class Radio {
    private int currentNumber;

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    private int currentSound;

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound > 10) {
            return;
        }
        currentSound = newCurrentSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void next() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }


        if (currentNumber == 9) {
            currentNumber = 0;
        }
    }


    public void prev() {
        if (currentNumber > 1) {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber == 0) {
            currentNumber = 9;
        }


    }


    public void nextSound() {
        if (currentSound < 10) {
            currentSound = currentSound + 1;
        }
        if (currentSound == 10) {
            return;
        }
    }

    public void prevSound() {
        if (currentSound > 1) {
            currentSound = currentSound - 1;
        }
        if (currentSound == 0)
            return;
    }
}











