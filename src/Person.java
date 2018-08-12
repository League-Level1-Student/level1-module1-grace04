
public class Person {
	
	private String name;
	private String superpower;
	
	public String getName() {
		return name;
	}
	public String getSuperpower() {
		return superpower;
	}
	
	public void setName(String names) {
		name=names;
	}
	public void setSuperpower(String superpowers) {
		superpower=superpowers; 
	}
	
	public String toString(){
		return name + " has mad " + superpower + " skills!!!";
	}
}
