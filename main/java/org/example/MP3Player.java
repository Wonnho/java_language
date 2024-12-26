package org.example;

public class MP3Player {
    String model;
    int volume;
    boolean On;

    public MP3Player(String model) {
        this.model = model;
        this.volume = 40;
        this.On = false;
    }
boolean powerButton() {
        if(this.On) {
            return this.powerOn();
        } else {
            return this.powerOff();
        }
}
    boolean powerOn() {
        this.On=true;
        this.volume=40;
        return this.On;
    }

    boolean powerOff() {
        this.On=false;
        this.volume=0;
        return this.On;
    }

    int volumeUp() {
        if(this.volume>100) {
            this.volume=100;
        }
       return this.volume+=20;
    }

    int volumeDown() {
        if(this.volume<0) {
            this.volume=0;
        }
        return this.volume-=20;
    }

    void mp3Info() {
        System.out.printf("model: %s, volume: %d, powerOn/Off: %b\n",model,volume,On);
    }
}
