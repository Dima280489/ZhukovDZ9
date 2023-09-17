package ru.netology.programming;

public class Radio {
    //КАНАЛЫ
    public int currentTheChannel;
    //ЗВУК
    public int currentVolume;

    public int getCurrentTheChannel() {
        return currentTheChannel;
    }

    //Установка текущего канала
    public void setCurrentTheChannel(int newCurrentTheChannel) {
        currentTheChannel = newCurrentTheChannel;
    }

    //Переключение каналов
    public void increaseTheChannel() {
        if (currentTheChannel > 0) {
            currentTheChannel = currentTheChannel + 1;
        }
        if (currentTheChannel < 0) {
            currentTheChannel = 9;
        }
        if (currentTheChannel > 9) {
            currentTheChannel = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Установка текущего значения звука
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    //Увеличение звука
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}
