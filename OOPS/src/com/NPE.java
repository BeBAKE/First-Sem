package com;

//import static passwordGenerator.PasswordGenerator.generate;

public class NPE { //NPE -> NullPointedException

    String gharKaName;       // null    // NPE when derefernced( .toUpperCase() )
    StringBuilder stb1;   //    null   // NPE when derefernced(.length) // NPE when derefernced(.append)

//    int x;                    0
    int x;                            //  0

//    String gharKaName=new String();   // nothing gets printed out // converts to upperCase
//    StringBuilder stb1=new StringBuilder(); // noting gets printed out // 0 when .length //hi when derefernced(.append)

    public static void main(String[] args) {
//        StringBuilder strr= new StringBuilder("Vivek");
//        StringBuilder std=new StringBuilder(strr);
//        strr.append("hj");
//        System.out.println(strr);
//        System.out.println();
//        System.out.println(std);

//
//        int[] arr= {1,2,3,4,5};
//        arr= new int[]{3, 4};
//
//        ArrayList arr1 = new ArrayList<Integer>();
//
//        String ss= new String();
//        System.out.println(arr1);
//        if(arr1==null){
//            System.out.println("yes");
//        }
//        int number;
//        String st = null;
//        System.out.println(st);
//        String s1= "VIVEK";
//        String s2=new String();

        NPE obj1= new NPE();

//        System.out.println(obj1.gharKaName.toUpperCase());
        System.out.println(obj1.stb1.append("hi"));
        System.out.println(obj1.x);

//        System.out.println(s1.equals(s2));
    }
}
