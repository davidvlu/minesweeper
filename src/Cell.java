/**
 * Created by Developer on 2/20/16.
 */
class Cell {
    enum CoverState { Covered, Uncovered };

    private int row;
    private int column;
    private CoverState coverState = CoverState.Uncovered;
    private int adjacentBombCount= 0;
    private boolean isBomb = false;

    Cell(boolean isBomb, int adjacentBombCount) {
        this.isBomb = isBomb;
        this.adjacentBombCount = adjacentBombCount;
    }

    boolean uncover() {
        if (coverState == CoverState.Covered) {
            return false;
        }
        coverState = CoverState.Uncovered;
test
    }
}
