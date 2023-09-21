package ru.netology.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // СТАНЦИЯ
    @Test //установка минимальной станции
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //установка максимальной станции
    public void shouldSetMaxTStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение станции внутри диапазона
    public void mustSwitchForwardStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //переключение станции с 1 на 2
    public void SwitchingStationFromMimumForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //переключение с 8 на 9
    public void SwitchingToTheMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //переключение станции с 9 на 0
    public void SwitchingFromMaxToMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение на предыдущую станцию
    public void SwitchToThPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Переключение cтанции ниже 0
    public void SwitchingStationBelowMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //положительная станция вне диапазона
    public void positiveStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //отрицательная станция вне диапазона
    public void negativeStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    //ЗВУК

    @Test // Установить минимальную громкость
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Установить максимальную громкость
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test // Переключение громкости с 0 на 1
    public void SwitchingVolumeFromMinToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Переключение громкости с 99 на 100
    public void IncreaseVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Установка максимального значения громкости если нажимать + при максимальной громкости
    public void shoulsNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Увеличение громкости внутри диапазона
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(43);

        radio.increaseVolume();

        int expected = 44;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости внутри диапазона
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости меньше 1
    public void reducingTheVolumeBelowMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости меньше 1
    public void negativeVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Уменьшение громкости меньше 1
    public void positiveVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
