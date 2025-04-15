import java.util.ArrayList;

public class Main {
    // starting point for all Java programme
    public static void main(String[] arg) {

        // equivalent to console.log - Hello worl as parameter
        System.out.println("Hello World HAHAHAH");

        // values = different kind of data that the programming language knows. Type of
        // variables.
        // type of the variable must be defined when we create a new variable. In Java,
        // string can only be defined using "".
        String Something = "";

        // Numbers in Java - state the type of number
        // integers
        int secretOfLife = 42;
        // double precision (aka double is the default
        doubel pi = 3.14;
        // floating point (aka float) -- having double prevision is overkill sometimes.
        float gstPercentage = 0.09f;
        // There are different type of integers
        // int short long byte

        // boolean are varuables that are either true of false
        boolean isRaining = true;
        // char data type = characters - 1 char represents 1 character in a string.
        char alphabet = 'A';
        // can only store only alphabet and uses single quote.
        //
        // reference datatype: arrats, objects from javascript. Array in JS is actually
        // knows as Arraylist in other programme languages.
        // array basically stores more than one value but all elements in the array must
        // be of the same data type, and the Size is fixed. Maximum number of elements
        // is fixed at the time of definition.
        // an array that can store 100 integers
        int[] numbers = new int[100];
        numbers[0] = 11;
        System.out.println(numbers[0]);
        int[] primes = { 1, 3, 7, 9, 11 }; // size is fixed.
        // ArrayList - Java equivalent to Array in Javascript. In other languages, in C
        // or C+, it is known as Vector, giving you the ability to store the amount of
        // variables you want and still have the array capabilties.

        // creatae a new variable named luckyNumber that can store an ArrayList Integer.
        // Usually written as one line
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

        luckyNumbers.add(10);
        luckyNumbers.add(11);

        // objects
        // let book = {"title": "How to Make Friends and Influence People",
        // "categorry":"self-help"}
        // OBJECTS in JS are usually known as MAP or hashtable in other programming
        // languages.

        HashMap<String, Integer> dayInMonths = new HashMap<String, Intger>();
        dayInMonths.put(key = "Jan", value = 31); // first parameter is the key, second paramet is value
        dayInMonths.put(key = "Feb", value = 28);
        System.out.println("Number of days in Feb = " + dayInMonths.get(key = "Feb"));

    }
}