package DSA.Maths;

public class Xor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int ans = findUnique(arr);
        System.out.println(ans);
    }

    static int findUnique(int[] arr){
        int unique=0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }
}
