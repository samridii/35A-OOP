package Task.week2.week3;

public class SwitchClass {
    public static void main(String[] args) {
        char charValue='b';
        int intValue=10;
        switch(charValue){
            case'a':
                System.out.println("Apple");
                break;
            case'b':
               switch(intValue){
                case 10:
                       System.out.println("Ten");
                       break;
                case 20:
                       System.out.println("Twenty");
                       break;
               }
                System.out.println("Ball");
                break;
            case'c':
                System.out.println("Cat");
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No word found");
                break;
        }


        /*TASK
         * Switch case
         * 0-Sunday
         * 1-Monday
         * 2-Tuesday
         * 3-Wednesday
         * 4-Thursday
         * 5-Friday
         * 6-Saturday
         * any other-Invalid day
         */
        int day=2;
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
