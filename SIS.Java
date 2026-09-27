import javax.swing.*;
import java.util.*; 
public class SIS{
	static ArrayList<String> studata = new ArrayList<> ();
	static ArrayList<String> unitdata = new ArrayList<>();
	public static void main(String[] args) {
		studData();
		unitdata();
		examdata();
	}
	public static void studData(){
	    Scanner input =new Scanner(System.in);
	System.out.println(  "Hello  Welcome to Open university");
	System.out.println("Enter your full name");
	String name=input.nextLine();
	
	    System.out.println("enter your admission number");
	    String admNo = input.nextLine();
	    System.out.println("enter phone number ");
	    String phone = input.nextLine();
	    
	    System.out.println("enter your gender");
	    String gender= input.nextLine();
	    
	    System.out.println("enter your Location");
	    String Address = input.nextLine();
	   
	    System.out.println("enter your email");
	     String email=input.nextLine();
	     System.out.println(" please enter your ID or passport number");
	   String IDNo = input.nextLine();
	   
	     System.out.println("Enter ur course");
	     String course =input.nextLine();
	    
	    studata.add(name);
	    studata.add(admNo);
	    studata.add(phone);
	    studata.add(gender);
	    studata.add(Address);
	    studata.add(email);
	    studata.add(IDNo);
	    studata.add(course);
	    
	    System.out.println("Your details are as follows");
	    	 for(int i=0;i<= studata.size()-1; i++){
	    System.out.println(studata.get(i));
	    
	    }
	    
}
public static void unitdata(){
    Scanner input = new Scanner(System.in);
    System.out.println("enterthe units tbat you are doing");
    String unit1= input.nextLine();
        System.out.println("enter second unit");
    String unit2= input.nextLine();
    System.out.println("enter third unit");
    String unit3= input.nextLine();
    System.out.println("enter fourth unit");
    String unit4= input.nextLine();
    System.out.println("enter fifth unit");
    String unit5= input.nextLine();
    System.out.println("enter sixth unit");
    String unit6= input.nextLine();
    System.out.println("enter seventh unit");
    String unit7= input.nextLine();
    System.out.println("enter eighth unit");
    String unit8= input.nextLine();
    
    unitdata.add(unit1);
    unitdata.add(unit2);
    unitdata.add(unit3);
    unitdata.add(unit4);
    unitdata.add(unit5);
    unitdata.add(unit6);
    unitdata.add(unit7);
    unitdata.add(unit8);
    
      System.out.println("Your units are as follows");
	    	 for(int i=0;i<= unitdata.size()-1; i++){
	    System.out.println(unitdata.get(i));
	    
	    }
    }
    public static void examdata(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the exam tab");
      System.out.println("Enter the exam marks for  "+ unitdata.get(0));
   String  unit1Mark = input.nextLine();
   //int unit1marks=Integer.parseInt(unit1mark);
  System.out.println("Enter the exam marks for  "+ unitdata.get(1));
   String  unit2Mark = input.nextLine();
   System.out.println("Enter the exam marks for  "+ unitdata.get(2));
   String  unit3Mark = input.nextLine();
         System.out.println("Enter the exam marks for  "+ unitdata.get(3));
   String  unit4Mark = input.nextLine();
         System.out.println("Enter the exam marks for  "+ unitdata.get(4));
   String  unit5Mark = input.nextLine();
         System.out.println("Enter the exam marks for  "+ unitdata.get(5));
   String  unit6Mark = input.nextLine();
         System.out.println("Enter the exam marks for  "+ unitdata.get(6));
   String  unit7Mark = input.nextLine();
         System.out.println("Enter the exam marks for  "+ unitdata.get(7));
   String  unit8Mark = input.nextLine();
   
   // total calculation 
   int U1M = Integer.parseInt(unit1Mark);
   int U2M =Integer.parseInt(unit2Mark);
   int U3M = Integer.parseInt(unit3Mark);
   int U4M =Integer.parseInt(unit4Mark);
   int U5M = Integer.parseInt(unit5Mark);
   int U6M =Integer.parseInt(unit6Mark);
   int U7M = Integer.parseInt(unit7Mark);
   int U8M =Integer.parseInt(unit8Mark);
  
  int total = U1M +U2M+U3M + U4M + U5M +U6M +U7M+U8M;
   System.out.println("your totalmarks is " + total);
 // average calculation 
 int average=total/8;
 System.out.println("Your average is "+ average); 
      
        
   // Grade and remarks calculation
   String grade;	
	
			if(total>=80){
					grade="A";
			}else if(total>=70){
					grade="B";	
		    }else if(total>=60){
					grade="C";
			}else if(total>=50){
					grade="D";
			}else{
				   grade="F";};
															    

	String remark;	
	
		if(total>=80){
				remark="Excellent";
			}else if(total>=70){
				remark="Great";	
		    }else if(total>=60){
				remark="Well Done";
			}else if(total>=50){
				remark="Below expectation";
			}else{
			    remark="Fail";};  
        }
}
