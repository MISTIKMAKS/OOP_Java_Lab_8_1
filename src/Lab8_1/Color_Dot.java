package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Color_Dot {

	Scanner scan = new Scanner(System.in);

    private Point point;
    private String color;

    public Color_Dot()
    {
        this.point = new Point();
        this.color = "";
    }
    public Color_Dot(int x, int y, String color)
    {
        this.point = new Point(x, y);
        this.color = color;
    }
    public Color_Dot(int x, String color)
    {
        this.point = new Point(x, 0);
        this.color = color;
    }
    public Color_Dot(String color, int y)
    {
        this.point = new Point(0, y);
        this.color = color;
    }
    public Color_Dot(String color)
    {
        this.point = new Point(0, 0);
        this.color = color;
    }
    public Color_Dot(int x, int y)
    {
        this.point = new Point(x, y);
        this.color = "";
    }
    public Color_Dot(Color_Dot c_d)
    {
        this.point = c_d.point;
        this.color = c_d.color;
    }
    public Point GetPoint()
    {
        return this.point;
    }
    public String GetColor()
    {
        return this.color;
    }
    public void SetPoint(Point value)
    {
        this.point = value;
    }
    public void SetColor(String value)
    {
        this.color = value;
    }
    protected void finalize()
    {
    	System.out.println("Destructor Was Called");
    }
    public void Read()
    {
    	System.out.println("point: ");
        System.out.println("x: ");
        int x = scan.nextInt();
        System.out.println("y: ");
        int y = scan.nextInt();
        this.point = new Point(x, y);
        System.out.println("color: ");
        this.color = scan.next();
    }
    public String ToString()
    {
        return "Color_Dot[" + "point: " + this.point.ToString() + " color: " + this.color + "]";
    }
}
