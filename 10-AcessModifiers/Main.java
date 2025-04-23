import java.util.Scanner;

class Animal {
    private String name;
    private String species;
    private String owner;
    private int months; // cannot be negative, cannot be 0 month
    // setters    // can click and "Create setters"

    public void setName(String name) {
        this.name = name;
    }

    // getter and setters
    // getters are basically methods fucntions in a class that returns the value of
    // a field.
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getOwner() {
        return owner;
    }

public int getMonths(){
    return months;
}

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal pet = new Animal();

        String animalName = sc.nextLine();
        String owner = sc.nextLine();
        int months = sc.nextInt();

        pet.setName(owner);
        name = animalName;
        pet.setOwner = owner;
        
        if (months <= 0)
            ;

    }
}