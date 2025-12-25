class Solution
{
    
    public
    long
    maximumHappinessSum
    (
        int [] happiness
        , int k
    )
    {
        final int o = happiness.length - 1;
        Arrays.sort( happiness );
        long answer = 0;
        
        
        for
        (
            int i = 0
            ; i < k
                && happiness[i] > i
            ; i ++
        )
        {
            answer += happiness[o - i] - i
        }
        
        
        return answer;
    }
    
}
