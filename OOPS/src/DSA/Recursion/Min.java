package DSA.Recursion;

public class Min {
    public static int findMinRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.min(A[n-1], findMinRec(A, n-1));
//        if(A[n-1]>findMinRec(A,n-1))
//            return findMinRec(A,n-1);
//        else
//            return A[n-1];
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = {4, -9, 45, 6, -50, 10, 2};
        int arr[]={1, 4, 3, -5, -4, 8, 6};
        int n = arr.length;

        // Function calling
        int ans=findMinRec(arr,n);
        System.out.println(ans);
    }
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, -5, -4, 8, 6};
//        int[] arr2 = {1, 4, 45, 6, 10, -8};
////        MinMax(arr,0);
//
//
//                                                                                                                                                                                                                                                                                                                                    int a =53;
//        System.out.println(a);
//    }
//    static void MinMax(int[] arr,int min ){
//        min++;
//        if(min>=arr.length)
//            return ;
//
//
//    }

}
