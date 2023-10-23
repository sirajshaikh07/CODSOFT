package CodeSoft_3.studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student_impl stu_impl=new Student_impl();
	p:while(true)
	{
		System.out.println("------------------------------------------STUDENT MANAGEMENT SYSTEM---------------------------");
		System.out.println("1.ADD     STUDENT");
		System.out.println("2.REMOVE  STUDENT");
		System.out.println("3.DISPLAY STUDENT");
		System.out.println("4.SEARCH  STUDENT");
		System.out.println("5.ADD  STUDENT TO FILE");
		System.out.println("6.READ STUDENT FROM FILE");
		System.out.println("7.EXIT");
		System.out.println();
	System.out.println("Enter a Input to performed Desire Opertaion");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	{
	       Student s=new Student();
	       
	       System.out.println("Enter name");
	       String name=sc.next();
	       System.out.println("Enter Roll_no");
	       int roll_no=sc.nextInt();
	       System.out.println("Enter grade");
	       String grade=sc.next();
	       System.out.println("Enter Height");
	       double height=sc.nextDouble();
	       System.out.println("Enter Address");
	       String address=sc.next();
	       if(name==null||name=="" || roll_no==0|| grade==""||grade==null||height==0||address==null||address=="")
	       {
	    	   System.out.println("name cant be null or empty");
	    	   System.out.println("roll_no cant be zero or negative");
	    	   System.out.println("grade cant be null or empty");
	    	   System.out.println("Height cant be zero or negative");
	    	   System.out.println("address cant be null or empty");
	    	   
	       }
	       else
	       {
	    	   s.setName(name);
		       s.setRoll_no(roll_no);
		       s.setGrade(grade);
		       s.setHeight(height);
		       s.setAddress(address);
		       stu_impl.add(s);
		      
	       }
	       break;
	}
	case 2:
	{
		   System.out.println("Enter Roll_no");
	       int roll_no=sc.nextInt();
	       stu_impl.remove(roll_no);
	       break;
	}
	case 3:
	{
		stu_impl.display();
		break;
	}
	case 4:
	{
		System.out.println("Enter the roll number of student");
		int roll=sc.nextInt();
		stu_impl.search(roll);
		break;
	}
	case 5:
	{
		String file="D:\\Eclipse\\CoreJava\\Student_record.txt";
		stu_impl.saveTOFile(file);
		
		break;
	}
	case 6:
	{
		String file="D:\\Eclipse\\CoreJava\\Student_record.txt";
		stu_impl.readFromFile(file);
		break;
	}
	case 7:
	{
		System.out.println("You are exited from system");
		break p;
	}
	default:
	{
		System.out.println("Invalid Input!!!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}	
	
}
}
