class Solution
{
    
    func
    isUgly
    (
        n: Int64
    )
    : Bool
    {
        
        if
        (
            n == 0
        )
        {
            return false;
        }
        
        const uglyFactors: VArray < Int32, $3 > = [ 2, 3, 5 ];
        var num: Int32 = Int32( n );
        
        for
        (
            i
            in
            0..=2
        )
        {
            
            
            while
            (
                num % uglyFactors[i] == 0
            )
            {
                num /= uglyFactors[i];
            }
            
            
        }
        
        
        return num == 1;
    }
    
}