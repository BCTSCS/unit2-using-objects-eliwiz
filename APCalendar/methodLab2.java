/**
 * Write a description of class methodLab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class methodLab2  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class methodLab2
     */
    public methodLab2()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void forLoop(int initial, int stop, int inc){
        for (int i = initial; i<stop; i=i+inc){
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void whileLoop(int total){
        int digitNum = 0;
        int digitAdd = 0;
        while (total % 10 != 0){
            digitNum+=1;
            digitAdd+= total%10;
        }
        System.out.println(digitNum + " digits totalling "+digitAdd);
    }
    
    public static void main(String[] args)
    {
        forLoop(2,90,5);
        forLoop(-10,8,2);
        forLoop(100,150,5);
        whileLoop(234);
        whileLoop(10000);
        whileLoop(123456789);
        whileLoop(2222);
    }
}

