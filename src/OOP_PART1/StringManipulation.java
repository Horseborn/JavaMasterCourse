package OOP_PART1;

public class StringManipulation {
    static void main() {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Starting index " + startingIndex);
        System.out.println("Birthyear = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("New date = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("new date = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("new date = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("new date = " + newDate);

        System.out.println(newDate.replace("/", "-"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "-"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("ABC\n".repeat(3).indent(8));
    }
}
