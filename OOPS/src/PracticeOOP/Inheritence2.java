package PracticeOOP;

class Phone{
    float size;
    String processor;
    int ram;
    int storage;
    //Phone with size as per user's demand
    Phone(float size,String processor,int ram, int storage){
        this.size=size;
        this.processor= processor;
        this.ram= ram;
        this.storage=storage;
    }
    //phone with size as default
//    public Phone(String processor,int ram, int storage){
////        this(6,processor,ram,storage);
//        this.size=6.1f;
//        this.processor= processor;
//        this.ram= ram;
//        this.storage=storage;
//    }

    public void calling(String phNo){
        System.out.println("calling to "+phNo);
    }

    public void messaging(String message){
        System.out.println("message sent");
    }
}

class Xiomi extends Phone{

    float camera;
    // Phone as per user's demand
    public Xiomi(float size,String processor,int ram, int storage,int camera){
        super(size,processor,ram,storage);
        this.camera=camera;
    }
    //Phone with default Xiomi size
    public Xiomi(String processor,int ram, int storage,int camera){
        super(6.7f,processor,ram,storage);
        this.camera=camera;
    }

    public void getInfo(){
        System.out.println(this.camera+" MP\n"+this.size+" inch OLED display\n"+this.storage
                +" NFS 3.0\n"+this.processor+"\n"+this.ram+" GB");
    }

}

class Samsung extends Phone{
    float camera;
    String stylus;
    boolean foldable;
    // Phone as per user's demand
    public Samsung(float size,String processor,int ram, int storage,int camera){
        super(size,processor,ram,storage);
        this.camera=camera;
    }
    //Phone with default  size
    public Samsung(String processor,int ram, int storage,int camera){
        super(6.1f,processor,ram,storage);
        this.camera=camera;
    }
    public Samsung(String processor,int ram, int storage,int camera,boolean foldable,String stylus){
        super(6.1f,processor,ram,storage);
        this.camera=camera;
        this.foldable =foldable;
        this.stylus=stylus;
    }
    public void getInfo(){
        System.out.println(this.camera+" MP\n"+this.size+" inch OLED display\n"+this.storage
                +" NFS 3.0\n"+this.processor+"\n"+this.ram+" GB\n"
                +this.foldable+"\n"+this.stylus);
    }
}



public class Inheritence2 {
    public static void main(String[] args) {

        Xiomi note9 = new Xiomi(6.7f,"Snapdragon 888 Gen 1",12,256,108);
//        note9.getInfo();
        note9.calling("910304050678");
        note9.messaging("Do not forget to take regulator with you.");


        System.out.println();

        Samsung S22Ultra=new Samsung("Sanpdragon 888 Gen 2",16,512,108,false,"Gen 2");
//        S22Ultra.getInfo();

        System.out.println();


    }
}
