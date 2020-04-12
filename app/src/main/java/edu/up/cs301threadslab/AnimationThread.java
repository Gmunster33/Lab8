package edu.up.cs301threadslab;

public class AnimationThread extends Thread {
    AnimationView animationView;

    AnimationThread(AnimationView animV) {
        animationView = animV;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {

            animationView.postInvalidate();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
