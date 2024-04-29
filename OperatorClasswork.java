package Task;

public class OperatorClasswork {
    public static void main(String[] args) {
    /*Task1
         * write a program to print whether a  variable is greater or equal to 18
         */
        /*Relational operator */
        int x=20,y=18;
        boolean rExpression = x==y;
        System.out.println("Is rNum1 greater or equal to rNum2"+(x>=y));

        /*Task2
         * Write a program  to print simple interest from variables
         * make 3 variable for amount,time and rate and save the calculation into variable
         * Formula:
         * si=amount*time*rate/100;
         */
        float amount=(float) 10000.99,time=(float) 2.4,rate=10;
        float si=amount*time*rate/100;
        System.out.println("Simple interest is "+si);

        /*Task3
         * Write a program to print the area and perimeter of rectangle\
         * a=l*b
         * p=2(l+b)
         */
        int l=10,b=20;
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("Area of rectangle is "+area);
        System.out.println("Perimeter of rectangle is "+perimeter);


        /*Task4 
         * Complete the task 1 using ternary operators
         */
        int m=10,n=20;
        String output=m>n? "m is greater than n":"m is less than n";
        int outputNumb=m<n?10:20;
        System.out.println(output);
        System.out.println(outputNumb);

        /*Task5 
         *  Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
         Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;
         */
        int length=10,width=20,height=30;
        int volumeOfCuboid=length*width*height;
        int volumeOfCube=length*length*length;
        System.out.println("Volume of Cuboid is "+volumeOfCuboid);
        System.out.println("Volume of Cube is "+volumeOfCube);

        /*Task 6
         * Write a program to take two integer inputs from the user and print the sum and product of them
         */
        int num1=10,num2=20;
        int sum=num1+num2;
        int product=num1*num2;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
        System.out.println("Product of "+num1+" and "+num2+" is "+product);
    

        /*Task 7
         * Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
         */
        int c=20,d=10;
        int sumoftwo=c+d;
        int productoftwo=c*d;
        int sumProduct=sumoftwo/productoftwo;
        System.out.println("Sum of "+c+" and "+d+" is "+sumoftwo);
        System.out.println("Product of "+c+" and "+d+" is "+productoftwo);
        System.out.println("Division of "+sumoftwo+" and "+productoftwo+"  is "+sumProduct);


        /*Task 8
         * Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz
         */
        String name="Abigail";
        int rollNumber=10;
        String fieldOfInterest="Java";
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNumber+". My field of interest are "+fieldOfInterest);
        

        /*Task 9
         * Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
         */
        int side=10;
        int areaOfSquare=side*side;
        int perimeterOfSquare=4*side;
        System.out.println("Area of square is "+areaOfSquare);
        System.out.println("Perimeter of square is "+perimeterOfSquare);
        




        
    }  
}



    

