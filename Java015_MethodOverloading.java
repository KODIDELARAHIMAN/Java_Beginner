
public class Java015_MethodOverloading 
{
    /*
    Instead of having different methods for same type operations. having 
    one method for same type of operations is called method oveloading
    */
    
    //Non Method Oerloading
    
    static int UIMethod(int var31, int var32)
    {
        System.out.print("Addition of two integers : ");
        System.out.println(var31+var32);
        
        return 0;
    }
    
    static double DMethod(double var33, double var34)
    {
        
        System.out.println(var33+var34);
        return 0;
    }
    
    //Method Overloading
    
     static int AddMethod()
    {
       int var35 = 35;
       int var36 = 36;
        
       return var35+var36; 
    }
    
     static double AddMethod( double var37, double var38)
    {
        
        return var37+var38;
    }
    public static void main(String[] args) {
        //Non Method Overlaoding executions
        UIMethod(2, 4);
        DMethod(33.0, 34.0);
        
        //method overloading executions
        System.out.println(AddMethod(37.8, 38.9));//double method
        System.out.println(AddMethod());//int method
        /*
        method name and operation same but parameteres are different
        */
    }
}
