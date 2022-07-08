package DSA.LSearch;

public class Question {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(FindNumbers(arr));

    }
    static int FindNumbers(int[] arr){
        int count=0;
        for(int num:arr){
          if(isEven(num)==true){
              count++;
          }
        }
        return count;
    }
    static boolean isEven(int num){
        int counter= 0;
        if (num==0){
            return false;
        }while(num!=0){
            num/=10;
            counter++;
        }if(counter%2==0){
            return true;
        }return false;
    }
}
