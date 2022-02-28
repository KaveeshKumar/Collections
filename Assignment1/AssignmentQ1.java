import java.util.Map;
import java.util.TreeMap;



public class AssignmentQ1 {

	public static void main(String[] args) {
		TreeMap<Long,Contacts> T1=new TreeMap<>();	
		String M = "Male";
		String F = "Female";
		Contacts C1=new Contacts(9876543244L,"kamal", "KH@gmail.com",M);
		Contacts C2=new Contacts(9234566773L, "Suriya", "S@gmail.com",M);
		Contacts C3=new Contacts(9456787662L, "Emily", "E@gmail.com",F);
		Contacts C4=new Contacts(9435234451L, "Samantha", "S@gmail.com",F);
		T1.put(9876543244L, C1);
		T1.put(9234566773L, C2);
		T1.put(9456787662L, C3);
		T1.put(9435234451L, C4);
		
		
		
		 
		
		
		for(Map.Entry m:T1.descendingMap().entrySet()) {
			long key=(long) m.getKey();
			Contacts value=(Contacts) m.getValue();
			System.out.println(key+"\t"+value.email+"\t"+value.name+"\t"+value.Gender);
			System.out.println(key);
			System.out.println(value.email+ " "+ value.name + " " +value.Gender);
			
			
			
		}}}
class Contacts {
	long phoneNumber;
	String name;
	String email;
	
	String Gender;
	public Contacts(long phoneNumber, String name, String email,String Gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.Gender=Gender;
	}}