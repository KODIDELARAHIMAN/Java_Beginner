
public class Java012_ForLoop 
{
    public static void main(String[] args) 
    {
        //for loops are two types
        
        //1st type
        
        for(int var25 = 0; var25<=5; var25++){
            System.out.println(var25);
        }
        System.out.println();
        
        //2nd type
        int var26[] = {23, 56, 89, 78, 45, 12};
        for(int ivar26 : var26){
            System.out.println(ivar26);
        }
      System.out.println();
        String[] var27 = {"11","22","33","44","55"};
        for(int ivar27 = 0; ivar27<var27.length; ivar27++){
            System.out.println(var27[ivar27]);
        }
    }
}
