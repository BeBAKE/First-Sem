package Project;

public class CS extends BTech{

    public CS(){
        super();
    }

    public CS(String company, boolean status, long stdId){
        super(4,2,company,status, stdId);
    }


    public static void scopeInfo(){
        System.out.println("Computer Science & Engineering professionals " +
                "can build their career in numerous domains like artificial\n" +
                "intelligence, embedded systems, ethical hacking, wireless network," +
                " computer manufacturing, database systems, web applications,\n" +
                "animation, computer graphics, scientific modelling, " +
                "computational biology, video games \n");
    }
}
