package Project;

public class Testerthis {
    public static void main(String[] args){
//        Btech student = new Btech(4,4,"General Company",false,2);
//        Btech.show(student);


        Chemical sam = new Chemical("Vendanta",true,2021001);
        Chemical tim = new Chemical("ONGC",true,2021002);
        Chemical moss = new Chemical("Tesla",true,2021003);
//        Btech.show(sam);
        sam.show();
        System.out.println();
        tim.show();
        System.out.println();
        moss.show();
        System.out.println();



        Mechanical varun = new Mechanical("Tata Steel Inc.",true,2021101);
        Mechanical tarun = new Mechanical("Adani Port inc.",true,2021102);
        Mechanical karun = new Mechanical("Tata Steel Inc.",true,2021103);
        varun.show();
        System.out.println();
        tarun.show();
        System.out.println();
        karun.show();

        BTech.scopeInfo();
        Chemical.scopeInfo();
        Mechanical.scopeInfo();
        CS.scopeInfo();


    }
}
