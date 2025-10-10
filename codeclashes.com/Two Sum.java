import java.util.*;






class Main
{

        public static
        void
        main
        (
                String[] args
        )
        {
                Scanner read = new Scanner( System.in );
                HashMap < Integer, Integer > numHashMap = new HashMap <> ();
                int n = read.nextInt();
                int[] nums = new int[n];



                for
                (
                        int i = 0
                        ; i < n
                        ; i ++
                )
                {
                        nums[i] = read.nextInt();
                }


                int target = read.nextInt();
                read.close();


                for
                (
                        int i = 0
                        ; i < n
                        ; i ++
                )
                {
                        int diff = target - nums[i];

                        if
                        (
                                numHashMap.containsKey( diff )
                        )
                        {
                                System.out.println( numHashMap.get( diff ) + " " + i );
                        }
                        else
                        {
                                numHashMap.put( nums[i], i );
                        }

                }


        }

}