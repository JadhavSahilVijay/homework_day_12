package homework_day_12;
class Person{
	String FirstName = "sahil";
	String LastName = "jadhav";
	public void getFirstName() {
		System.out.print(FirstName+" ");
	}
	public void getLastName() {
		System.out.print(LastName);
	}
}
public class PersonDetails extends Person{

	public static void main(String[] args) {
		PersonDetails p = new PersonDetails();
		p.getFirstName();
		p.getLastName();
	}

}
