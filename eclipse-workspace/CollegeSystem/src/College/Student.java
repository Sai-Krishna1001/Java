package College;

public class Student {

	public int sid;
	public String sname;
	public String sdept;
	public String scoll;
	
	// created parameterized and non-parameterized constructors
	public Student() {
		
	}
	
	public Student(int sid, String sname, String sdept, String scoll) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdept = sdept;
		this.scoll = scoll;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public String getScoll() {
		return scoll;
	}

	public void setScoll(String scoll) {
		this.scoll = scoll;
	}
	
	
	
	
}
