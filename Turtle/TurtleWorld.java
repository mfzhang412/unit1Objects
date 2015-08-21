import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
 throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        Thread.sleep(1000);
        turtle1.penUp();
        turtle2.penUp();
        turtle1.moveTo(250,250);
        Thread.sleep(1000);
        turtle2.moveTo(500,250);
        Thread.sleep(1000);
        turtle1.setPenColor(Color.RED);
        turtle1.penDown();
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.forward(50);
        turtle1.setShellColor(Color.RED);
        turtle2.setPenColor(Color.GREEN);
        turtle2.penDown();
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.forward(50);
        turtle2.setShellColor(Color.GREEN);
    }
}
