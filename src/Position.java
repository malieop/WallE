import java.util.Objects;

public class Position {
    private int X;
    private int Y;

    public Position(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return X == position.X &&
                Y == position.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
