package Project;

public class Chemical extends BTech{

    public Chemical(){
        super();
    }
    public Chemical( String company, boolean status, long stdId ){
        super(9,5,company,status,stdId);
    }


    public static void scopeInfo(){
        System.out.println("Chemical engineering graduates can find" +
                " employment in the private sector in industries like\n" +
                "Biotechnology Sector, Cement Factories, Fertilizer Factories," +
                " Food Processing Units, Petrochemicals, Petroleum Refineries,\n" +
                "Pharmaceutical Industries, etc. The salary for chemical engineers is quite high.\n");
    }


}
