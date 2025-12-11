class Solution
{
    
    func
    canConstruct
    (
        ransomNote: String
        , magazine: String
    )
    : Bool
    {
        let magazineHashMap: HashMap < UInt8, Int64 > = getHashMap( magazine )
        let ransomNoteHashMap: HashMap < UInt8, Int64 > = getHashMap( ransomNote )
        
        
        for
        (
            ( k, v )
            in
            ransomNoteHashMap
        )
        {
            
            match ( magazineHashMap.get( k ) )
            {
                case Some( count ) =>
                if
                (
                    v > count
                )
                {
                    return false
                }
                
                
                case None => return false
            }
            
        }
        
        
        true
    }
    
    
    
    
    private
    func
    getHashMap
    (
        s: String
    )
    : HashMap < UInt8, Int64 >
    {
        let hashMap: HashMap < UInt8, Int64 > = HashMap < UInt8, Int64 > ()
        
        
        for
        (
            i
            in
            s
        )
        {
            
            if
            (
                hashMap.contains( i )
            )
            {
                hashMap[i] ++
            }
            else
            {
                hashMap[i] = 1
            }
            
        }
        
        
        hashMap
    }
    
}
