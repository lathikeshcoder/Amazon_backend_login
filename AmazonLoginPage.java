import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer{
  int i=0;
  String username;
  String accountType;
  String passWord;
  String age;
  String DOB;

  static String [] userdata={"lathi","bala","kumar","lokesh"};
  static String [] userpassword={"lathi@123","bala@123","kumar@123","lokesh@123"};
  Scanner ob=new Scanner(System.in);
   
  Customer(){
    getData();
     int result=authentication();
    if(result==1){
      System.out.println("welcome to amazon MR "+username);
      userDetails();
      }
    
    } 
  void getData()
  {
    System.out.println("enter the user");
    username=ob.nextLine();
    System.out.println("enter the password");
    passWord=ob.nextLine();
      System.err.println("age:");
      age=ob.nextLine();
      System.err.println("DOB:");
      DOB=ob.nextLine();
      System.err.println("accountType:");
      accountType=ob.nextLine();
    }
  int authentication(){
    int flag=0;
    String cond=null;
   
    for(int i=0 ;i<userdata.length;i++)
        { 
          
          for(int j=0;j<userpassword.length;j++)
          {            
            if(i==j)
                  { 
                     cond= username.equals(userdata[i]) && passWord.equals(userpassword[j])?"successfully":"Invalidlogin";
                       if(cond=="successfully"){
                          System.out.println(cond);
                          flag=1;}
                  }   
                  }}
                    if(!(cond=="successfully")){
                       System.err.println(cond);
                        System.err.println("try again!!");
                          while (i<3) {
                            System.out.println("enter the user");
                            username=ob.nextLine();
                            System.out.println("enter the password");
                            passWord=ob.nextLine();
                            i++;
                            authentication();
                          }  }
                         return flag; }
                        
      void userDetails()
      {
            System.err.println(username);
            System.err.println(accountType);
            System.err.println(age);
            System.err.println(DOB);
          }        
                        
                        
                        
 }
public class AmazonLoginPage {
  public static void main(String[] args) {
      Customer obj=new Customer();
      
    }

}


