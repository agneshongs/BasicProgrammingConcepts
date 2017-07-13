/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asghong.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author agnes
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int userAge = getUserAge();
        int maxRate;
        double lowTarget;
        double highTarget;
        
        maxRate = 220 - userAge;

        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute");
        
        lowTarget = maxRate * .5;
        highTarget = maxRate * .85;
        System.out.println("Your target HR Zone is " + Math.round(lowTarget)+ "-" + Math.round(highTarget) + " beats per minute");
    }
    
    public static int getUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int a = sc.nextInt();
        return a;
    }
}
