/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person  
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        x=50;
        y=32;
        speed=20;
        name= "Nameless";
        canTalk = false;
        System.out.print("Created ");
        System.out.print(name);
        System.out.print(" with speed of ");
        System.out.print(speed);
        System.out.print(" and can talk? ");
        System.out.println(canTalk);

    }
    public Person(String namePerson)
    {
        name= namePerson;
        System.out.print("Created ");
        System.out.println(name);
    }
    public Person(String namePerson, int personSpeed)
    {
        name= namePerson;
        speed = personSpeed;
        System.out.print("Created ");
        System.out.print(name);
        System.out.print(" with speed of ");
        System.out.println(speed);
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void walk()
    {
        // put your code here
        System.out.print(name);
        System.out.println("moved over 20 pixels");
    }
}
