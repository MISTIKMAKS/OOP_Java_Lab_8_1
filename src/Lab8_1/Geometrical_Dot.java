package Lab8_1;

import java.util.Scanner;
import java.lang.Math;

public class Geometrical_Dot extends Point {

	Scanner scan = new Scanner(System.in);

    private char name;

    public Geometrical_Dot()
    {
    	this.SetX(0);
        this.SetY(0);
        this.name = '\0';
    }
    public Geometrical_Dot(int x, int y, char name)
    {
    	this.SetX(x);
        this.SetY(y);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(int x, char name)
    {
    	this.SetX(x);
        this.SetY(0);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(char name, int y)
    {
    	this.SetX(0);
        this.SetY(y);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(char name)
    {
    	this.SetX(0);
        this.SetY(0);
        this.name = Character.toUpperCase(name);
    }
    public Geometrical_Dot(int x, int y)
    {
    	this.SetX(x);
        this.SetY(y);
        this.name = ' ';
    }
    public Geometrical_Dot(Geometrical_Dot c_d)
    {
    	this.SetX(c_d.GetX());
        this.SetY(c_d.GetY());
        this.name = Character.toUpperCase(c_d.name);
    }
    public char GetName()
    {
        return Character.toUpperCase(this.name);
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
        this.SetX(x);
        System.out.println("y: ");
        int y = scan.nextInt();
        this.SetY(y);
        System.out.println("name: ");
        this.name = scan.next().charAt(0);
    }
    public String ToString()
    {
        return "Geometrical_Dot[" + "point: " + "point: " + "[x: " + this.GetX() + " y: " + this.GetY() + "]" + " name: " + this.name + "]";
    }
}
