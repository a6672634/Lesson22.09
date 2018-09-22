package com.google.qa.pet;

public class Dog {
    //Создать класс описывающий собаку. Свойства собаки цвет глаз, количество лап. Описать методы:
    //1. Метод который выводит в консоль цвет глаз
    //2. Метод, который выводит квадратный корень из числа лап в консоль
   public String colorEyesDog;
    public int countPaws;

   public void printDogEyesColorToConsole(){
        System.out.println(colorEyesDog);
    }

    public void getKorenIzChislsaLap(){
        System.out.println(Math.sqrt(countPaws));
    }
}
