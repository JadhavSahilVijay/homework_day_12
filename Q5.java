package homework_day_12;
class Clanguage{
	public void featureOfC() {
		System.out.println("C language is Platfrom dependent");
	}
}
class Cpp extends Clanguage{
	public void featuresOfCpp() {
		System.out.println("CPP is platform dependent");
	}
}
class Java extends Cpp{
	public void featuresOfJava() {
		System.out.println("Java is platform independent");
	}
}
public class Q5 extends Java{

	public static void main(String[] args) {
		Q5 p = new Q5();
		p.featureOfC();
		p.featuresOfCpp();
		p.featuresOfJava();
	}

}
