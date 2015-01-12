package com.company.tasks4;


public class Task11 {
    public static void main(String[] args) {
        //a
      for (int i = 1950; i < 2000; i++){
          taskA(i);
      }

        //b
        for (int i = 1950; i < 2000; i++){
            taskB(i);
        }
    }

    //a
    public static void taskA(int n){
        String[] colors = {"Green", "Red", "Yellow", "White", "Black"};
        String[] animals = {"Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Chicken", "Dog", "Pig"};
        int _n = n - 1984;
        int colorIndex = (_n % 60)/12;
        String color = colors[colorIndex];
        int animalIndex = (_n % 60) % 12;
        String animal = animals[animalIndex ];
        System.err.println(n + " -- " + color + " " + animal + " " + (_n % 60));
    }


    //b
    public static void taskB(int n){
        String[] colors = {"Green", "Red", "Yellow", "White", "Black"};
        String[] animals = {"Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Chicken", "Dog", "Pig"};
        int _n = (60 - ((1984 - n)%60));
        int colorIndex = (_n % 60)/12;
        String color = colors[colorIndex];
        int animalIndex = (_n % 60) % 12;
        String animal = animals[animalIndex ];
        System.err.println(n + " -- " + color + " " + animal + " " + (_n % 60));
    }
}
