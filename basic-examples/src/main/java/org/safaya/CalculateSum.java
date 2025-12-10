package org.safaya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculateSum {

    private static final Logger logger = LoggerFactory.getLogger(CalculateSum.class);
    private static final int SLEEP_DURATION_IN_SECONDS = 2;

    public static void main(String[] args) {
        logger.info("##### Program Start #####");

        CalculateSum calculateSum = new CalculateSum();

        calculateSum.sleep(SLEEP_DURATION_IN_SECONDS);
        logger.info("This is a program to calculate Sum of two numbers.");

        int sum = calculateSum.addNumbers(10, 30);

        calculateSum.sleep(SLEEP_DURATION_IN_SECONDS);
        logger.info("Result is : " + sum);

        calculateSum.sleep(SLEEP_DURATION_IN_SECONDS);
        logger.info("##### Program end #####");
    }

    public int addNumbers(int num1, int num2) {
        int result = num1 + num2;

        this.sleep(SLEEP_DURATION_IN_SECONDS);
        logger.info("Sum of the two numbers is : " + result);

        return result;
    }

    private void sleep(int secondsToSleep) {
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException e) {
            System.err.println("Got an exception during thread sleep : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
