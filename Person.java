package update;

public class Person {
	public String cmnd;
	public String hoten;
	public int tuoi, namsinh;
	public String nghe;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String cmnd, String hoten, int tuoi, int namsinh, String nghe) {
		super();
		this.cmnd = cmnd;
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.namsinh = namsinh;
		this.nghe = nghe;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getNghe() {
		return nghe;
	}
	public void setNghe(String nghe) {
		this.nghe = nghe;
	}
	
}
