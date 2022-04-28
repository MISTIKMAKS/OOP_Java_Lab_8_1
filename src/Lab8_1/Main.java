package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Point a = new Point();
		System.out.println("Point a: " + a.ToString());
        System.out.println("-------------------------");
        Color_Dot b = new Color_Dot(3, 5, "blue");
        System.out.println("Color_Dot b: " + b.ToString());
        System.out.println("Color_Dot b (Change): ");
        b.Read();
        System.out.println("Color_Dot b (Changed): " + b.ToString());
        System.out.println("-------------------------");
        Geometrical_Dot c = new Geometrical_Dot(2, 'c');
        System.out.println("Geometrical_Dot c: " + c.ToString());
        System.out.println("-------------------------");
	}

}
