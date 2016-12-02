package tortuga;
/**
 *
 * @author Felipe
 */
import ch.aplu.turtle.Turtle;

public class Linea extends Thread{
  private Turtle turtle;

  Linea(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     this.turtle.back(100);
 }

}
