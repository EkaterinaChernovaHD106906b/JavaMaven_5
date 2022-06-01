package ru.netology.statistic;

public class Radio {
    private int currentNumber;


    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            currentNumber = 9;

        }
        if (currentNumber > 9) {
            currentNumber = 0
            ;
        }
        this.currentNumber = currentNumber;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    private int currentSound;

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            newCurrentSound = 10;
        }
        if (newCurrentSound > 10) {
            newCurrentSound = 0;
        }
        currentSound = newCurrentSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void next() {
        currentNumber = currentNumber + 1;

        if (currentNumber > 9) {
            currentNumber = 0;

        }
    }


    public void prev() {
        {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber < 0) {
            currentNumber = 9;
        }
    }


    public void nextSound() {
        if (currentSound < 10) {
            currentSound = currentSound + 1;
        }
        if (currentSound >= 10) {
            return;
        }
    }

    public void prevSound() {
        if (currentSound >= 1) {
            currentSound = currentSound - 1;
        }
        if (currentSound == 0)
            return;
    }
}











