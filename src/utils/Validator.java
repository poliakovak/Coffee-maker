package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Validator {

    public static int validateOptionInput(Scanner scanner) {

        Set<Integer> options = new HashSet<>(Arrays.asList(1, 2, 3));

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NOT_A_NUMBER_MSG, str);
        }
        int inputData = scanner.nextInt();

        while (!options.contains(inputData)) {
            System.out.println(Constants.NO_SUCH_OPTION_MSG);
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf(Constants.NOT_A_NUMBER_MSG, str);
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }
}
