class Solution
{
    
    public
    int
    maxBottlesDrunk
    (
        int numBottles
        , int numExchange
    )
    {
        int answer = numBottles;
        int exchange = numBottles / numExchange;
        
        
        while
        (
            numBottles >= numExchange 
        )
        {
            answer ++;
            numBottles -= numExchange - 1;
            numExchange ++;
        }
        
        
        return answer;
    }
    
}
