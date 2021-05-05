package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.TaskOneService;

public class DisplaySumOfDigitsAction implements Action {

    @Override
    public void invoke(int index) {
        int number = TaskOneService.generateRandomInt(100,1000);
        System.out.println("Random number is "+number);
        System.out.println("Sum of digits in number is " + TaskOneService.sumOfDigits(number));
    }
}
