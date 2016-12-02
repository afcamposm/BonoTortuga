package tortuga;
/**
 *
 * @author Felipe
 */
import ch.aplu.turtle.Turtle;

public class Cabeza extends Thread{
  private Turtle turtle;

  Cabeza(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run(){
    segment(turtle);
    }

 private void segment(Turtle t){
    t.forward(5);
    t.right(90);
    t.forward(50);
    t.right(90);
    t.forward(5);
    t.right(90);
    t.forward(50);
    t.right(90);
    t.forward(5);

    t.left(90);
    t.forward(25);
    t.right(90);
    t.forward(55);
    t.right(90);
    t.forward(100);
    t.right(90);
    t.forward(55);
    t.right(90);
    t.forward(75);
    
    t.penUp();
    t.right(180);
    t.forward(5);
    t.left(90);
    t.forward(2.5);
    t.right(90);
    t.penDown();
    
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
        t.forward(10);
        t.left(90);
        }
        t.forward(10);
    }
    
    t.penUp();
    t.forward(5);
    t.left(90);
    t.forward(45);
    t.right(90);
    t.penDown();
    
    for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.right(1);
        }
    
    t.penUp();
    t.left(180);
    t.forward(50);
    t.penDown();
    
    for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.left(1);
        }
    
    t.left(90);
    t.penUp();
    t.forward(10);
    t.right(90);
    t.forward(5);
    t.right(90);
    t.penDown();
    
    for(int i = 0; i < 180; i++){
            t.forward(0.08);
            t.right(1);
        }
    
    t.left(90);
    t.penUp();
    t.forward(41);
    t.penDown();
    t.left(90);
    
    for(int i = 0; i < 180; i++){
            t.forward(0.08);
            t.right(1);
        }
    
    t.penUp();
    t.left(90);
    t.forward(30);
    
    }
    
}
