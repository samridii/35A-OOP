package Task.week2;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        /*System.out.println
         * 'sout'
         */
        System.out.println("This line breaks");
        /*System.out.print */
        System.out.println("This will not break");
        System.out.print("This will continue");
    
    /*System.out.print ()
    %s String, %d integer, %f floating point, %b boolean
    */
    System.out.printf("Hello %s, Good Morning","World");
    System.out.printf("This is a num %d",10);
    /*Multi format*/
    System.out.printf("Both float %f and %b",10.3f,false);



    // Scanner scan=new Scanner(System.in);
    // System.out.println("The following takes sentence");
    // String name=scan.nextLine();
    // System.out.println("The following takes integer");
    // int age=scan.nextInt();
    // System.out.println("The following takes boolean");
    // boolean boolInput=scan.nextBoolean();
    // scan.close();
    


    /*Task Classwork
     * Make new Scanner Object?Variable called scan1
     * Prompt the following for Input
     * What is your name?-save as String in name var;
     * Over 18?-Save as int in sibling var,
     * Print the following
     * "Hello name,
     * Status?status
     * You have num of siblings
     */
    

    Scanner scan1=new Scanner (System.in);
    System.out.println("What is your name?");
    String name1=scan1.nextLine();
    System.out.println("Over 18?");
    boolean status=scan1.nextBoolean();
    System.out.println("How many siblings?");
    int sibling=scan1.nextInt();
    System.out.println("Hello"+name1);
    System.out.println("Status? "+status);
    System.out.printf("You have %d num of siblings", sibling);
    scan1.close();


    


   }
}


