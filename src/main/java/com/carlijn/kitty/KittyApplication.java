package com.carlijn.kitty;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class KittyApplication {

	public static void main(String[] args) {

		Kitty charly = new Kitty("Charly", 70);

		while (charly.isAlive()) {

			String interaction;
			Scanner interactionNew = new Scanner(System.in);
			System.out.println("What do you want to do, type in miauw, pet, play, feed or clean");
			interaction = interactionNew.nextLine();

			switch (interaction) {
				case "miauw":
					charly.miauw();
					System.out.println(charly.getHappinessMeter());
					break;
				case "pet":
					charly.pet();
					System.out.println(charly.getHappinessMeter());
					break;
				case "play":
					charly.play();
					System.out.println(charly.getHappinessMeter());
					break;
				case "feed":
					charly.feed();
					System.out.println(charly.getHappinessMeter());
					break;
				case "clean":
					charly.clean(20);
					System.out.println(charly.getHappinessMeter());
					break;
				default:
					System.out.println("Please type the command again");
					System.out.println(charly.getHappinessMeter());
			}

		}
	}
}
