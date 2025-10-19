class Solution
{
    
    func
    findSmallestInteger
    (
        nums: Array < Int64 >
        , value: Int64
    )
    : Int64
    {
        let arr: Array < Int64 > = Array( value, repeat: 0 )
        
        
        for
        (
            num
            in
            nums
        )
        {
            var i = num % value
            
            if
            (
                i < 0
            )
            {
                i += value
            }
            
            arr[i] ++
        }
        
        
        var i = 0
        
        
        for
        (
            j
            in
            1..value
        )
        {
            
            if
            (
                arr[i] > arr[j]
            )
            {
                i = j
            }
            
        }
        
        
        return ( arr[i] * value ) + i
    }
    
}
