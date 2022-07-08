package Project;

public class BTech {
    private long stdId;
    private int subject;
    private int chapter;
    private String company;
    private boolean passStatus;

    public BTech(){
        this.subject=0;
        this.chapter=0;
        this.company=null;
        this.passStatus =false;
        this.stdId=0;
    }


    public BTech(int subject, int chapter, String company, boolean status, long stdId) {
        this.subject = subject;
        this.chapter = chapter;
        this.company = company;
        this.passStatus = status;
        this.stdId = stdId;
    }


    public double getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public void setSubject(int subject){
        this.subject=subject;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPassStatus(boolean passStatus) {
        this.passStatus = passStatus;
    }

    public int getSubject() {
        return subject;
    }

    public int getChapter() {
        return chapter;
    }

    public String getCompany() {
        return company;
    }

    public boolean isPassStatus() {
        return passStatus;
    }

    static void show(BTech std){
        System.out.println("subject : "+std.getSubject());
        System.out.println("Chapters : "+std.getChapter());
        System.out.println("student Id : "+std.getCompany());
        System.out.println("passed: "+std.isPassStatus());
        System.out.println("student Id : "+std.getStdId());

    }

    public void show(){
        System.out.println("subject : "+this.getSubject());
        System.out.println("Chapters : "+this.getChapter());
        System.out.println("student Id : "+this.getCompany());
        System.out.println("has passed or not: "+this.isPassStatus());
        System.out.println("student Id : "+this.getStdId());

    }

    public static void scopeInfo(){
        System.out.println("No scope .........\n");
    }

}
