package com.company.methods;

public class BlockForScope {
    public static void main(String[] args) {

        // 1 . Variables initialized "outside" of block does not need to initialized again in block. But can be modified .
        // 2 . Changing its value anywhere will change it for whole function.

        // 1. Variables initialized "inside" the block is only defined there (like method variable).

        int a = 10;
        int b = 20;
        System.out.println(a);

        {
            a=80;
            System.out.println(a);
            int c = 40;
            System.out.println(c);
        }

        System.out.println(a);
        //System.out.println(c);  #error [Function initialized in the block is only defined there.]

        //int c=9;     # valid  [because there is no variable c outside the block]


                     // SCOPING OF FOR LOOP
            // anything initialized "inside" the loop like i and num can't be used outside.
                  //It has to be defined again outside.
            // BUT anything initialized "outside" can be used(modified) inside and any change in its value will reflect
                   // in whole code.

        for (int i=1; i<5;i++){
            System.out.println(i);
            int num= 5;
            a  = 33;
        }
        //int i = 33;    # VALID  [because previously it was defined in for loop.]
        System.out.println(a);
      //System.out.println(num);    [num can't be used outside.]
      //System.out.println(i);  #error [i is defined in for loop only]

    }
}
