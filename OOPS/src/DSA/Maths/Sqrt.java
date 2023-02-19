package DSA.Maths;

public class Sqrt {
    public static void main(String[] args) {
        double ans= sq(40,6);
        System.out.println(ans);

    }
    static double sq(int n,int p){

       int s=0, e=(int)n/2, m=0;
       double root=0;

       while(s<=e){
           m=s+(e-s)/2;
           if(m*m==n){
               return m;
           }else if(m*m<n){
               s=m+1;
           }else{
               e=m-1;
           }
       }
       root=e;
       double inc = 0.1;
       for(int i = 0;i<p;i++){
           while(root*root<=n){
               root+=inc;
           }
           root-=inc;
           inc/=10;
        }
       return root;
    }

}
