import java.awt.*;
public class Farm
{
    private Animal[] a = new Animal[8];
    Farm(){
        a[0] = new Cow("Cow","moo", "Celia", 2);
        a[1] = new Chick("Chick","chip", "Devante", 1, Color.BLACK);
        a[2] = new Chick("Chick","chip", "Atticus", 5);
        a[3] = new Pig("Pig","oink", "Scott", 0);
        a[4] = new Pig("Pig","oink", "Soren", 2, Color.ORANGE);
        a[5] = new Minion("Minion","aah", "Mr.Nate", 2);
        a[6] = new Minion("Minion","aah", "Michele", 2);
        a[7] = new Minion("Minion","aah", "Chace", 2, Color.BLACK);
    }

    public void introduction(){
        for (int i = 0; i < a.length; i++){
            String color = a[i].getColor()+"";
            if(a[i].getColor() == Color.BLACK){
                color = "Black";
            }
            else if(a[i].getColor() == Color.BLUE){
                color = "Blue";
            }
            else if(a[i].getColor() == Color.CYAN){
                color = "Cyan";
            }
            else if(a[i].getColor() == Color.DARK_GRAY){
                color = "Dark Gray";
            }
            else if(a[i].getColor() == Color.GREEN){
                color = "Green";
            }
            else if(a[i].getColor() == Color.LIGHT_GRAY){
                color = "Light Gray";
            }
            else if(a[i].getColor() == Color.MAGENTA){
                color = "Magenta";
            }
            else if(a[i].getColor() == Color.ORANGE){
                color = "Orange";
            }
            else if(a[i].getColor() == Color.PINK){
                color = "Pink";
            }
            else if(a[i].getColor() == Color.RED){
                color = "Red";
            }
            else if(a[i].getColor() == Color.WHITE){
                color = "White";
            }
            else if(a[i].getColor() == Color.YELLOW){
                color = "Yellow";
            }
            System.out.println("My name is " + a[i].getName() + ". I am a " + a[i].getType() + ". I say " + a[i].getSound() + ". I am " + a[i].getAge() + " years old. I am " + color + ".");
        }
    }

    public void animalSounds(){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i].getType() + " goes " + a[i].getSound());
        }
    }
}