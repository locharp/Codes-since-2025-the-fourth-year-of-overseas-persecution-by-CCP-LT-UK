import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();


        for (int i = 0; i < T; i++)
        {
            MaxHeap heap = new MaxHeap(T);


            for (int j = 0; j < 3; j++)
            {
                heap.push(read.nextInt());
            }
            
            
            heap.pop();

            System.out.println(heap.pop());
        }
        
        
    }

}




class MinHeap
{
    int[] arr;
    int i;




    MinHeap(int n)
    {
        arr = new int[n];
        i = 0;
    }




    int
    push(int x)
    {
        arr[i] = x;
        up(i);
        i++;


        return arr[0];
    }




    int
    peek()
    {
        return arr[0];
    }




    int
    pop()
    {
        int x = arr[0];
        i--;
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        down(0);


        return x;
    }




    void
    up(int x)
    {
        int y = (x - 1) / 2;


        while (arr[x] < arr[y])
        {
            swap(x, y);
            x = y;
            y = (x - 1) / 2;
        }


    }




    void
    down(int x)
    {
        int o = x;
        int p = (x * 2) + 1;
        int q = (x * 2) + 2;


        while (p < i)
        {

            if (arr[x] > arr[p])
            {
                x = p;
            }

            if (q < i && arr[x] > arr[q])
            {
                x = q;
            }

            if (o != x)
            {
                swap(x, o);
            }
            else
            {
                break;
            }

            o = x;
            p = (x * 2) + 1;
            q = (x * 2) + 2;
        }


    }




    void
    swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }




    int[]
    getArr()
    {
        return arr.clone();
    }




    String
    getFullString()
    {
        int j = i;
        i = arr.length;
        String s = toString();
        i = j;


        return s;
    }




    @Override
    public
    String
    toString()
    {
        StringBuilder s = new StringBuilder();


        for (int x = 0; x < i; x++)
        {
            s.append(arr[x] + " ");
        }


        s.deleteCharAt(s.length() - 1);


        return s.toString();
    }

}




class MaxHeap
{
    int[] arr;
    int i;




    MaxHeap(int n)
    {
        arr = new int[n];
        i = 0;
    }




    int
    push(int x)
    {
        arr[i] = x;
        up(i);
        i++;


        return arr[0];
    }




    int
    peek()
    {
        return arr[0];
    }




    int
    pop()
    {
        int x = arr[0];
        i--;
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        down(0);


        return x;
    }




    void
    up(int x)
    {
        int y = (x - 1) / 2;


        while (arr[x] > arr[y])
        {
            swap(x, y);
            x = y;
            y = (x - 1) / 2;
        }


    }




    void
    down(int x)
    {
        int o = x;
        int p = (x * 2) + 1;
        int q = (x * 2) + 2;


        while (p < i)
        {

            if (arr[x] < arr[p])
            {
                x = p;
            }

            if (q < i && arr[x] < arr[q])
            {
                x = q;
            }

            if (o != x)
            {
                swap(x, o);
            }
            else
            {
                break;
            }

            o = x;
            p = (x * 2) + 1;
            q = (x * 2) + 2;
        }


    }




    void
    swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }




    int[]
    getArr()
    {
        return arr.clone();
    }




    String
    getFullString()
    {
        int j = i;
        i = arr.length;
        String s = toString();
        i = j;


        return s;
    }




    @Override
    public
    String
    toString()
    {
        StringBuilder s = new StringBuilder();


        for (int x = 0; x < i; x++)
        {
            s.append(arr[x] + " ");
        }


        s.deleteCharAt(s.length() - 1);


        return s.toString();
    }

}