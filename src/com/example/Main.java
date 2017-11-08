package com.example;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while (count < 6) {
            System.out.println("Value is: " + count);
            count++;
        }

        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Value is: " + count);
            count++;
        }

        do{
            System.out.println("Value is: " + count);
            count++;

            if(count > 100){
                break;
            }

        } while (count != 6);

        System.out.println("" + isEvenNumber(13));

        int number = 5;
        int finishNumber = 20;

        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number :" + number);
            number++;
        }

    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

}