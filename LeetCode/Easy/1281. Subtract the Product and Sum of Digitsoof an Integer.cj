class Solution
{
    
    func
    subtractProductAndSum
    (
        n: Int64
    )
    : Int64
    {
        var product: Int64 = 1
        var sum: Int64 = 0
        var worker: Int64 = n
        
        
        while
        (
            worker > 0
        )
        {
            let d: Int64 = worker % 10
            
            product *= d
            sum += d
            
            worker /= 10
        }
        
        
        product - sum
    }
    
}
