package Task.week2.week3;

public class ForLoop {
    public static void main(String[] args) {
        for(int index=0;index<4;index++){
            System.out.println("Looping"+index);
        }
         /*Make the table of the following */
         for(int index = 10; index >=0; index--){
            System.out.println("Looping Decrement" + index);
        }
/* Task
 * Use loop to multliplication table of 2
 * Print the following
 * 2x1=2
 * 2x2=4
 * ..
 * 2x10=20
 */

  /*Nested for loop
   * Loop inside loop*/
  for(int outer=0;outer<2;outer++){
    for(int inner=2;inner>=0;inner--){
        System.out.println("Inner"+inner);
    }
    System.out.println("Outer"+outer);


    /*Task */
   /*Make a multiplication table like the example
              * Multiplication of 1
              * 1 x 1 = 1
              * 1 x 2 = 2
              * ..
              * 1 x 10 = 10
              * ...
              * Multiplication of 5
              * 5 x 1 = 5
              * 5 x 2 = 10
              * ..
              * 5 x 10 = 50
              */
              for (int out=1;out<=5;out++) {
                System.out.println("Multiplication of " + out);
                for (int inner = 1; inner <= 10; inner++) {
                    System.out.println(out+ "x" + inner + "=" + (out * inner));

                }           

   }
  }   
 }
}
