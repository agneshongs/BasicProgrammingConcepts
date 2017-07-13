/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asghong.summativesums;

/**
 *
 * @author agnes
 */
public class SummativeSums {
    public static void main(String[] args) {
    int arrayOne[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15};
    int arrayTwo[] = { 999, -60, -77, 14, 160, 301 };
    int arrayThree[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                         140, 150, 160, 170, 180, 190, 200, -99 };
    
    int arrayOneSum = getArraySum(arrayOne); 
    System.out.println("#1 Array Sum: " + arrayOneSum);
    int arrayTwoSum = getArraySum(arrayTwo);
    System.out.println("#2 Array Sum: " + arrayTwoSum);
    int arrayThreeSum = getArraySum(arrayThree); 
    System.out.println("#3 Array Sum: " + arrayThreeSum);
            
    
    }
    
    public static int getArraySum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { 
           sum = sum + array[i];
       }
      return sum; 
    }
    
}
