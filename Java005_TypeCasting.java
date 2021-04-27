
public class Java005_TypeCasting 
{
    public static void main(String[] args) 
    {
        //type casting is convertind one datetype into another datatype
        
        /*
        narrow casting
        
        byte->short->int->long->float->double
        
        */
        int var11 = 23;
        double var12 = var11; //converting int to double
        
        System.out.println("Converting int to double\n"
                + "var11: "+var11
        +"\nvar12: "+var12);
        
        /*
        wide casting
        
        double->float->long->int->short->byte
        
        */
        double var13 = 56.26;
        int var14 = (int)var13; //converting double to int
        
        System.out.println("Converting double to int\n"
                + "var13: "+var13
        +"\nvar14: "+var14);
    }
}
