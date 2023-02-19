package DSA.Maths;

public class nthBit {
    public static void main(String[] args) {
        int num = 56;

        int ans= findNthBit(num,4);
        System.out.println(ans);
    }
    static int findNthBit(int num,int nthBit){
        return num & (1<<nthBit-1);
    }
}
