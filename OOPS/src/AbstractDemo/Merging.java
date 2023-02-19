package AbstractDemo;
import java.util.Arrays;

public class Merging {

    static int[] merge(int[] arr){
        if(arr.length==0){
            return arr;
        }

        return help(arr,0,arr.length-1);

    }

    private static int[] conquer(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }

        return ans;
    }

    static int[] help(int[] arr, int start, int end){

        if(arr.length==1){
            return arr;
        }
        int mid=(start+end)/2;
        int[] left= help(Arrays.copyOfRange(arr,start,mid+1),0,mid);
        int[] right= help(Arrays.copyOfRange(arr,mid+1,end+1),0,end-mid-1);

        return conquer(left,right);
    }




    public static void main(String[] args) {
        int[] arr= {-2,-5,8,9,8};
        System.out.println(Arrays.toString(merge(arr)));
        System.out.println(Arrays.toString(arr));
    }
}
