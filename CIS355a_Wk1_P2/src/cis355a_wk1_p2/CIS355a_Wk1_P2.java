/**************************************************** 
Program Name: CIS355A_Wk1_P2.java
Programmer's Name: Payden Boughton
Program Description:  takes cost of building give 80% of cost as recommended insurance policy
***********************************************************/
package cis355a_wk1_p2;

import java.text.NumberFormat;
import java.util.Scanner;

public class CIS355a_Wk1_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        double buildingCost,insureCost;
        
        System.out.println("Please enter the cost of a building: ");
        buildingCost = input.nextDouble();
        insureCost = calcInsure(buildingCost);
        
        System.out.println("The Amount of Insurance you should have is: " + formatter.format(insureCost));   
    }
    
    public static double calcInsure(double x)
    {
        double answer;
        
        answer = x * 0.80;

        return answer;
    }
    
}
