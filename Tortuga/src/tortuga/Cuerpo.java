package tortuga;
/**
 *
 * @author Felipe
 */
import ch.aplu.turtle.Turtle;

public class Cuerpo extends Thread{
  private Turtle turtle;

  Cuerpo(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run(){
    segment(turtle);
    }

 private void segment(Turtle t){
    for(int i = 0; i < 4; i++){
        t.forward(150);
        t.right(90);
        }
    
    t.penUp();
    t.right(90);
    t.forward(20);
    t.left(90);
    t.forward(90);
    t.penDown();
    
    t.forward(40);
    t.right(90);
    t.forward(110);
    t.right(90);
    t.forward(40);
    t.right(90);
    t.forward(110);
    
    t.penUp();
    t.right(90);
    t.forward(15);
    t.right(90);
    t.forward(10);
    t.penDown();
    
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
        t.forward(15);
        t.left(120);
        }
        t.penUp();
        t.forward(25);
        t.penDown();
    }
    
    t.penUp();
    t.right(90);
    t.forward(60);
    t.right(90);
    t.forward(10);
    t.penDown();
    
    for(int j = 0; j < 3; j++){
        for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.left(1);
        }
        t.penUp();
        t.forward(45);
        t.penDown();
    }
    
    }
}
