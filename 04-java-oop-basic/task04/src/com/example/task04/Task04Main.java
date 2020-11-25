package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

    }
    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1)
            throw new UserException(
                String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if (monthNumber / 3 == 1)
            return "весна";
        else if (monthNumber / 3 == 2)
            return "лето";
        else if (monthNumber / 3 == 3)
            return "осень";
        else
            return "зима";
    }
}
