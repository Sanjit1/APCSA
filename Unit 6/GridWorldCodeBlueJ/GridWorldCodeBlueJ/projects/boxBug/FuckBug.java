import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid; 
import info.gridworld.actor.ActorWorld; 
import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.Color; 
import java.util.Random;

public class FuckBug extends Bug
{
    private int steps;
    public String gender;
    public ActorWorld w;
    Random random = new Random();
    public FuckBug(String gen, ActorWorld world)
    {
        gender = gen;
        w = world;
    }

    public void act()
    {
        if (canMove())
        {
            move();

            if(random.nextInt(15)==5) turn();
            if(random.nextInt(69)==8) turn();
            if(random.nextInt(420)==12) turn();
            if(random.nextInt(16)==3) turn();
            if(random.nextInt(666)==444) turn();
            if(random.nextInt(52)==23) antiTurn();

        }
        else{
            Grid<Actor> gr = getGrid(); 
            Location loc = getLocation();
            int dir = getDirection();
            Location next = loc.getAdjacentLocation(dir);
            turn();
            if((0 <= next.getRow() && next.getRow() < gr.getNumRows()) && (0 <= next.getCol() && next.getCol() <gr.getNumCols())) {
                Actor neighbor = gr.get(next);   
                if(neighbor instanceof FuckBug && gender=="Female"){
                    moveTo(new Location(6,8));
                    FuckBug n = (FuckBug) neighbor;
                    if(n.gender == "Male"){
                        String moan = "moan.wav";
                        MakeSound.moan(moan);
                        next = loc.getAdjacentLocation(dir);
                        FuckBug [] arr = {new MaleBug(w), new FemaleBug(w)};
                        FuckBug baby = arr[random.nextInt(arr.length)];
                        baby.setColor(averageColor(n.getColor(), getColor()));
                        w.add(placeToMove(loc), baby);
                    }
                }
            }
        }
    }

    public Color averageColor(Color col1, Color col2){
        int red1 = col1.getRed();
        int green1 = col1.getGreen();
        int blue1 = col1.getBlue();
        int red2 = col2.getRed();
        int green2 = col2.getGreen();
        int blue2 = col2.getBlue();
        int avgRed = (int) (Math.sqrt((Math.pow(red1, 2) + Math.pow(red2, 2))/2));
        int avgGreen = (int) (Math.sqrt((Math.pow(green1, 2) + Math.pow(green2, 2))/2));
        int avgBlue = (int) (Math.sqrt((Math.pow(blue1, 2) + Math.pow(blue2, 2))/2));
        //return new Color(avgRed, avgGreen, avgBlue);
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Override

    public void move(){     
        Grid<Actor> gr = getGrid();     
        if (gr == null)       
            return;     
        Location loc = getLocation();     
        Location next = loc.getAdjacentLocation(getDirection());    
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
        return (neighbor == null) || (neighbor instanceof Flower);   
    } 

    public boolean canMoveTo(Location next){ 
        Grid<Actor> gr = getGrid(); 
        if (!gr.isValid(next))       
            return false;     
        Actor neighbor = gr.get(next);     
        return (neighbor == null) || (neighbor instanceof Flower); 
    }

    public Location placeToMove(Location current){
        int[] directionList = {Location.NORTH, Location.EAST, Location.SOUTH, Location.WEST};
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j<4;j++){
                for(int k = 0; k<i+1;k++){
                    if(canMoveTo(current.getAdjacentLocation(directionList[j]).getAdjacentLocation(directionList[k]))){
                        return current.getAdjacentLocation(directionList[j]).getAdjacentLocation(directionList[k]);
                    }
                }
            }
        }
        return null;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String g){
        gender = g;
    }

    public void antiTurn()   {     setDirection(getDirection() - Location.HALF_RIGHT);   } 
}
