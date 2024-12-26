package org.example.classpractice.mp3player;

public class MP3 {
    private static final int MAX_VOLUME =100 ;
    String model;
    int volume;
    boolean powerOn;

    public MP3(String model) {
        this.model = model;
        this.volume=0;
        this.powerOn=false;
    }

    int turnOn() {
        if(powerOn == true) {
            volume+=40;
        } else {
            powerOn=true;
            volume+=40;
        }

        return volume;
    }

    int turnOff() {
        if(powerOn == true) {
            powerOn=false;
            volume=0;
        } else {
            volume=0;
        }

        return volume;
    }

    int volumeUp() {
        if(powerOn) {
            volume+=20;
            if(volume>100) {
                volume = MAX_VOLUME;
            }
        }
//        else {
//            powerOn = true;
//            if (volume > 100) {
//                volume = MAX_VOLUME;
//            } else {
//            volume += 20;
//        }
//            if (volume > 100) {
//                volume = MAX_VOLUME;
//            }
//        }
        return volume;
    }


    int volumeDown() {
        if(powerOn==true) {
            if (volume == 0) {
                return this.volume;
            } else {
                volume -= 20;
                if (this.volume < 0) {
                    this.volume = 0;

                }
            }
        }
        return volume;
    }

    void mp3Status() {
        System.out.printf("model:%s,power on:%b, volume: %d \n",model,powerOn,volume);
    }
}
