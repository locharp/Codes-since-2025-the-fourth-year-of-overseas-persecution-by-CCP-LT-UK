import java.util.*;





public class TheOffice
{
        static HashMap < String, Integer > map = new HashMap <>
        (
            Map.of
            (
                "accounts", 1,
                "finance", 2,
                "canteen", 10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail", 5,
                "cleaning", 4,
                "pissing about", 25
            )
        );
    
    
    
    
    
    public static
    String
    boredom
    (
        Person[] staff
    )
    {
        int score = 0;
        
        
        for
        (
            Person p
            : staff
        )
        {
            score += map.get( p.department );
        }
        
        
        if
        (
            score > 100
        )
        {
            return "party time!!";
        }
        else if
        (
            score > 80
        )
        {
            return "i can handle this";
        }
        else
        {
            return "kill me now";
        }
        
    }
    
}
