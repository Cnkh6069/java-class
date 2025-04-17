import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner class
        //class => is a container that can have data and methids (aka functions)
        //before we can use a class, we must create a new instance of the Scanner class (aka object)
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in); // System.in ==> keyboard
        String firstName = sc.next(); // ask user for a string and return it.But it will stop at the first white space
System.out.println("Welcome, "+ firstName); //when u use .next you need to create a keyboard Buffer

sc.nextLine();
System.out.println("Enter your address");
String address = sc.nextLine(); // capture input as string up to the end of the line(enter)
System.out.println("you stay at "+ address);
System.out.println("Enter your age");
int age = sc.nextInt();
System.out.println("Your age is: "+ age);
sc.nextline();


    }
}