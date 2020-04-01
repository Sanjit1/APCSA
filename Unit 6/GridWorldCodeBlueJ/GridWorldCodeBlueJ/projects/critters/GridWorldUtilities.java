import info.gridworld.grid.*; 
import info.gridworld.actor.*; 
import java.util.*;

public class GridWorldUtilities{
    public GridWorldUtilities(){}
    public static ArrayList<Location> getEmptyLocations(Grid<Actor> grid){
        ArrayList<Location> locs = new ArrayList<Location>();
        int numberOfRows = grid.getNumRows();
        int numberOfCols = grid.getNumCols();
        for (int row = 0; row<numberOfRows; row++){
            for (int col = 0; col<numberOfCols; col++){
                Location loc = new Location(row, col);
                if (grid.get(loc) == null)
                    locs.add(loc);
            }
        }
        return locs;
    }
}
