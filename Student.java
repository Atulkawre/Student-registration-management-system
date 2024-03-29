package bean;

public class Student {
	
	private String sEmail;
	private String spassword;
	private String sname;
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(String sEmail, String spassword, String sname) {
		super();
		this.sEmail = sEmail;
		this.spassword = spassword;
		this.sname = sname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Student [sEmail=" + sEmail + ", spassword=" + spassword + ", sname=" + sname + "]";
	}
	
	

}
