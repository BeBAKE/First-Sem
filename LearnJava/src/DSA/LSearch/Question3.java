package DSA.LSearch;

public class Question3 {
    public static void main(String[] args) {
        int[][] show= {{1,2,3},{3,2,1}};
        int[][] show2={{1,5},{7,3},{3,5}};
        System.out.println(MaxWealth(show));
        System.out.println(MaxWealth(show2));

    }

    // data -- arr
    // person -- row
    // account -- col
    // wealth -- test

    static int MaxWealth(int[][] data){
        int max= Integer.MIN_VALUE;
        for (int[] person: data){
            int wealth=0;
            for(int account:person){
                wealth+=account;
            }
            if (max<wealth){
                max=wealth;
            }
        }return max;
    }

}
