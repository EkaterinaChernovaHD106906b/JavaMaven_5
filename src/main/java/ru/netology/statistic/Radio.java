package ru.netology.statistic;

public class Radio {
    private int amountStation = 10;


    private int maxStation = 9;
    private int minStation = 0;
    private int currentNumber;


    public Radio() {
        maxStation = amountStation - 1;
    }

    public Radio(int amount) {
        maxStation = amount - 1;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }


    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minStation) {
            currentNumber = maxStation;

        }
        if (currentNumber > maxStation) {
            currentNumber = minStation
            ;
        }
        this.currentNumber = currentNumber;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    private int maxSound = 100;
    private int minSound = 0;
    private int currentSound;


    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < minSound) {
            newCurrentSound = 0;
        }
        if (newCurrentSound > maxSound) {
            newCurrentSound = 0;
        }
        currentSound = newCurrentSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void next() {
        currentNumber = currentNumber + 1;

        if (currentNumber > maxStation) {
            currentNumber = 0;

        }
    }


    public void prev() {
        {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber < minStation) {
            currentNumber = maxStation;
        }
    }


    public void nextSound() {
        if (currentSound < maxSound) {
            currentSound = currentSound + 1;
        }
        if (currentSound >= maxSound) {
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











