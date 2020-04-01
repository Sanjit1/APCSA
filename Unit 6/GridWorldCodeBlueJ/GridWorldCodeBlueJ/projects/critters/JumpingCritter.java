import info.gridworld.grid.*; 
import info.gridworld.actor.*; 
import java.awt.*; 
import java.util.*;


public class JumpingCritter extends Critter{
    GridWorldUtilities util = new GridWorldUtilities();
    Random r = new Random();
    public JumpingCritter(){
    }
    
    public Location chooseMoveLoc(){
        ArrayList<Location> locs = util.getEmptyLocations(getGrid());
        if (locs.size()==0){
            removeSelfFromGrid();
            return null;
        }
        else{
            return locs.get(r.nextInt(locs.size()));
        }
    }
    
}
