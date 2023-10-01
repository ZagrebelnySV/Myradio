package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testSwitchStationsFromZeroToMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromZeroToOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(1);

        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromOneToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.setCurrentStation(0);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromEightToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.setCurrentStation(9);

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromNineToTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setCurrentStation(10);

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromZeroToOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromEightToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromOneToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromNineToEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromZeroToOne() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromNinetyNineToHundred() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(99);

        radio.nextVolume();

        int expected = 100;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromHundred() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(100);

        radio.nextVolume();

        int expected = 100;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeFromHundred() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(100);

        radio.prevVolume();

        int expected = 99;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeFromZero() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchVolumeFromZeroToMinusOne() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(0);

        radio.setGetCurrentVolume(-1);

        int expected = 0;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchVolumeFromHundredToHundredOne() {
        Radio radio = new Radio();
        radio.setGetCurrentVolume(100);

        radio.setGetCurrentVolume(101);

        int expected = 100;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
