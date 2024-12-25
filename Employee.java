package homework_day_12;
class Manager{
	public void manager() {
		System.out.println("I am manger of xyz Company");
	}
}
class Teamleader extends Manager{
	public void teamLeader() {
		System.out.println("I am Team Leader of xyz Company");
	}
}
public class Employee extends Teamleader{

	public void employee() {
		System.out.println("I am Employee of xyz company");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.manager();
		e.teamLeader();
		e.employee();
	}

}
