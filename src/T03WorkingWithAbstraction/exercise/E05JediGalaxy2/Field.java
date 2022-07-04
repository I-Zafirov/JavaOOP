package T03WorkingWithAbstraction.exercise.E05JediGalaxy2;

public class Field {
    private int[][] matrix;

    public Field(int[][] matrix) {
        this.matrix = matrix;
        this.setFieldValues();
    }

    private void setFieldValues() {
        int value = 0;
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix[r].length; c++) {
                matrix[r][c] = value++;
            }
        }
    }

    public int getLength() {
        return this.matrix.length;
    }

    public int getColLength(int row) {
        return this.matrix[row].length;
    }

    public void setCell(int row, int col, int newValue) {
        this.matrix[row][col] = newValue;
    }

    public long getCell(int row, int col) {
        return this.matrix[row][col];
    }
}
