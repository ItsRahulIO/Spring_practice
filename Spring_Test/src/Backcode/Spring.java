package Backcode;


public class Spring
{
    public static void main(String[] args) {

//        test();
        System.out.println(binarySearch(344));


    }

    public static void test()
    {
        System.out.println("Hello tester");
    }
    public static void test2()
    {
        System.out.println("This is second test");
    }

    public static boolean binarySearch(int val)
    {
        int[] arr = new int[]{12,34,45,132,344,523,623,782,4334,5553};

        int start = 0 ;
         int end  = arr.length-1;

         while (start <= end)
         {
             int mid   = (start + end)/2;

            if (arr[mid] > val)
                end = mid - 1;
            else if (arr[mid] < val)
                 start = mid +1;
            else
                return true;
         }

         return false;
    }

}
