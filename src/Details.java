import java.util.ArrayList;
import java.util.Scanner;

public class Details {
    private String name;

     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
     }
   private String DOB;

    public String getDOB(){
        return DOB;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
    }
    private String email;

     public String getEmail(){
         return email;
     }
     public void  setEmail(String email){
         this.email=email;
     }
     private String phone;
     public String getPhone(){
         return phone;
     }
     public void setPhone(String phone){
         this.phone=phone;
     }
  private String address;
     public String getAddress(){
         return  address;

     }
     public void setAddress(String address){
         this.address=address;
     }
}
class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Details> list = new ArrayList<>();
        Details details = new Details();

        System.out.print("enter the name :");
        String name = scan.nextLine();
        details.setName(name);

        System.out.print("enter the DOB :");
        String DOB = scan.next();
        details.setDOB(DOB);

        System.out.print("enter the email :");
        String email= scan.next();

        details.setEmail(email);


        System.out.print("enter the address:");
        String address=scan.next();
        details.setAddress(address);

        System.out.print("enter the phone number:");
        String phone=scan.next();
        details.setPhone(phone);



        list.add(details);
        System.out.println(list);

        for (Details x: list) {
            System.out.println("The name is :"+x.getName());
            System.out.println("The DOB is :"+x.getDOB());
            System.out.println("The email is :"+x.getEmail());

            System.out.println("The Address is:" + x.getAddress());
            System.out.println("The Phone number is :"+x.getPhone());
        }

        }

    }

