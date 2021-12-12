class classess {
    public String college;
    private String course;
    protected int year;
    //public bankAccount BankAccount;
    public classess (String college,String course, int year){
       this.college=college;
       this.year=year;
       this.course=course;
      // this.BankAccount=Bankaccount;
    }
    public String getDetails(){
        return this.course + " \n ";
    }
}
 class student extends classess{
    public int roll;
    //private String course;
   public student(String college, String course, int year, int roll){
        super(college,course, year);
        this.roll=roll;
        //this.course=course;
    }
    public String getDetails(){

       return  "College: " + this.college + "\n Course: " + super.getDetails() + " Year:  " + this.year + "\n Roll: " + this.roll;
    }
}
class bankAccount{
    private int accountNum,bal;
    public bankAccount(int accountNum,int bal){
        this.accountNum=accountNum;
        this.bal=bal;
    }
}
public class Classes{
    public static void main(String[] args){
        student c1=new student("RGM","Mech",2,27);
        System.out.println(c1.getDetails());
    }
}
