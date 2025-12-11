class Solution
{
    
    func
    findFinalValue
    (
        nums: Array < Int64 >
        , original: Int64
    )
    : Int64
    {
        var ans: Int64 = original
        let hashSet: HashSet < Int64 > = HashSet < Int64 > ( nums )
        
        
        while
        (
            hashSet.contains( ans )
        )
        {
            ans *= 2
        }
        
        
        ans
    }
    
}
