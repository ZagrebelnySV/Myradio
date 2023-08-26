package ru.netology.radio;
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio(){
        this.maxStation = 9;

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;

    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getGetCurrentVolume() {
        return currentVolume;
    }

    public void setGetCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
