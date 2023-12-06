package designPattern.store.v2.util;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class SelectionStoreInputValidator {

    private static final Set<Integer> VALID_NUMBERS = new HashSet<>(Arrays.asList(1, 2, 3));

    public static boolean isInputValid(String input) {
        return isNotNullOrEmpty(input) && containsOnlyValidNumbers(input);
    }

    private static boolean isNotNullOrEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    private static boolean containsOnlyValidNumbers(String input) {
        String[] parts = input.split(",");
        for (String part : parts) {
            if (!isNumberValid(part.trim())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNumberValid(String numberStr) {
        try {
            int number = Integer.parseInt(numberStr);
            return VALID_NUMBERS.contains(number);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
