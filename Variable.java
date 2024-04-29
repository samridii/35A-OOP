package Task;
   
public class Variable {
    /*instance variable needs object to accessed
     * Value is not shared
     * 
     */
    int instanceVariable=10;
    /*static variable doesnot need object to access
    Value is shared among objects
     */
    static int staticVariable=100;
    
    public static void main(String[] args) {
        /*Primitive Data Types 
        already defined in programming language*/
        
        byte byteValue=100;//the following cannot be done again it can only be declared once not more
        byteValue=10;
        short shortValue=200;
        int intValue=-199;
        long longValue=10000;
        float floatValue=2.15f;
        double doubleValue=-90.223;
        char charValue= 'l';
        boolean booleanValue=false;
       
        /*non primitive datatypes 
         * not defined in programming language except(String)
         * Combination of primitive data type
        */

        String stringValue="This is a string value";
        int[] intArray=new int[5];
        Variable variableObject=new Variable();
        /*Use instance variable with Variable object */
        System.out.println(variableObject.instanceVariable);
        /*Use static variable with class itself*/
        System.out.println(Variable.staticVariable);

        byte defaultByteValue;
        /*Implicit casting smaller data type to larger */
        int newIntValue=10;
        double convertedInt=newIntValue;
        /*Explicit casting larger data type to smaller */
        double newDoubleValue=(int)newDoubleValue;
        int convertedDoubleValue=(int)

    }   
}

