package com.carlijn.kitty;

    public class Kitty {

        private String name;

        private int happinessMeter;

        public Kitty(String name, int happinessMeter) {
            this.name = name;
            this.happinessMeter = happinessMeter;
        }

        private void miauw() {
            System.out.println("miauw");
        }

        private void pet(double increasedHappiness){
            increasedHappiness = (Math.floor(Math.random() * 20) + 1)  ;
            this.happinessMeter += increasedHappiness;
            System.out.println("pet");
        }

        private void play(double increasedHappiness) {
            increasedHappiness = (Math.floor(Math.random() * 20) + 1) ;
            this.happinessMeter +=increasedHappiness;
            System.out.println("play");
        }

        private void feed(int increasedFullness){
            increasedFullness = 20;
            this.happinessMeter += increasedFullness;
            System.out.println("feed");
        }

        private void clean(int increasedCleanliness){
            increasedCleanliness = 20;
            this.happinessMeter += increasedCleanliness;
            System.out.println("clean");
        }

        private boolean isAlive(){
            if (happinessMeter > 0) {
                System.out.println("play");
                return true;
            }
            else {
                System.out.println("game over");
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


