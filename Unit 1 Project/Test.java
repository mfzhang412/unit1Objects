import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        String name = JOptionPane.showInputDialog("What is your name:");
        URL imageLocation = new URL(
            "http://images2.wikia.nocookie.net/__cb20130312005204/walkingdead/images/4/42/I-See-What-You-Did-There..png");
        JOptionPane.showMessageDialog(null, "Hello " + name, "Test",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}