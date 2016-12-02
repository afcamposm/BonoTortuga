package tortuga;
/**
 *
 * @author Felipe
 */
import ch.aplu.turtle.Turtle;

public class Cuadrado extends Thread{
  private Turtle turtle;

  Cuadrado(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
   for (int i = 0; i < 4; i++)
     segment(turtle);
 }

 private void segment(Turtle t)
 {
     t.forward(50);
     t.right(90);
     
 }
}
