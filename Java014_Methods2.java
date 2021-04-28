
public class Java014_Methods2 
{
    static void UMethod2(int var28, int var29)
            /*
            assiging variables inside a method is called parameters
            */
            
    //you need to metion type of datatype like void is for all dataypes
            
    {
        System.out.println(var28+var29);//addition
        System.out.println("Printing two numbers as String : "+var28+var29);
    }
   static String SUMethod()
   {
       String names[] = {"Amar", "Akbar", "Anthony"};
       for(String ivar30 : names){
           System.out.println(ivar30);
       }
    return null;//except void for all datatypes return statment must   
   }
    public static void main(String[] args) 
    {
        SUMethod();
        UMethod2(9,19);   
    }
}
