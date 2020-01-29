import info.gridworld.grid.Location;

public class Testicals{
    public static void main(){
        Location loc1 = new Location(4, 3);
        Location loc2 = new Location(3, 4);
        int dir = loc1.getDirectionToward(new Location(6,5));
        System.out.println(dir);
    }
}