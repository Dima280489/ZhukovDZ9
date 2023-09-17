package ru.netology.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // КАНАЛЫ
    @Test //установка канала
    public void shouldSetTheChannel() {
        Radio radio = new Radio();

        radio.setCurrentTheChannel(5);

        int expected = 5;
        int actual = radio.getCurrentTheChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test //выставить 0, если значение больше максимального
    public void shoulsNotSetTheChannelAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentTheChannel(10);

        radio.increaseTheChannel();

        int expected = 0;
        int actual = radio.getCurrentTheChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение каналов
    public void mustSwitchForwardChannel() {
        Radio radio = new Radio();
        radio.setCurrentTheChannel(8);

        radio.increaseTheChannel();

        int expected = 9;
        int actual = radio.getCurrentTheChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение канала меньше минимального значениия
    public void ChannelSwitchingLessThanMinValue() {
        Radio radio = new Radio();
        radio.setCurrentTheChannel(-1);

        radio.increaseTheChannel();

        int expected = 9;
        int actual = radio.getCurrentTheChannel();

        Assertions.assertEquals(expected, actual);
    }


    //ЗВУК

    @Test // Установка максимального значения громкости если нажимать + при максимальной громкости
    public void shoulsNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение громкости вверх на 1 при нажатии на +
    public void switchVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение громкости вниз на 1 при нажатии на -
    public void switchingVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
