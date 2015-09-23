/*
*Calvin McCoy
*Assignment 4
*/
package assign4;

import java.util.Scanner;

public class Assign4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("Who's Your Favorite Adventure Time Character?");
            System.out.println ( "1) Finn \n2) Jake \n3) Lemongrab \n4) Princess Bubblegum \n5) Marceline" );
            System.out.print("Choose a number: ");
            advTime(choice);
       
    }

    /**
     *run the switch/case
     * return to main
     * @param choice
     */
    public static void advTime(int choice){
        
     Scanner option = new Scanner(System.in);
     choice = option.nextInt();   
     switch(choice){
            case 1:
                System.out.println("Mathematical!");
                break;
            case 2:
                System.out.println("Easy Peesy, Livin' Greasy!");
                break;
            case 3:
                System.out.println("UNNACCEPTABLEEE!");
                break;
            case 4:
                System.out.println("You so Spice!");
                break;
            case 5:
                System.out.println("Vampire Kick!");
                break;
            default:
                System.err.println("It's Probably a Computal Gleetch");
                break;
    }
}
}