package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(10);

        //Addition of values
        while(value!=0){
            list.add(value);
            value =sc.nextInt();
            if(value<0 || value >9){
                System.out.println("Entered value should be between 1 and 9\nEnter the value again");
                value =sc.nextInt();
            }
        }
        Collections.sort(list);
        System.out.println(list);

        //getting information
        int target=1;
        while(target!=0) {
            System.out.print("Enter the number to get it's information(press 0 to exit) : ");
            target = sc.nextInt();
            if(target==0){break;}

            searchRange(list,target);
        }



    }


    static void searchRange(ArrayList<Integer> nums, int target) {
        int[] ans={-1,-1};
        ans[0]=firstOccurance(nums,target,true);
        ans[1]=firstOccurance(nums,target,false);

        int noOfTimes= ans[1]-ans[0]+1;
        int sum =noOfTimes*target;
        float percentage= (float) ((noOfTimes*100.0)/nums.size());
        System.out.println("Sum of all "+target+"'s are "+sum+"\n percentage of the same is "+percentage+"\n");

    }

    static int firstOccurance(ArrayList<Integer> nums, int target, boolean isfirst) {
        int answer=-1,start=0,end=nums.size()-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>nums.get(mid))
                start=mid+1;
            else if(target<nums.get(mid))
                end=mid-1;
            else{
                answer=mid;
                if(isfirst)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return answer;
    }

}
