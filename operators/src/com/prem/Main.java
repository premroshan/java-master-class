package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result - 1; //3 -1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5 ;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 mod 3 = " + result);

        //result = result + 1
        result++; // 1 + 1
        System.out.println("One plus one = " + result);

        result--;
        System.out.println("Two minus one = " + result);

        result += 2; // result = result + 2
        System.out.println("One Plus two = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 -2 =" + result);

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared of aliens");
        }

        int topscore = 100;
        if(topscore == 100){
            System.out.println("That's a high score");
        }
        if(topscore != 100){
            System.out.println("Not a high score");
        }
        if(topscore >= 100){
            System.out.println("Could be higher");
        }

        int secondTopScore = 60;
        if( ( topscore > secondTopScore ) && ( topscore < 100 )){
            System.out.println("Greater than second top score but less than 100");
        }

        if( ( topscore > secondTopScore ) || ( topscore < 100 )){
            System.out.println("Greater than second top score or less than 100");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is a new value");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("Not a car");
        }

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        int ageOfClient = 20;
        boolean greateThanEighten = (ageOfClient >= 18 ) ? true : false;

        System.out.println(greateThanEighten);
    }
}
