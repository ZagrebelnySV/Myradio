package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();
    @Test
    public void testSwitchStationsFromZeroToMinusOne() {
        radio.setCurrentStation(0);

        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromZeroToOne() {
        radio.setCurrentStation(0);

        radio.setCurrentStation(1);

        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromOneToZero() {
        radio.setCurrentStation(1);

        radio.setCurrentStation(0);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromEightToNine() {
        radio.setCurrentStation(8);

        radio.setCurrentStation(9);

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchStationsFromNineToTen() {
        radio.setCurrentStation(9);

        radio.setCurrentStation(10);

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromZeroToOne() {
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromEightToNine() {
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationFromNineToZero() {
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromOneToZero() {
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromZeroToNine() {
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationFromNineToEight() {
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromZeroToOne() {
        radio.setGetCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromNinetyNineToHundred() {
        radio.setGetCurrentVolume(99);

        radio.nextVolume();

        int expected = 100;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeFromHundred() {
        radio.setGetCurrentVolume(100);

        radio.nextVolume();

        int expected = 100;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeFromHundred() {
        radio.setGetCurrentVolume(100);

        radio.prevVolume();

        int expected = 99;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeFromZero() {
        radio.setGetCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;

        int actual = radio.getGetCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
