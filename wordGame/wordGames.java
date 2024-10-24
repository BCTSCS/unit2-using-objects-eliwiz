import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wordGames extends Actor
{
    /**
     * Act - do whatever the wordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img;
    private String word;
    
    public wordGames(String text){
        word = text;
        img = new GreenfootImage(word, 24, Color.BLACK, Color.PINK);
        setImage(img);
    }
    
    public String scramble(){
        // switch first half
        // and second half
        img = new GreenfootImage(word.substring(word.length()/2) + word.substring(0, word.length()/2), 24, Color.BLACK, Color.PINK);
        setImage(img);
        return word.substring(word.length()/2) + word.substring(0, word.length()/2);
    }

    public String bananaSplit(int insertIdx, String insertText){
        // Insert insertText at the position
        // insertIdx
        img = new GreenfootImage((word.substring(0, insertIdx) + insertText + word.substring(insertIdx)), 24, Color.BLACK, Color.PINK);
        setImage(img);
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }

    public String bananaSplit(String insertChar, String insertText){
        // Insert insertText after the first
        // occurence of the insertChar
        img = new GreenfootImage(( word.substring(0, word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar))), 24, Color.BLACK, Color.PINK);
        setImage(img);
        return word.substring(0, word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar));
    }

    public String toString(){
        // Games[word]
        return "[" + word + "]";
    }
    
    public void act()
    {
        wordGames word = new wordGames("hello");
        scramble();
        Greenfoot.delay(100);
        int index=Greenfoot.getRandomNumber("hello".length());
        bananaSplit(index, "Hello");
        Greenfoot.delay(100);
       
        bananaSplit("e", "World");
        Greenfoot.delay(100);
    }
}
