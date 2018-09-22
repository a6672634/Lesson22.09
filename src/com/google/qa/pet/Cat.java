package com.google.qa.pet;

public class Cat {
   public String nameCat;
   public int countEyes;

   public char getFirstLetterName(){
       char[] letters = nameCat.toCharArray();
       return letters [0];
   }

  public void printCatNameToConsole(){
       System.out.println(nameCat);
   }

   public int getMultEyes(int i){
       System.out.println(countEyes*i);
       return countEyes*i;
   }
}
