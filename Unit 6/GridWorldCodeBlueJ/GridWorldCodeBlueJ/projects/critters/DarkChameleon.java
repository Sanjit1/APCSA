import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class DarkChameleon extends Critter{

    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0){
            int r = (int) (getColor().getRed()*0.95);
            int g = (int) (getColor().getGreen()*0.95);
            int b = (int) (getColor().getBlue()*0.95);
            setColor(new Color(r, g, b));
            return;
        }
        int r = (int) (Math.random() * n);

        Actor other = actors.get(r);
        setColor(other.getColor());
    }


    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}