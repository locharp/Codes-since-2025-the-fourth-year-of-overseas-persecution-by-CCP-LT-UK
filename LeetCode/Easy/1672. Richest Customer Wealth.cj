class Solution
{
    
    func
    maximumWealth
    (
        accounts: Array < Array < Int64 > >
    )
    : Int64
    {
        var ans: Int64 = 0
        
        
        for
        (
            account
            in
            accounts
        )
        {
            var sum: Int64 = 0
            
            
            for
            (
               acc
               in
               account
            )
            {
                sum += acc
            }
            
            
            ans = max( ans, sum )
        }
        
        
        return ans
    }
    
}
