import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {

	public Helper() {
		System.out.println("In Constructor Helper");
	}
	
	public void m1() {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.close();
		List<String> list = new ArrayList<>();
		for(int index = 0; index < 50000; ++index) {
			list.add("Number :" + index);
		}
	}
}
