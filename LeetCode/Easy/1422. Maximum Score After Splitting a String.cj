class Solution {
    func maxScore(s: String): Int64 {
        const ONE: UInt8 = '1'
        var ans: Int64 = 0
        var o: Int64 = s.count("1")
        var z: Int64 = 0
        
        
        for
        (
        c
        in
        s[0..s.size - 1]
        )
        {
            if
            (
                c == ONE
            )
            {
                o --
            }
            else
            {
                z ++
            }
            
            ans = max( ans, o + z )
        }
        
        
        ans
    }
}
