package talkingpets;

import java.util.Scanner;

import static talkingpets.Pets.createPet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What type of pet are each of your pets?");
        String[] typeOfPets = new String[numberOfPets];
        String[] namesOfPets = new String[numberOfPets];

        for (int i = 0; i < numberOfPets; i++){
            System.out.println("Enter the type of pet for pet #" + (i+1));
            typeOfPets[i] = scanner.nextLine();
        }
        System.out.println("What are the names of each of your pets?");
        for (int i = 0; i < numberOfPets; i++){
            System.out.println("Enter the name of pet #" + (i+1));
            namesOfPets[i] = scanner.nextLine();
        }
        System.out.println("Your pets and what they say:");
        for (int i = 0; i < numberOfPets; i++) {
            Pets pet = createPet(typeOfPets[i], namesOfPets[i]);
            System.out.println("Type: " + pet.getType() + ", Name: " + pet.getName());
            pet.speak();
        }
    }
}
