package in.ineuron.dto;

import java.io.Serializable;

public class Student  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer sid;
	private String name;
	private Integer sage;
	private String saddress;
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
	
	
	
	
	

}
