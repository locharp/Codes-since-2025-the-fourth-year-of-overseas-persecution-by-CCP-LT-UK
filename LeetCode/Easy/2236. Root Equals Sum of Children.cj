class Solution
{
    
    func
    checkTree
    (
        root: ?BinaryTreeNode
    )
    : Bool
    {
        
        return match
        (
            root
        )
        {
            case Some ( node ) =>
                node.val
                ==
                (
                    ( node.left?.val ?? 0 )
                    + ( node.right?.val ?? 0 )
                )
            
            case None => true
        }
        
    }
    
}
