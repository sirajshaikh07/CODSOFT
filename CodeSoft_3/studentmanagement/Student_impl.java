package CodeSoft_3.studentmanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student_impl implements Student_dao {

	List<Student> student_data=new ArrayList();
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		student_data.add(s);
		System.out.println("The Student Record is susccesfully added");
		
		
		
	}

	@Override
	public  void remove(int roll_no) {
		// TODO Auto-generated method stub
		if(student_data.removeIf(roll->(roll.getRoll_no()==roll_no)))
		{
			System.out.println("the studen is remove successfully");
		}
		else
		{
			System.out.println("The student does not found!!!");
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		ListIterator<Student>itr=student_data.listIterator();
		int record_no=1;
		
		System.out.println("-------------DISPLAYING ALL THE STUDENTS RECORDS-----------------");
		if(itr.hasNext())
		{
			
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println("RECORD NUMBER "+record_no);
			System.out.println();
			System.out.println("NAME    |"+s.getName());
			System.out.println("ROLL NO |"+s.getRoll_no());
			System.out.println("GRADE   |"+s.getGrade());
			System.out.println("ADDRESS |"+s.getAddress());
			System.out.println("HEIGHT  |"+s.getHeight());
			System.out.println("-------------------------------------------------------------");
			System.out.println();
			record_no+=1;
			
		}
		}
		else
		{
			System.out.println("------------------------RECOURDS FOUND EMPTY------------------");
		}
	}

	@Override
	public void search(int rollno) {
		// TODO Auto-generated method stub
		ListIterator<Student>itr=student_data.listIterator();
		boolean record=false;
		if(itr.hasNext())
		{
		while(itr.hasNext())
		{
			Student s=itr.next();
			if(s.getRoll_no()==rollno)
			{
				System.out.println("--------------------"+s.getRoll_no()+"----------------------------");
				System.out.println("NAME    |"+s.getName());
			    System.out.println("GRADE   |"+s.getGrade());
				System.out.println("ADDRESS |"+s.getAddress());
				System.out.println("HEIGHT  |"+s.getHeight());s.toString();
				record=true;
				
				
		}
		
			
			
	}
		if(record==false)
		{
			System.out.println("No Such Roll no exist ");
			
		}
	
		
	}
		else
		{
			System.out.println("Empty Records Found");
		}
		
	

}
	public void saveTOFile(String file)
	{
		try
		{
			FileOutputStream fo=new FileOutputStream(file);
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(student_data);
			os.close();
			fo.close();
			
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
			System.out.println("The data is save in file successfully");
		}
		
	}

	@Override
	public void readFromFile(String file) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi=new FileInputStream(file);
			ObjectInputStream oi=new ObjectInputStream(fi);
			System.out.println(oi.readObject());
			
			
			oi.close();
			fi.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
