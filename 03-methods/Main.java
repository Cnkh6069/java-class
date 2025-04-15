// every variable and functions in a Java Program must be inside a class, 
//a class is a collection of data aka variable and functions.

public class Main {
    // functions in Java are known as methods. JS also have methods, if a functions
    // is stored inside an object as a value, then it is known as a method.
    public static void main(String[] args) {
        // void is the return type for methods.
        int sum = addTwo(3, 4);
        // Java support string concatenation - combine two strings together

        System.out.println("Sum =" + sum);

        // sout as shortcut
    }
//step to writing a function/method
//1. what is the name of the function or method
//2. what is the parameets of the function
//3. what the return value 
//4. what is the return type
public static double calculateArea (double length, double width){
    double area = length * width;
    return area;
}
public static void greet(){
    System.out.println("Happy New Year");
}
    // a method to add two integers together and return their sum
    public static int addTwo(int x, int y) {
        return x + y; // datatype return in x+y must match the datatype of the method.
    };
}