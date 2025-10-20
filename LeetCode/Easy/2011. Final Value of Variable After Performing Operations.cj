class Solution
{
    
    func
    finalValueAfterOperations
    (
        operations: Array < String >
    )
    : Int64
    {
        var ans: Int64 = 0
        const plus: UInt8 = '+'
        
        for
        (
            operation
            in
            operations
        )
        {
            
            if
            (
                operation.get( 1 ) == plus )
            {
                ans ++
            }
            else
            {
                ans --;
            }
            
        }
        
        
        return ans
    }
    
}
