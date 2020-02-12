import java.awt.*;
class Cow implements Animal{
    private String myType;
    private String mySound;
    private String myName;
    private int myAge;
    Color bodyColor;
    
    Cow(String type, String sound, String name, int age){
        myType = type;
        mySound = sound;
        myName = name;
        myAge = age;
        bodyColor = Color.BLACK;
    }
    
    Cow(String type, String sound, String name, int age, Color c){
        myType = type;
        mySound = sound;
        myName = name;
        myAge = age;
        bodyColor = c;
    }

    public String getSound() { 
        return mySound; 
    }

    public String getType() { 
        return myType; 
    }

    public String getName() { 
        return myName; 
    }

    public int getAge() {
        return myAge; 
    }
    
    public Color getColor() {
        return bodyColor; 
    }
    
    public void setSound(String s) { 
        mySound = s; 
    }

    public void setType(String t) { 
        myType = t; 
    }

    public void setName(String n) { 
        myName = n; 
    }

    public void setAge(int a) {
        myAge = a; 
    }
    
    public void setColor(Color c) {
        bodyColor = c; 
    }
    
}