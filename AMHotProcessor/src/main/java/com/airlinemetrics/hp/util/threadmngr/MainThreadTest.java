package com.airlinemetrics.hp.util.threadmngr;

import com.airlinemetrics.hp.util.threadmngr.TaskLock;
import com.airlinemetrics.hp.util.threadmngr.TaskLocker;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class MainThreadTest {

    int ctr = 0;

    public MainThreadTest() {
        new Scanner(System.in).next();
        testNoThread();
        testThread();
    }

    private void testNoThread() {
        System.out.println("_______________________________________________________");
        System.out.println("START CREATING IMAGE WITH NO-THREAD");
        System.out.println("_______________________________________________________");
        long start = System.currentTimeMillis();
        for (int x = 0; x < 10_000; x++) {
            drawNoThread();
        }

        System.out.println("DONE");
        System.out.println("TEST NO THREAD TIME TAKE : " + (System.currentTimeMillis() - start));
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private void testThread() {
        try {
            System.out.println("_______________________________________________________");
            System.out.println("START CREATING IMAGE WITH THREAD");
            System.out.println("_______________________________________________________");
            long start = System.currentTimeMillis();

            while (ctr < 10_000) {
                TaskLocker taskLock = new TaskLocker();
                for (int x = ctr; x < (ctr + 50) && x < 10_000; x++) {
                    taskLock.addThread(new TaskLock() {
                        @Override
                        public void run() {
                            drawThread();
                        }
                    });
                }
                taskLock.runAndWaitLocker();
                ctr += 50;
            }

            System.out.println("DONE");
            System.out.println("TEST THREAD TIME TAKE : " + (System.currentTimeMillis() - start));
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void drawNoThread() {
        try {
            BufferedImage img = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
            for (int x = 0; x < 1000; x++) {
                for (int y = 0; y < 1000; y++) {
                    img.setRGB(x, y, Color.blue.getRGB());
                }
            }
            ImageIO.write(img, "png", new File("E:\\airlinemetrics\\dir_no_thread\\" + System.nanoTime() + ".png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void drawThread() {
        try {
            BufferedImage img = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
            for (int x = 0; x < 1000; x++) {
                for (int y = 0; y < 1000; y++) {
                    img.setRGB(x, y, Color.blue.getRGB());
                }
            }
            ImageIO.write(img, "png", new File("E:\\airlinemetrics\\dir_thread\\" + System.nanoTime() + ".png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MainThreadTest();
    }
}
