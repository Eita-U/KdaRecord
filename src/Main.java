
public class Main {

	public static void main(String[] args) {
		Record record = new Record();
		
		record.addPerson("Aiden");
		record.addPerson("Brian");
		record.addPerson("Caleb");
		record.addPerson("David");
		
		//1st round
		record.updateKDA("Aiden", 2, 1, 1);
		record.updateKDA("Brian", 3, 0, 2);
		record.updateKDA("Caleb", 1, 0, 0);
		record.updateKDA("David", 0, 5, 0);
		
		System.out.println("1st round");
		record.printRecord();
		
		System.out.println();
		
		//2nd round
		record.updateKDA("Aiden", 3, 3, 1);
		record.updateKDA("Brian", 4, 7, 2);
		record.updateKDA("Caleb", 0, 2, 10);
		record.updateKDA("David", 10, 5, 0);
			
		System.out.println("2nd round");
		record.printRecord();
	}

}
