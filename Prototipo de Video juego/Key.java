import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    String key;
    String sound;
    String upImage;
    String downImage;
    boolean isPressed;
    public Key(String keyName, String soundFile, String upImage, String downImage)
    {
        setImage(upImage); 
        key = keyName; // Los botones del teclado
        sound = soundFile; // El nombre del sonido 
        this.upImage = upImage; // El imagen que se pone al no presionar ningun boton en el teclado
        this.downImage = downImage; //El imagen que se pone al presionar algun boton en el teclado
    }
    public void act()
    {
        keyPressed();
    }
    public void keyPressed()
    {
       if(Greenfoot.isKeyDown(key) && !isPressed) // cuando el boton del teclado esta pressed, se cambia al otro imagen. 
        {
            setImage(downImage);
            isPressed = true;
        }
       if(!Greenfoot.isKeyDown(key) && isPressed) 
       {
           setImage(upImage);
           playSound();
           isPressed = false;
           
        }
    }
    public void playSound() //para poner los sonidos del piano. 
    {
        Greenfoot.playSound(sound);
    } 
}
