package ControlFlow;

public class SwitchStatementChallenge {
    public static void switchChallenge1() {
        char a = 'a';
        switch (a) {
            case 'a' -> System.out.println("Able");
            case 'b' -> System.out.println("Baker");
            case 'c' -> System.out.println("Charlie");
            case 'd' -> System.out.println("Dog");
            case 'e' -> System.out.println("Echo");
        }
    }

    public static String enhancedSwitchStatementMonth(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "Septemer" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "No month given";
        };

    }

    public static String returnDayOfWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Error";
        };
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Error in input";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}

