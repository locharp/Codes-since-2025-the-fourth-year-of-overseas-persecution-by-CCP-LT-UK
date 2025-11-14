class Solution
{
    
    func
    maxOperations
    (
        s: String
    )
    : Int64
    {
        let arr: Array < Rune > = s.toRuneArray()
        var ans: Int64 = 0
        var ones: Int64 = 0
        var i: Int64 = 0
        let n: Int64 = arr.size
        
        
        while
        (
            i < n
        )
        {
            
            if
            (
                arr[i] == r'0'
            )
            {
                ans += ones
                i ++
                
                
                while
                (
                    i < n
                    && arr[i] == r'0'
                )
                {
                    i ++
                }
                
                
            }
            else
            {
                ones ++
                i ++
            }
            
        }
        
        
        return ans
    }
    
}
