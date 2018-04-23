package update;

import java.util.Scanner;

public class Management {
	public static void main(String[] args) {
		int chon;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		Household[] householdlist = null;
		Person[] personlist = null;
		Management mng = new Management();

		do {
			System.out.println("Chon 1: De nhap n ho dan");
			System.out.println("Chon 2: De hien thi thong tin ho dan");
			System.out.println("Chon 3: De tim kiem thong tin ca nhan theo so CMND");
			System.out.println("Chon 0: De ket thuc");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Nhap n ho dan");
				n = sc.nextInt();
				householdlist = new Household[n];
				mng.inputHousehold(householdlist);
				break;
			case 2:
				mng.showHousehold(householdlist);
				System.out.println("====================");
				break;
			case 3:
				Person temp = new Person();
				temp = mng.searchPerson(householdlist);
				if(temp != null) {
					System.out.println("Thong tin cua nguoi can tim:");
					mng.showPerson(temp);
				}
				else {
					System.out.println("Khong tim thay nguoi can tim.");
				}
				System.out.println("====================");
				break;
			case 0:

				break;
			default:
				break;
			}
		} while (chon != 0);

	}

	public Household[] inputHousehold(Household[] householdlist) {
		Scanner intValue = new Scanner(System.in);
		Scanner stringValue = new Scanner(System.in);
		Household household = null;
		Person[] personlist = null;
		Person[] persontemp;
		String soNha;
		int soNguoi;
		for (int i = 0; i < householdlist.length; i++) {
			household = new Household();
			System.out.println("Nhap thong tin ho gia dinh thu " + (i + 1));
			System.out.println("Nhap so nha:");
			soNha = intValue.nextLine();
			household.setSoNha(soNha);
			System.out.println("Nhap so nguoi trong gia dinh:");
			soNguoi = stringValue.nextInt();
			household.setSoNguoi(soNguoi);
			persontemp = this.inputPerson(personlist, soNguoi);
			household.setPersons(persontemp);
			householdlist[i] = household;
		}
		return householdlist;
	}

	public Person[] inputPerson(Person[] personlist, int size) {
		Person person = null;
		personlist = new Person[size];
		Scanner intValue = new Scanner(System.in);
		Scanner stringValue = new Scanner(System.in);
		for (int i = 0; i < personlist.length; i++) {
			person = new Person();
			System.out.println("Nhap thong tin nguoi thu " + (i + 1));
			System.out.println("Nhap so cmnd:");
			person.setCmnd(stringValue.nextLine());
			System.out.println("Nhap ho ten:");
			person.setHoten(stringValue.nextLine());
			System.out.println("Nhap tuoi:");
			person.setTuoi(intValue.nextInt());
			System.out.println("Nhap nam sinh:");
			person.setNamsinh(intValue.nextInt());
			System.out.println("Nhap nghe nghiep:");
			person.setNghe(stringValue.nextLine());
			personlist[i] = person;
		}
		return personlist;
	}

	public void showHousehold(Household[] householdlist) {
		int demH = 1;
		for (Household household : householdlist) {
			System.out.println("Thong tin ho gia dinh thu " + demH);
			System.out.println("\tSo nha: " + household.getSoNha());
			System.out.println("\tSo nguoi: " + household.soNguoi);
			this.showPersonList(household.getPersons());
			demH++;
			System.out.println("====================");
		}
	}

	public void showPerson(Person person) {
		System.out.println("\tSo cmnd: " + person.getCmnd());
		System.out.println("\tHo ten: " + person.getHoten());
		System.out.println("\tTuoi: " + person.getTuoi());
		System.out.println("\tNam sinh: " + person.getTuoi());
		System.out.println("\tNghe nghiep: " + person.getNghe());
	}
	public void showPersonList(Person[] personlist) {
		int demP = 1;
		for (Person person : personlist) {
			System.out.println("\tThong tin ca nhan nguoi thu "+demP);
			this.showPerson(person);
			demP++;
			System.out.println("\t**************");
		}
	}
	public Person searchPerson(Household[] householdlist) {
		Person[] personlist;
		Household household = new Household();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so cmnd cua nguoi can tim:");
		String s = sc.nextLine();
		for (int i = 0; i < householdlist.length; i++) {
			personlist = householdlist[i].getPersons();
			for (int j = 0; j < personlist.length; j++) {
				if(s.equalsIgnoreCase(personlist[j].getCmnd())) {
					return personlist[j];
				}
			}
		}
		return null;
	}
}
