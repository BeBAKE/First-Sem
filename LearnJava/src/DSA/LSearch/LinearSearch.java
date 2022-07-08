package DSA.LSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array= {12,32,4,5,6,-2,43,34};
        int target = 3;
        int ans = Lsearch(array,target);
        System.out.println(ans);


    }


    //Search in the array: return the index if item found
    // return -1 if nothing found

    static int Lsearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index =0;index<arr.length;index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;

    }
}
