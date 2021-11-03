import java.io.*;
import java.io.Serializable;


class Student implements Serializable{
	int rollno;
	String name;
	
	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println("Roll no.: " + rollno);
		System.out.println("Name: " + name);
	}
}

class studentserial {
	public static void main(String[] args)
	{
		Student s1 = new Student(11, "Ram");
		
		try {
			FileOutputStream fo = new FileOutputStream("records.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(s1);
			oo.close();
			System.out.println("Object written to file");
		}
		catch(java.lang.Exception e) {System.out.println(e);}
		
		try {
			FileInputStream fi = new FileInputStream("records.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Student s2 = (Student)oi.readObject();
			oi.close();
			System.out.println("Successful read operation");
			s2.display();
		} catch(java.lang.Exception e) {System.out.println(e);}
	}
}
