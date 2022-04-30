package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Color_Dot extends Point {

	Scanner scan = new Scanner(System.in);

    private String color;

    public Color_Dot()
    {
    	this.SetX(0);
        this.SetY(0);
        this.color = "";
    }
    public Color_Dot(int x, int y, String color)
    {
    	this.SetX(x);
        this.SetY(y);
        this.color = color;
    }
    public Color_Dot(int x, String color)
    {
    	this.SetX(x);
        this.SetY(0);
        this.color = color;
    }
    public Color_Dot(String color, int y)
    {
    	this.SetX(0);
        this.SetY(y);
        this.color = color;
    }
    public Color_Dot(String color)
    {
    	this.SetX(0);
        this.SetY(0);
        this.color = color;
    }
    public Color_Dot(int x, int y)
    {
    	this.SetX(x);
        this.SetY(y);
        this.color = "";
    }
    public Color_Dot(Color_Dot c_d)
    {
    	this.SetX(c_d.GetX());
        this.SetY(c_d.GetY());
        this.color = c_d.color;
    }
    public String GetColor()
    {
        return this.color;
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
        this.SetX(x);
        System.out.println("y: ");
        int y = scan.nextInt();
        this.SetY(y);
        System.out.println("color: ");
        this.color = scan.next();
    }
    public String ToString()
    {
        return "Color_Dot[" + "point: " + "[x: " + this.GetX() + " y: " + this.GetY() + "]" + " color: " + this.color + "]";
    }
}
