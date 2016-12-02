package tortuga;
/**
 *
 * @author Felipe
 */
import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this, Color.red);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.red);
        Turtle hilo4 = new Turtle(this, Color.red);
        Turtle hilo5 = new Turtle(this, Color.red);
                
        hilo1.setPos(20, -150);
        hilo2.setPos(-80, -50);
        hilo3.setPos(-30, 100);
        hilo4.setPos(-10, 160);
        hilo5.setPos(70, 80);
        
        hilo1.setPenColor(Color.black);
        hilo2.setPenColor(Color.black);
        hilo3.setPenColor(Color.black);
        hilo4.setPenColor(Color.black);
        hilo5.setPenColor(Color.black);
        
        new Piernas(hilo1).start();
        new Cuerpo(hilo2).start();
        new Cabeza(hilo3).start();
        new Antena(hilo4).start();
        new Brazos(hilo5).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}