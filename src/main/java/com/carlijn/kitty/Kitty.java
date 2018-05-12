package com.carlijn.kitty;

    public class Kitty {

        private String name;

        private int happinessMeter;

        public Kitty(String name, int happinessMeter) {
            this.name = name;
            this.happinessMeter = happinessMeter;
        }

        public void miauw() {
            System.out.println(name + " says: miauw");
        }

        public void pet(){
            double  increasedHappiness = (Math.floor(Math.random() * 20) + 1)  ;
//          int increasedHappiness = 20;
            if (happinessMeter < 100 && happinessMeter > 0) {
                this.happinessMeter += increasedHappiness;
                System.out.println("Petting " + name);
            } else {
                System.out.println(name + " is too busy to pet");
            }
        }

        public void play() {
//          increasedHappiness = (Math.floor(Math.random() * 20) + 1) ;
            int increasedHappiness = 20;
            if (happinessMeter < 100 && happinessMeter > 0) {
                this.happinessMeter += increasedHappiness;
                System.out.println("Playing with " + name);
            } else {
                System.out.println(name + " is sleeping and therefore doesn't want to play");
            }
        }

        public void feed(){
            int increasedFullness = 20;
            if (happinessMeter < 100 && happinessMeter > 0) {
            this.happinessMeter += increasedFullness;
            System.out.println("Feeding " + name);
            } else {
                System.out.println(name + " is already has a full tummy");
            }
        }

        public void clean(int increasedCleanliness){
            increasedCleanliness = 20;
            if (happinessMeter <100 && happinessMeter > 0) {
                this.happinessMeter += increasedCleanliness;
                System.out.println("Cleaning " + name);
            } else {
                System.out.println(name + " doesn't need to be cleaned");
            }
        }


        public void addHappiness(int additionalHappiness){
            if (happinessMeter <100 && happinessMeter > 0){
                this.happinessMeter += additionalHappiness;
            } else {
                System.out.println(name + " is the luckiest kitty on the planet");
            }
        }


        public boolean isAlive(){
            if (happinessMeter > 0) {
                return true;
            }
            else {
                System.out.println("Game Over, no worries a kitty has 9 lives.");
                System.exit(0);
                return false;
            }
        }

//      Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHappinessMeter() {
            return happinessMeter;
        }

        public void setHappinessMeter(int happinessMeter) {
            this.happinessMeter = happinessMeter;

        }

    }


