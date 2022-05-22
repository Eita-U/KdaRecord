import java.util.HashMap;
import java.util.Map;

public class Record {
	Map<String, Person> record;
	
	public Record(){
		record = new HashMap<>();
	}
	
	public void addPerson(String name) {
		Person person = new Person(name);
		record.put(name, person);
	}
	
	public void removePerson(String name) {
		record.remove(name);
	}
	
	public Person getPerson(String name) {
		return record.get(name);
	}
	
	public Map<String, Person> getMap(){
		Map<String, Person> map = new HashMap(record);
		return map;
	}
	
	public int getKill(String name) {
		return record.get(name).getKill();
	}
	
	public int getDeath(String name) {
		return record.get(name).getDeath();
	}
	
	public int getAssist(String name) {
		return record.get(name).getAssist();
	}
	
	public void setKill(String name, int num) {
		record.get(name).setKill(num);
	}
	
	public void setDeath(String name, int num) {
		record.get(name).setDeath(num);
	}
	
	public void setAssist(String name, int num) {
		record.get(name).setAssist(num);
	}
	
	public void updateKDA(String name, int numK, int numD, int numA) {
		record.get(name).updateKDA(numK, numD, numA);
	}
	
	public void updateKill(String name) {
		record.get(name).updateKill();
	}
	
	public void updateKill(String name, int num) {
		record.get(name).updateKill(num);
	}
	
	public void updateDeath(String name) {
		record.get(name).updateDeath();
	}
	
	public void updateDeath(String name, int num) {
		record.get(name).updateDeath(num);
	}
	
	public void updateAssist(String name) {
		record.get(name).updateAssist();
	}
	
	public void updateAssist(String name, int num) {
		record.get(name).updateAssist(num);
	}
	
	public void printRecord() {
		for (Person person : record.values()) {
		    System.out.println(person.toString());
		}
	}
}
