package com.google.qa.pet.ranner;

import com.google.qa.pet.Cat;
import com.google.qa.pet.Dog;

import java.util.Random;

public class Zadanie {
    // В новом классе сщздать два экземпляра собаки
    //1. Заполнить поля случайными значениями.
    //2. Для обоих экземпляров вызвать оба метод
    //3. Сраввнить цвет глаз обоих собак и в случае если они одинаковые написать что они родственники.
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.colorEyesDog = "broun";
        dogOne.countPaws = 3;
        dogOne.getKorenIzChislsaLap();
        dogOne.printDogEyesColorToConsole();


        System.out.println(dogOne.colorEyesDog);

        Dog dogTwo = new Dog();
        dogTwo.colorEyesDog = "red";
        dogTwo.countPaws = 2;
        dogTwo.printDogEyesColorToConsole();
        dogTwo.getKorenIzChislsaLap();

        System.out.println(dogTwo.colorEyesDog);

        if(dogOne.colorEyesDog==dogTwo.colorEyesDog){
            System.out.println("Родственники");
        }else {
            System.out.println(" Не родные ");
        }



    }
}