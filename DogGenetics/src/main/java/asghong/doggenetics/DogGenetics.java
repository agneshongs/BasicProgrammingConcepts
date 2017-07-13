/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asghong.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agnes
 */
public class DogGenetics {
    public static void main(String[] args) {
        String dogName;
        
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed AsianPug", "Common Cur", "King Doberman"};
        Scanner sc = new Scanner(System.in);
        System.out.println("What is yout dog's name?");
        dogName = sc.nextLine();
             
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        
        for (String dogBreed : dogBreeds) {
            int breedPercent = getBreedPercentage();
            System.out.println(breedPercent + "% " + dogBreed);
                    
        }
        
        System.out.println("Wow, that's QUITE the dog!");
       
        
    }
    
    public static int getBreedPercentage() {
        Random breed = new Random();
        int percent = breed.nextInt(100) + 1;
        return percent;
    }
}