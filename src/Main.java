//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Animals in OOP!");
        Dog dog = new Dog("Buddy",3);

        Puppy newPuppy = new Puppy("Max",1);

        System.out.println("\n");

        dog.dogCredentials();
        dog.bark();

        System.out.println("\n");

        newPuppy.dogCredentials();
        newPuppy.bark();
        newPuppy.puppyCry();


    }
}