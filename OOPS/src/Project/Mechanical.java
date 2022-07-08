package Project;

public class Mechanical extends BTech{

    public Mechanical(){
        super();
    }
    public Mechanical(String company,boolean status, long stdId){
        super(6,6,company,status,stdId);
    }


    public static void scopeInfo(){
        System.out.println("There is a huge scope of mechanical engineering in" +
                " all kinds of manufacturing industries, aerospace engineering,\n" +
                "automotive industries, government organizations," +
                " Public Welfare Departments and defense sector as \n" +
                "they seek mechanical engineers and offer a" +
                " good salary with growth opportunities to B. Tech graduates.\n");
    }
}
