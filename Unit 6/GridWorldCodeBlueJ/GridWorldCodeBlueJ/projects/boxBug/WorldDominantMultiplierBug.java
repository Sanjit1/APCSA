import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid; 
import info.gridworld.actor.ActorWorld; 
import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.Color; 
import java.util.Random;

public class WorldDominantMultiplierBug extends Bug{
    public WorldDominantMultiplierBug(){

    }
    Random random = new Random();
    public void act(){
        if(canMove()){
            move();
        } else {
            if(random.nextInt(15)==5) turn();
            if(random.nextInt(15)==5) turn();
            if(random.nextInt(15)==5) turn();
            turn();
        }
    }
    @Override
    public void move(){     
        Grid<Actor> gr = getGrid();   
        Location loc = getLocation();     
        Location next = loc.getAdjacentLocation(getDirection());      
        Actor neighbor = gr.get(next);  
        if (neighbor instanceof Bug){
            
            
            
            
            
            
            
            
            
            neighbor.setColor(getColor());
            Bug child = new Bug(getColor());
            int colred = random.nextInt(4);
            child.putSelfInGrid(getGrid(), new Location(getLocation().getRow(), (getLocation().getCol()-colred>0)?getLocation().getCol()-colred:getLocation().getCol()+colred));
        }
        if (gr == null)       
            return;      
        if (gr.isValid(next))      
            moveTo(next);
        else 
            removeSelfFromGrid();     
    } 

    @Override
    public boolean canMove()   {     
        Grid<Actor> gr = getGrid();     
        if (gr == null)       
            return false;     
        Location loc = getLocation();     
        Location next = loc.getAdjacentLocation(getDirection());     
        if (!gr.isValid(next))       
            return false;     
        Actor neighbor = gr.get(next);     
        return (neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Bug);   
    } 
}
