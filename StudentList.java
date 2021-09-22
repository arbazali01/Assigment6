package Assigment;

public class StudentList {

	public static void main(String[] args) {
		

		Student st1 = new Student();
		st1.setCredentials(1, "Kunal", "kpj@gmail.com", 8523812345l);
		
		Student st2 = new Student();
		st2.setCredentials(2, "Dhanpal", "ds01@gmail.com", 7569512345l);
		
		Student st3 = new Student();
		st3.setCredentials(3, "Sharan", "sharan@gmail.com", 9133612345l);
		
		Student st4 = new Student();
		st4.setCredentials(4, "Basappa", "sb01@gmail.com", 9177512345l);
		
		Student st5 = new Student();
		st5.setCredentials(5, "siddqui", "sid@gmail.com", 8978812345l);
		
		
//..............Tried to make it a DRY code, but could'nt.............
		
		System.out.println(st1.getId());
		System.out.println(st1.getName());
		System.out.println(st1.getEmail());
		System.out.println(st1.getPhNumber());
		
		System.out.println();
		
		
		System.out.println(st2.getId());
		System.out.println(st2.getName());
		System.out.println(st2.getEmail());
		System.out.println(st2.getPhNumber());
		
		System.out.println();
		
		
		System.out.println(st3.getId());
		System.out.println(st3.getName());
		System.out.println(st3.getEmail());
		System.out.println(st3.getPhNumber());
		
		System.out.println();
		
		
		System.out.println(st4.getId());
		System.out.println(st4.getName());
		System.out.println(st4.getEmail());
		System.out.println(st4.getPhNumber());
		
		System.out.println();
		
		System.out.println(st5.getId());
		System.out.println(st5.getName());
		System.out.println(st5.getEmail());
		System.out.println(st5.getPhNumber());
	
		
		
	}
	

}
