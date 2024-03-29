package bean;

public class Course {
	
	private int cId;
	private String Cname;
	private int fees;
	private String cInfo;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getcInfo() {
		return cInfo;
	}
	public void setcInfo(String cInfo) {
		this.cInfo = cInfo;
	}
	public Course(int cId, String cname, int fees, String cInfo) {
		super();
		this.cId = cId;
		Cname = cname;
		this.fees = fees;
		this.cInfo = cInfo;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Course [cId=" + cId + ", Cname=" + Cname + ", fees=" + fees + ", cInfo=" + cInfo + "]";
	}
	
	
	

}
