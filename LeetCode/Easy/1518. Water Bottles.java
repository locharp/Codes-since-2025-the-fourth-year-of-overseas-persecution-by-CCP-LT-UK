class Solution
{
    
    public
    int
    numWaterBottles
    (
        int numBottles
        , int numExchange
    )
    {
        int answer = numBottles;
        int exchange = numBottles / numExchange;
        
        
        while
        (
            exchange > 0
        )
        {
            answer += exchange;
            numBottles -= ( exchange * numExchange ) - exchange;
            exchange = numBottles / numExchange;
        }
        
        
        return answer;
    }
    
}
