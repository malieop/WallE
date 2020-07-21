
import java.util.HashSet;

public class WallE {
    // Number of Garbage
    private int garbageHolder = 1;
    // Position of Wall-E
    private Position position;
    // Collection of positions that Wall-E walk by
    private HashSet<Position> positionsPassedBy = new HashSet<>();

    //Constructor
    public WallE() {
        this.position = new Position(0,0);
        this.positionsPassedBy.add(getPosition());
    }

    //Methods

    private boolean addPositionToCollection(Position position) {
        return positionsPassedBy.add(position);
    }

    private void updatePositionWallE(Position position, char direction) {
        // Use the function walkWallE() to receive the new position of WallE
        // And then set it as the new position
        setPosition(walkWallE(position, direction));
    }

    // Method that has the process of the movement of WallE
    // Moves WallE, saves his position and add the value on garbage holder if the position is new
    private void moveWallE(Position position, char direction) {
        updatePositionWallE(position, direction);
        // If the Position is new addPositionToCollection == True
        // If not new addPositionToCollection == False
        if(addPositionToCollection(getPosition())) {
            // if the position is new add a value of the garbage holder
            addGarbageHolder();
        }
    }

    private Position walkWallE(Position position, char direction) {
        // Local Variable of next position of WallE
        Position nextPosition = new Position(position.getX(),position.getY());

        switch (direction) {
            case 'N':
                nextPosition.setY(nextPosition.getY() + 1 );
                break;
            case 'S':
                nextPosition.setY(nextPosition.getY() - 1 );
                break;
            case 'E':
                nextPosition.setX(nextPosition.getX() + 1 );
                break;
            case 'W':
                nextPosition.setX(nextPosition.getX() - 1 );
                break;
            default:
                System.out.println("The input don't correspond to any possible directions");
        }
        return nextPosition;
    }
    public int makeWallETrajectory(String wallETrajectory){
        if(!wallETrajectory.isEmpty()) {
            for(char character: wallETrajectory.toCharArray()){
                moveWallE(this.getPosition(),character);
            }
        }
        return this.getGarbageHolder();
    }
    // Getters and Setters
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position= new Position(position.getX(),position.getY());
    }

    public int getGarbageHolder() {
        return garbageHolder;
    }

    public void addGarbageHolder() {
        this.garbageHolder = ++this.garbageHolder;
    }

}

