
public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Main in Lab1");
		Helper helper = new Helper();
		for (int index = 0; index < 5000; ++index) {
			helper.m1();
		}
	}

}
