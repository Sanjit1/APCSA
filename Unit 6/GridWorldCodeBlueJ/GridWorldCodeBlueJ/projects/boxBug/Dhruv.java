import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid; 
import info.gridworld.actor.ActorWorld; 
import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.Color; 
import java.util.Random;

public class Dhruv extends Bug{
    public Dhruv() {

    }
    public void act(){
        if(canMove()){
            move();
        } else if (canMove2()){
            move2();
        } else{
            turn();
        }
    }
    public boolean canMove2()   {     
        Grid<Actor> gr = getGrid();     
        if (gr == null)       
            return false;     
        Location loc = getLocation();    
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()); 
        if (!gr.isValid(next))   
            return false;     
        Actor neighbor = gr.get(next);  
        return (neighbor == null) || (neighbor instanceof Flower);   
    } 
    public void move2()   {     
        Grid<Actor> gr = getGrid();    
        if (gr == null)    
            return;    
        Location loc = getLocation();   
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());   
        if (gr.isValid(next))  
            moveTo(next);     
        else   
            removeSelfFromGrid();
    } 
}
