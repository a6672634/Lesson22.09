package com.google.qa.pet.ranner;

import com.google.qa.pet.Cat;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.countEyes = 2;
        catOne.nameCat = "Пушек";

        char firstLetter = catOne.getFirstLetterName();
        System.out.println("Первая буква " + firstLetter);
        catOne.printCatNameToConsole();
        Random random = new Random();
        catOne.getMultEyes(random.nextInt(random.nextInt(111)));

        Cat catTwo = new Cat();
        catTwo.nameCat = "Сидорович";
        catTwo.countEyes = 3;

        if(catOne.countEyes>=catTwo.countEyes){
            System.out.println(catOne.nameCat + " котистее");
        }else {
            System.out.println(catOne.nameCat + " не вау");
        }
    }
}
