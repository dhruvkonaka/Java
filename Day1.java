public class Day1 {
    public static void main(String[] args) {
        // All of our code goes here, in the main method

        // Printing methods
        System.out.println("Hello World!");
        System.out.print("Dhruv");
        System.out.println(" is my name.");

        // Variables
        int num = 5; //int is used for whole numbers
        double dub = 20.45; //double is used for decimal values
        String name = "Dhruv"; //String is used for words + phrases
        boolean bool = true; //boolean is used for true/false values (like a switch)

        // Variable Naming
        name = "Melvin";
        String nameInAllCaps = "MELVIN"; //camel case variable naming

        System.out.println(dub);
        System.out.println(num);
        System.out.println(name);
        System.out.println(bool);

        // Example: Storytelling
        String animal = "bear";

        System.out.println("The quick brown " + animal + " jumped over the lazy dog. The " + animal + " is cool!"); // This is called concatenation

        // Escape Characters
        System.out.println("Hello\tWorld!"); // \t is used for entering a tab
        System.out.println("Hello\nworld"); // \n is used for entering a new line
        System.out.println("\"Hello\" World!"); // \" is used for double quotes, similar to \' for single quotes and \\ for backslashes

        // Integer and Double Operations
        int points = 2;
        int other = 5;
        double result = (double)points/other; // casting a variable

        // The below statements do the same addition
        points = points + 1000;
        points += 1000;

        // Incrementing or Decrementing
        points++;
        points--;

        System.out.println(points);

    }
}