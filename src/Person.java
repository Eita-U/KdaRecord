
public class Person {
	String name;
	int kill;
	int death;
	int assist;
	
	public Person(String name) {
		this.name = name;
		kill = 0;
		death = 0;
		assist = 0;
	}
	
	public int getKill() {
		return kill;
	}
	
	public int getDeath() {
		return death;
	}
	
	public int getAssist() {
		return assist;
	}
	
	public void setKill(int num) {
		kill = num;
	}
	
	public void setDeath(int num) {
		death = num;
	}
	
	public void setAssist(int num) {
		assist = num;
	}
	
	public void updateKDA(int numK, int numD, int numA) {
		kill += numK;
		death += numD;
		assist += numA;
	}
	
	public void updateKill() {
		kill++;
	}
	
	public void updateKill(int num) {
		kill += num;
	}
	
	public void updateDeath() {
		death++;
	}
	
	public void updateDeath(int num) {
		death += num;
	}
	
	public void updateAssist() {
		assist++;
	}
	
	public void updateAssist(int num) {
		assist += num;
	}
	
	public String toString() {
		return String.format("%s - Kill: %d   Death: %d   Assist: %d", name, kill, death, assist);
	}
}
