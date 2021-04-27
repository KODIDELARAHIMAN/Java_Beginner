
public class Java004_DataTypes 
{
    public static void main(String[] args) 
    {
        //datatypes in java
        /*
        byte, short, int,long,  float, String, double, char, boolean
        */
        /*
        byte : for numbers--> -128 to 127 1byte 
        short : for numbers--> -32768 to 32767 2bytes
        int : for numbers--> -2147483648 to 2147483637 4bytes
        long : for numbers--> -9223372036854775808 to 9223372036854775807 8bytes
        doble : for decimal numbers--> can store upto 15 decimal points 8bytes
        String : for words that represent with aphostrophies
        char : for letter that represents with single aphostarphy
        */
        int var3 = 135165; 
        float var4 = 45.4f;
        double var5 = 67.23;
        String var6 = "Java Beginner";
        char var7 = 'J';
        byte var8 = 12;
        short var9 = 32752;
        long var10 = 232545375;
        
        System.out.println("var3 : "
                + var3
                +", var4 : "+var4
        +", var5 : "+var5
        +", var6 : "+var6
        +", var7 : "+var7
        +", var8 : "+var8
        +", var9 : "+var9
        +", var10 : "+var10);
    }
}
