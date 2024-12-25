package homework_day_12;
class Indoor{
	public void indoor() {
		System.out.println("indoor games is : chess, carrom, table tenis");
	}
}
class Outdoor extends Indoor{
	public void outdoor() {
		System.out.print("Outdoor games are : cricket, football, hockey, rugby, softball, holyball");
	}
}
public class Sports extends Outdoor{

	public static void main(String[] args) {
		Sports s = new Sports();
		s.indoor();
		s.outdoor();
	}

}
