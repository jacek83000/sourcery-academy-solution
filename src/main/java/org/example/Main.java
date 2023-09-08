package org.example;

import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        for (int i = fromYear; i <= toYear; i++) {
            String yearStr = String.format("%04d", i);
            yearStr = new StringBuilder(yearStr).reverse().toString();

            String monthStr = yearStr.substring(0, 2);
            String dayStr = yearStr.substring(2, 4);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);

            if (month <= 12 && month > 0) {
                int daysInMonth = YearMonth.of(i, month).lengthOfMonth();
                if (day <= daysInMonth && day > 0) {
                    System.out.println(i + "-" + monthStr + "-" + dayStr);
                }
            }
        }
    }
}