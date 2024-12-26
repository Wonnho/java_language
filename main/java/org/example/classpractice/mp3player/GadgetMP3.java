package org.example.classpractice.mp3player;

public class GadgetMP3 {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("Blender3");
        mp3.turnOn(); //power on

      mp3.mp3Status();
        for (int k = 0; k < 3; k++) {
            mp3.volumeUp();
        }

        mp3.volumeDown();

        mp3.mp3Status();
    }
}
