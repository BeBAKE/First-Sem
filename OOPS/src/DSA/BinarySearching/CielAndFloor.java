package DSA.BinarySearching;

public class CielAndFloor {
    public static void main(String[] args) {

        int[] arr= {5,7,7,7,7,7,8,8,10};
        int[] arr2 ={563,444,231,109,58,44,43,32};

        CielFloor(arr,7);

    }
    static void CielFloor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscen = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                System.out.println("Ciel and floor of "+target+" is "+mid);
                return;
            }
            if(isAscen){
                if(target<arr[mid]){
                    end =mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end =mid-1;
                }else{
                    start = mid+1;
                }
            }

        }

        if(isAscen){
            if(target>arr[arr.length-1] || target<arr[0]){
                if(target>arr[arr.length-1])
                    System.out.println("Floor : "+end);
                else
                    System.out.println("Cieling : "+start);
            }
            else
                System.out.println("Cieling : "+start+" ,Floor : "+end);
        }
        else{
            if(target>arr[0]||target<arr[arr.length-1]){
                if(target>arr[0])
                    System.out.println("Floor : "+start);
                else
                    System.out.println("Cieling : "+end);
            }
            else
                System.out.println("Cieling : "+end+" ,Floor : "+start);
        }
    }

}
