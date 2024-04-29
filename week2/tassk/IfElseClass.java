package Task.week2.week3;

public class IfElseClass {
    public static void main(String[] args) {
        /*If statement */
        if(true){
            System.out.println("True statement");
        }
        //the parenthesis takes a boolean expression
        int num1=10,num2=20;
        if(num1==num2){
            System.out.println("Equal");
        }else{
            System.out.print("Not equal");
        }
        /*Note that the else statement is always optional */
        /*If else if */
        if (num1==num2){
            System.out.println("Equal");
        }
        else if(num1<num2){
            System.out.println("Lesser");
        }
        else{
            System.out.println("Greater");
        }
        /*Note that else should be at last when using else if  */
        /*If else if ladder */
        if(num1==num2){
            System.out.print("Equal");  
        }else if (num1>num2){
            System.out.print("Greater");
        }else if(num1!=num2){  
            System.out.println("Not equal");
        }else if (num1>0){
            System.out.println("Positive");
        }else{
            System.out.println("Default statement");
        }
        /*When a  */

    
        /* When a condition is matched it will skip all remaining statement */
        /*Nested If else */
        if(num1>0){
            if(num1>num2){
                System.out.println("Positive greater");
            }else{
                System.out.println("Positive lesser");
            }
        }else{
            if(num1>num2){
                System.out.println("Negative greater");
            }else{
                System.out.println("Negative lesser");
            }
        }


    /*TASK
     *Conside rthe following 
     *Calculate the total and average and save in variable accordingly
     *if any of the markings is less than 35,print"Fail"
     *if the average is less than 60, print"Third division"
     *if the average is less than 70, print"Second division"
     *if the average is less than 80, print"1st division"
     *if the average is greater than 80, print"Distinction"
     *if the average is negative or over 100,print"Invalid marking
     */
    int math=34,science=70,english=50;
    int total=math+science+english;
    double average=total/3;
    if(math<35||science<35||english<35){
        System.out.println("Fail");
    }
    else if(average<60){
        System.out.println("Third division");
    }else if(average<70){
        System.out.println("Second division");
    }else if(average<80){
        System.out.println("1st division");
    }else if(average>80){
        System.out.println("Distinction");
    }else if(average<0||average>100){
        System.out.println("Invalid marking"); 
    }

    }
  }
