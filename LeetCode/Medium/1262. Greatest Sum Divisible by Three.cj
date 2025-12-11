class Solution
{
    
    func
    maxSumDivThree
    (
        nums: Array < Int64 >
    )
    : Int64
    {
        let n = nums.size
        var sum = 0
        let ones: ArrayList < Int64 > = ArrayList < Int64 > ()
        let twos: ArrayList < Int64 > = ArrayList < Int64 > ()
        
        
        for
        (
            num
            in
            nums
        )
        {
            let m = num % 3
            sum += num
            
            if
            (
                m > 1
            )
            {
                twos.add( num )
            }
            else if
            (
                m > 0
            )
            {
                ones.add( num )
            }
            
        }
        
        
        let m = sum % 3
        
        if
        (
            m < 1
        )
        {
            return sum
        }
        
        sort( ones )
        sort( twos )
        let maxes = [ Int64( Int32.Max ), Int64( Int32.Max ) ]        
        ones.add( all: maxes )
        twos.add( all: maxes )
        
        if
        (
            m > 1
        )
        {
            sum - min( ones[0] + ones[1], twos[0] )
        }
        else
        {
            sum - min( ones[0], twos[0] + twos[1] )
        }
        
    }
    
}
