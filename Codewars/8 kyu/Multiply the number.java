public class Kata
{
    
    public static
    int
    multiply
    (
        int number
    )
    {
        int answer = number;
        
        
        while
        (
            number != 0
        )
        {
            answer *= 5;
            number /= 10;
        }
        
        
        return answer;
    }
    
}
