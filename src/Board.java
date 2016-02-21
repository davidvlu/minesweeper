import com.sun.tools.javac.util.Assert;

/**
 * Created by Developer on 2/20/16.
 */
public class Board {
    private final Cell[][] cells;
    private final int bombCount;

    enum CoverState {
        Covered, Uncovered;
    }

    Board(int gridSize, int bombCount) {
        Assert.check(gridSize > 1, "gridSize must be greater than 1");
        Assert.check(bombCount > 0, "bombCount must greater than 0");
        cells = new Cell[gridSize][gridSize];
        this.bombCount = bombCount;
        setupCells();
    }

    private void setupCells() {

    }

    Cell uncoverCell() {
    }

    public static void main(String[] args) {
        if (grid.uncoverCell();
        BombType bombType = grid.uncoverCell();
        if (bombType instanceof NextToBombs)

    }

}
