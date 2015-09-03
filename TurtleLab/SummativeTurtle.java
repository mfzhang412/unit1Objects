import java.awt.Color;

public class SummativeTurtle
{
    public static void main(String[] args)
    throws InterruptedException
    {
        World turtleWorld = new World(735,551);
        Picture picture = new Picture("C:\\Users\\mfzhang\\Downloads\\Turtle Image.jpg");
        turtleWorld.setPicture(picture);
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle1.setBodyColor(Color.BLUE);
        turtle2.setBodyColor(Color.GREEN);
        turtle3.setBodyColor(Color.YELLOW);
        turtle4.setBodyColor(Color.BLACK);
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle4.penDown();
        turtle1.forward(100);
        turtle2.turn(180);
        turtle2.forward(100);
        turtle3.forward(75);
        turtle3.turn(-120);
        turtle4.forward(25);
        turtle4.turn(90);
        turtle4.forward(100);
        
        int loopVal;
        for (loopVal = 0; loopVal < 126; loopVal++) {
            turtle1.turn(-90);
            turtle2.turn(90);
            turtle3.turn(90);
            turtle4.turn(90);
            turtle1.setPenColor(Color.RED);
            turtle2.setPenColor(Color.MAGENTA);
            turtle3.setPenColor(Color.BLACK);
            turtle4.setPenColor(Color.GREEN);
            turtle1.forward(100);
            turtle2.forward(100);
            turtle3.forward(150);
            turtle4.forward(100);
            turtle1.turn(-90);
            turtle2.turn(90);
            turtle3.turn(-90);
            turtle4.turn(90);
            turtle1.setPenColor(Color.ORANGE);
            turtle2.setPenColor(Color.BLUE);
            turtle3.setPenColor(Color.GRAY);
            turtle4.setPenColor(Color.PINK);
            turtle1.forward(100);
            turtle2.forward(100);
            turtle3.forward(150);
            turtle4.forward(100);
            turtle1.turn(-90);
            turtle2.turn(90);
            turtle3.turn(-90);
            turtle4.turn(90);
            turtle1.setPenColor(Color.YELLOW);
            turtle2.setPenColor(Color.CYAN);
            turtle3.setPenColor(Color.lightGray);
            turtle4.setPenColor(Color.RED);
            turtle1.forward(100);
            turtle2.forward(100);
            turtle3.forward(150);
            turtle4.forward(100);
            turtle1.turn(-15);
            turtle2.turn(15);
            turtle3.turn(-15);
            turtle4.turn(15);
            Thread.sleep(25);
        }
    }
}
        