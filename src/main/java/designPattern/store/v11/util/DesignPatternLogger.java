package designPattern.store.v11.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class DesignPatternLogger {
    private static final Set<String> usedPatterns = new LinkedHashSet<>();

    public static void logPattern(String patternName) {
        usedPatterns.add(patternName);
    }

    public static void displayUsedPatterns() {
        System.out.println("Used Design Patterns:");
        usedPatterns.forEach(System.out::println);
    }
}
