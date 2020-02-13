public interface Shape{
protected String myName;
protected double myPerimeter;
protected double myArea;
public String getName();
public double getPerimeter();
public double getArea();
public abstract void calcPerimeter();
public abstract void calcArea();
}