package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Point {

	Scanner scan = new Scanner(System.in);

    private int x;
    private int y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public int GetX()
    {
        return this.x;
    }
    public int GetY()
    {
        return this.y;
    }
    public void SetX(int value)
    {
        this.x = value;
    }
    public void SetY(int value)
    {
        this.y = value;
    }
    protected void finalize()
    {
    	System.out.println("Destructor Was Called");
    }
    public void Read()
    {
    	System.out.println("x: ");
        this.x = scan.nextInt();
        System.out.println("y: ");
        this.y = scan.nextInt();
    }
    public String ToString()
    {
        return "Point[" + "x: " + this.x + " y: " + this.y + "]";
    }
}
