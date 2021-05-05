package eu.senla.JavaLaboratory3.services;

import eu.senla.JavaLaboratory3.context.Context;

public class TaskOneService {

    public static String maxDigit(int number) {
        return Integer.toString(Integer.toString(number).chars().max().getAsInt() - '0');
    }

    public static String sumOfFirstDigit(int numberOne, int numberSecond, int numberThree) {
        return Integer.toString(numberOne / 100 + numberSecond / 100 + numberThree / 100);
    }

    public static int concatenationOfNumbers(int numberOne, int numberSecond) {
        return numberOne * 1000 + numberSecond;
    }

    public static int sumOfDigits(int number) {
        //a->Character.getNumericValue(a)
         return Integer.toString(number).chars().map(Character::getNumericValue).sum();
    }

    /**
     * @param max exclusive
     * @param min inclusive
     * @return int
     */
    public static int generateRandomInt(int min, int max) {
        return Context.random.nextInt(max - min) + min;
    }

}
