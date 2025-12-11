class Solution
{

    func transpose
    (
        matrix: Array < Array < Int64 > >
    )
    : Array < Array < Int64 > >
    {
        let m = matrix.size
        let n = matrix[0].size

        let ans: Array < Array < Int64 > >
        = Array < Array < Int64 > > ( n, { _ => Array < Int64 > ( m, repeat: 0 ) } )
        
        
        for
        (
            i
            in
            0..n
        )
        {
            
            
            for
            (
                j
                in
                0..m
            )
            {
                ans[i][j] = matrix[j][i]
            }



        }


        ans
    }
    
}
