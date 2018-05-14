package com.carlijn.kitty;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


@SpringBootApplication
public class KittyApplication {

    static Timer timer = new Timer();
    static int seconds = 100;
    static Kitty kitty;

    public static void main(String[] args) {

        kitty = new Kitty("Charly", 70);

        System.out.println("~Welcome to Kitty Tamagotchi~");

        MyTimer();

        while (kitty.isAlive()) {

            String interaction;
            Scanner interactionNew = new Scanner(System.in);
            System.out.println("What do you want to do, type in miauw, pet, play, feed or clean");
            interaction = interactionNew.nextLine();

            switch (interaction) {
                case "miauw":
                    kitty.miauw();
                    System.out.println(kitty.getHappinessMeter());
                    break;
                case "pet":
                    kitty.pet();
                    System.out.println(kitty.getHappinessMeter());
                    break;
                case "play":
                    kitty.play();
                    System.out.println(kitty.getHappinessMeter());
                    break;
                case "feed":
                    kitty.feed();
                    System.out.println(kitty.getHappinessMeter());
                    break;
                case "clean":
                    kitty.clean(20);
                    System.out.println(kitty.getHappinessMeter());
                    break;
                default:
                    System.out.println("Please type the command again");
                    System.out.println(kitty.getHappinessMeter());
            }

        }
    }

    public static void MyTimer() {

        TimerTask task;

        task = new TimerTask() {

            @Override
            public void run() {
              kitty.decayHappinessMeter();
            }
        };
        timer.schedule(task, 0, 5000);


    }
}
