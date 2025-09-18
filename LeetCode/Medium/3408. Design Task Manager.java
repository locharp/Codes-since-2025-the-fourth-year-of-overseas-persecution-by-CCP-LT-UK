// 333 ms, 157 MB
class TaskManager
{
    int[][] taskArr;
    TreeMap < Integer, PriorityQueue < Integer > > taskPqTm;


    

    public
    TaskManager
    (
        List < List < Integer > > tasks
    )
    {
        taskArr = new int[2][100001];
        taskPqTm = new TreeMap <> ();


        for
        (
            List < Integer > task
            : tasks
        )
        {
            add( task.get( 0 ), task.get( 1 ), task.get( 2 ) );
        }

        
    }


    
    
    public
    void
    add
    (
        int userId
        , int taskId
        , int priority
    )
    {
        taskArr[0][taskId] = userId;
        taskArr[1][taskId] = priority;

        if
        (
            !taskPqTm.containsKey( priority )
        )
        {
            taskPqTm.put( priority, new PriorityQueue <> ( Comparator.reverseOrder() ) );
        }

        taskPqTm.get( priority ).offer( taskId );
    }


    
    
    public
    void
    edit
    (
        int taskId
        , int newPriority
    )
    {

        if
        (
            taskArr[1][taskId] == newPriority
        )
        {
            return;
        }
        else
        {
            add( taskArr[0][taskId], taskId, newPriority );
        }
        
    }


    
    
    public
    void
    rmv
    (
        int taskId
    )
    {
        taskArr[1][taskId] = -1;
    }


    
    
    public
    int
    execTop
    ()
    {


        while
        (
            !taskPqTm.isEmpty()
            &&
            !taskPqTm.lastKey().equals
            (
                taskArr[1][taskPqTm.lastEntry().getValue().peek()]
            )
        )
        {

            if
            (
                taskPqTm.lastEntry().getValue().size() < 2
            )
            {
                taskPqTm.pollLastEntry();
            }
            else
            {
                taskPqTm.lastEntry().getValue().poll();
            }
            
        }
        

        if
        (
            taskPqTm.isEmpty()
        )
        {
            return -1;
        }
        else
        {
            taskArr[1][taskPqTm.lastEntry().getValue().peek()] = -1;

            if
            (
                taskPqTm.lastEntry().getValue().size() < 2
            )
            {
                return taskArr[0][taskPqTm.pollLastEntry().getValue().poll()];
            }
            else
            {
                return taskArr[0][taskPqTm.lastEntry().getValue().poll()];
            }

        }
        
    }
        
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
