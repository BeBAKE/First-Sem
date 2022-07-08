public class Experiment {
    public static void main(String[] args) {
        int num=8;
        fibonacci(num);


    }
    public static void fibonacci(int num){
        int first=1,last=0,count = 1;
        System.out.print(0);
        for(int sum=1;count<num;count++){
            System.out.print(", "+sum);
            sum=last+first;
            last=first;
            first=sum;
        }
    }

}
