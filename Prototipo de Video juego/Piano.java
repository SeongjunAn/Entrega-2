import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piano extends World
{
    String[] whiteKeys = {"a", "s","d", "f","g", "h","j", "k","l", "ñ", "{", "}" }; // Son las letras del teclados que se usan para tocar las teclas naturales, o los blancos. 
    String[] whiteKeySound = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"}; //Son los sonidos que se suena al tocar las letras para las teclas naturales. 
    String[] blackKeys = {"w", "e","r", "t","y", "u","i", "o","p", "", "+"};// Son las letras del teclados que se usan para tocar las teclas sostenidas o los negros
    String[] blackKeysSound = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"}; // Es el sonido del piano que suena al tocar las letras del tecla para teclas sostenidas. 
    /**
     * Constructor for objects of class Piano.
     * 
     */
    public Piano()
    {    
        
        super(800, 340, 1); 
        prepare();
    }
    private void prepare()
    {
        for(int i = 0; i < whiteKeys.length; i++) 
        {
            Key key = new Key(whiteKeys[i], whiteKeySound[i] + ".wav", "white-key.png", "white-key-down.png" ); // Poner el imagen del tecla blancas, despues al presionar el boton para las teclas blancas suena el sonido especifico, y se cambia a un otro imagen. 
            addObject(key, 54 + i * 63, 130); // El posicion de las teclas blancas. 
        }
        for(int i = 0; i < blackKeys.length; i++)
        {
            if (blackKeysSound[i] != "") // Es para las teclas negras que no tienen ningun boton de teclado especifico, como las teclas negras no estan siempre. 
            {
                Key bkey = new Key(blackKeys[i], blackKeysSound[i] + ".wav", "black-key.png", "black-key-down.png"); //Lo mismo que las teclas blancas del arriba. 
                addObject(bkey, 86 + i * 63, 86);
            }
        }
    }
}
