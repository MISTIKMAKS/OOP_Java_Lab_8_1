package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Geometrical_Dot {

	Scanner scan = new Scanner(System.in);

    private Point point;
    private char name;

    public Geometrical_Dot()
    {
        this.point = new Point();
        this.name = '\0';
    }
    public Geometrical_Dot(int x, int y, char name)
    {
        this.point = new Point(x, y);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(int x, char name)
    {
        this.point = new Point(x, 0);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(char name, int y)
    {
        this.point = new Point(0, y);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(char name)
    {
        this.point = new Point(0, 0);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(int x, int y)
    {
        this.point = new Point(x, y);
        this.name = ' ';
    }
    public Geometrical_Dot(Geometrical_Dot c_d)
    {
        this.point = c_d.point;
        this.name = Character.toUpperCase(c_d.name);
    }
    public Point GetPoint()
    {
        return this.point;
    }
    public char GetName()
    {
        return Character.toUpperCase(this.name);
    }
    public void SetPoint(Point value)
    {
        this.point = value;
    }
    public void SetName(char value)
    {
        this.name = Character.toUpperCase(value);
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
        System.out.println("name: ");
        this.name = scan.next().charAt(0);
    }
    public String ToString()
    {
        return "Geometrical_Dot[" + "point: " + this.point.ToString() + " name: " + this.name + "]";
    }
}
