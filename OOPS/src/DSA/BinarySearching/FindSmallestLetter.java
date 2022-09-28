package DSA.BinarySearching;
//Find smallest letter greater than the targeta
public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] arr={'c','f','g','j','m','y'};

        char ans=finder(arr,'a');
        System.out.println(ans);
    }
    static char finder(char[] letters,char target){

        int start=0,end=letters.length-1,mid;

//        if (target>=letters[letters.length-1]){ // insted of this we can use return letters[start%letters.length]
//            return letters[0];
//        }
//        while (start<=end){
//            mid=start+(end-start)/2;
//
//            if(target>letters[mid]){
//              start=mid+1;
//            }else if(target<letters[mid]){
//                end=mid-1;
//            }else{
//                start=mid+1;
//            }
//        }
//        return letters[start];
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>letters[mid]){
              start=mid+1;
            }else {
                end = mid - 1;
            }
        }


        return letters[start%letters.length];// it is use because if target is y answer should be c
                // index of target is 5 , letters.length is 6 , start will be 6 at the end of while loop
        //This can give index out of bound error so start % letters.length => 6 % 6 = 0
        // and letters[0] is c which is correct

        // lets say target = d
        // at the end of while loop start = 1
        // start % letters.length => 2 % 6 = 2
        // return letters[2] = f which is right answer

        //Basically our start go upto N(length of array)
        // start % length will give numbers from N-1(6 when start is 0) to 0(when start is N)
    }
}





