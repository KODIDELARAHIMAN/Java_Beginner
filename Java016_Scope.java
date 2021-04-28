
public class Java016_Scope 
{
    static void SCMethod()
    {
          // System.out.println(var39); --> This line cannot use var39
        // hence the above line is not java scope
             
        int var39 = 39;
        
        System.out.println(var39);
    }
    public static void main(String[] args) {
        SCMethod();
    }
}
