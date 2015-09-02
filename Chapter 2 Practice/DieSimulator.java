import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random dice = new Random();
        int dieValue = dice.nextInt(6);
        dieValue += 1;
        System.out.println(dieValue);
        
        double dievalue2 = Math.random(); //returns [0, 1)
        dievalue2 *=6; //returns [0, 6)
        dievalue2 += 1;
        System.out.println((int) dievalue2);
        
        System.out.println(dice.nextInt(6) + 1);
    }
}