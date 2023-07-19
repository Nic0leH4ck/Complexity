

public class Main {
    public static int cntTrueReg(boolean[][] mat) {
        return cntTrueReg(mat, 0, 0);
    }

    private static int cntTrueReg(boolean[][] mat, int i, int j) {
        int sum = 0;
        if (i >= 0 && i < mat.length && j >= 0 && j < mat[0].length) { // Check if we are within the borders of the matrix
            if (mat[i][j]) { // If the index is true
                mat[i][j] = false; //
                sum++;

                // Recursively count true regions in the neighboring cells
                sum += cntTrueReg(mat, i - 1, j); // Up
                sum += cntTrueReg(mat, i + 1, j); // Down
                sum += cntTrueReg(mat, i, j - 1); // Left
                sum += cntTrueReg(mat, i, j + 1); // Right
            }
        }
        return sum;
    }
}
