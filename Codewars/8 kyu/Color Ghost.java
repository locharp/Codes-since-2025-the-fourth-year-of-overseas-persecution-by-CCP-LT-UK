import java.util.*;





public class Ghost
{
    String[] colors = { "white", "yellow", "purple", "red" };
    Random random = new Random();
    String color;





    Ghost
    ()
    {
        color = colors[random.nextInt( colors.length )];
    }





    String
    getColor
    ()
    {
        return color;
    }
        
}
