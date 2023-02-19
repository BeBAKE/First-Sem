package DSA.Recursion2;

import java.util.ArrayList;

public class LinearSearching {
    static ArrayList searchAllIndex(int[] arr,int target){
        ArrayList<Integer> list= new ArrayList<>();
        if(arr.length==0){
            list.add(-1);
            return list;
        }
        return help2(arr,target,list,0);
    }
//    static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList help2(int[] arr, int target,ArrayList list, int index){
        if(index==arr.length){
            if(list.size()==0){
                list.add(-1);
                return list;
            }
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return help2(arr,target,list,++index);
    }

//    static int search(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        return help(arr,target,0);
//    }
//    private static int help(int[] arr, int target, int index){
//        if(index==arr.length){
//            return -1;
//        }
//        if(arr[index]==target){
//            return index;
//        }
//        return help(arr,target,++index);
//    }

    public static void main(String[] args) {
        int[] arr= {4,2,-6,2,7,-1,3,3,-8,9,10,34,2,64};
//        int[] arr= {1};
//        int ans= search(arr,2);
//        System.out.println(ans);
        ArrayList ls = searchAllIndex(arr,2);
        System.out.println(ls);
//        System.out.println(list);
    }
}
