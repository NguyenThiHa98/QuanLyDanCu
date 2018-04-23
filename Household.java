package update;

public class Household {
	public String soNha;
	public int soNguoi;
	public Person[] persons;
	public Household() {
		// TODO Auto-generated constructor stub
	}
	public Household(String soNha, int soNguoi, Person[] persons) {
		super();
		this.soNha = soNha;
		this.soNguoi = soNguoi;
		this.persons = persons;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public int getSoNguoi() {
		return soNguoi;
	}
	public void setSoNguoi(int soNguoi) {
		this.soNguoi = soNguoi;
	}
	public Person[] getPersons() {
		return persons;
	}
	public void setPersons(Person[] persons) {
		this.persons = persons;
	}
	
	
}
