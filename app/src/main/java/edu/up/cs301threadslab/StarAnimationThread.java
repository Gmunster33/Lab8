package edu.up.cs301threadslab;

import java.util.Random;

public class StarAnimationThread extends Thread {

    StarAnimation starAnimation;

    StarAnimationThread(StarAnimation starAnim) {
        starAnimation = starAnim;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();
            if(ran.nextBoolean()) {
                starAnimation.addStar();
            }
            else {
                starAnimation.removeStar();
            }

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

