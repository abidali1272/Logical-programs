package FeeReceiptSystem;

import java.util.Date;

public class AllDetail {
	
	private int Receiptno;
	private String Studentname;
	private long mobileno;
	private Date date;
	@Override
	public String toString() {
		return "AllDetail [Receiptno=" + Receiptno + ", Studentname=" + Studentname + ", mobileno=" + mobileno
				+ ", date=" + date + ", course=" + course + ", coursefee=" + coursefee + ", paidFee=" + paidFee
				+ ", balancefee=" + balancefee + "]";
	}
	public AllDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllDetail(int receiptno, String studentname, long mobileno, Date date, String course, float coursefee,
			float paidFee, float balancefee) {
		super();
		Receiptno = receiptno;
		Studentname = studentname;
		this.mobileno = mobileno;
		this.date = date;
		this.course = course;
		this.coursefee = coursefee;
		this.paidFee = paidFee;
		this.balancefee = balancefee;
	}
	private String course;
	private float coursefee;
	private float paidFee;
	private float balancefee;
	
	public int getReceiptno() {
		return Receiptno;
	}
	public void setReceiptno(int receiptno) {
		Receiptno = receiptno;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public float getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(float coursefee) {
		
		this.coursefee = coursefee;
	}
	
	public float getBalancefee() {
		return balancefee;
	}
	public void setBalancefee(float balancefee) {
		this.balancefee = balancefee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
			switch(course)
			{
			case "java":
				this.course=course;
				break;
				
			case "python":
				this.course=course;
				break;
				
				default :System.out.println("course are not available");
			
			}
		this.course = course;
	}
	
	public float getPaidFee() {
		return paidFee;
	}
	public void setPaidFee(float paidFee) {
		if(coursefee>=paidFee) {
			this.paidFee = paidFee;
			}
			else {
				System.out.println("Enter valid amount");
			}
	}
	
	
	
	

}
