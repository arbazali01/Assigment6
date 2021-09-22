package Assigment;

public class Student {

	private int id;
	private String name;
	private String email;
	private long phNumber;
	
	
	public void setCredentials(int id, String name, String email, long phNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNumber = phNumber;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public long getPhNumber() {
		return this.phNumber;
	}
}
