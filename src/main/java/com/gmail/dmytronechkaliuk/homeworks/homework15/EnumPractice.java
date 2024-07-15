package com.gmail.dmytronechkaliuk.homeworks.homework15;

public class EnumPractice implements Adviser {

    public static void main(String[] args) {
        EnumPractice day = new EnumPractice();

        day.advise(Day.MONDAY);
        day.advise(Day.FRIDAY);
        day.advise(Day.SUNDAY);
    }

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY
                    -> System.out.println("Be patient. There is little time left until Friday");
            case FRIDAY -> System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY -> System.out.println("It's a good time to visit The Eiffel Tower");
            default -> System.out.println("Error. Invalid day...");
        }

    }

}
