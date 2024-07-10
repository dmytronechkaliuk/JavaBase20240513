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
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Be patient. There is little time left until Friday");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a good time to visit The Eiffel Tower");
                break;
            default:
                System.out.println("Error. Invalid day...");
                break;
        }

    }

}
