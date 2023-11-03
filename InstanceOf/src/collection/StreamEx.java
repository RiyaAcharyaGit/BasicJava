package collection;

import java.util.List;

class StreamEx implements Comparable<StreamEx> {
	private int empid;
	private String empNo;

	public StreamEx() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StreamEx(int empid, String empNo) {
		super();
		this.empid = empid;
		this.empNo = empNo;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	// if we not override the to string then if we want to print object then
	// compiler cannot understand
	// bcz compiler only take string inter etch object convert into hascode and
	// hascode printed
	@Override
	public String toString() {
		return "StreamEx [empid=" + empid + ", empNo=" + empNo + "]";

	}

	// using comparaable sorting
	@Override
	public int compareTo(StreamEx o) {
		if(this.getEmpid() > o.getEmpid())
		{
			return 1;
		} else if(this.getEmpid() < o.getEmpid()) {
			return -1;
		} else {
			return this.getEmpNo().compareTo(o.getEmpNo());
		}
	}

}
