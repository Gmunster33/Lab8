package edu.up.cs301threadslab;

import java.util.Random;

public class StarAnimationThread extends Thread {

    StarAnimation starAnimation;

    Integer syncObject;

    StarAnimationThread(StarAnimation starAnim, Integer syncObj) {
        starAnimation = starAnim;
        syncObject = syncObj;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();

            synchronized (syncObject) {
                if (ran.nextBoolean()) {
                    starAnimation.addStar();
                } else {
                    starAnimation.removeStar();
                }
            }

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

