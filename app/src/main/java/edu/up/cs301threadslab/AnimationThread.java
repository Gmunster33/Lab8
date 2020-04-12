package edu.up.cs301threadslab;

public class AnimationThread extends Thread {
    AnimationView animationView;
    Integer syncObject;

    AnimationThread(AnimationView animV, Integer syncObj) {
        animationView = animV;
        syncObject = syncObj;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {

            synchronized (animationView) {animationView.postInvalidate();}

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
