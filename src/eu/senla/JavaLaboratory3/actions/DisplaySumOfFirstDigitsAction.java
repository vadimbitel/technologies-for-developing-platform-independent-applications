package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.TaskOneService;

public class DisplaySumOfFirstDigitsAction implements Action {
    @Override
    public void invoke(int index) {
        int numberOne = TaskOneService.generateRandomInt(100, 1000);
        System.out.println("First random number is " + numberOne);
        int numberSecond = TaskOneService.generateRandomInt(100, 1000);
        System.out.println("Second random number is " + numberSecond);
        int numberThree = TaskOneService.generateRandomInt(100, 1000);
        System.out.println("Third random number is " + numberThree);
        System.out.println("Sum of first digits is " +
                TaskOneService.sumOfFirstDigit(numberOne, numberSecond, numberThree));

    }
}
