public class Main {
    ublic static boolean search(int[][] mat, int num) {
        if (num < mat[0][0] || num > mat[mat.length - 1][0])
            return false;

        int size = mat.length;
        int lastRow = size - 1;
        int lastCol = size - 1;
        int firstRow = 0;
        int firstCol = 0;
        int maxQ1 = 0;
        int maxQ2 = 0;
        int maxQ3 = 0;
        int maxQ4 = 0;

        while (size >= 1) // O(log n), because we divide our matrix size by two in each iteration
        {
            maxQ1 = mat[(lastRow + firstRow) / 2][firstCol];
            maxQ2 = mat[(lastRow + firstRow) / 2][firstCol + (size / 2)];
            maxQ3 = mat[lastRow][firstCol + (size / 2)];
            maxQ4 = mat[lastRow][firstCol];

            if (size == 1)
                break;

            if (num <= maxQ1) {
                lastRow = (firstRow + lastRow) / 2;
                lastCol = (firstCol + lastCol) / 2;
            }

            else if (num <= maxQ2) {
                lastRow = (firstRow + lastRow) / 2;
                firstCol = firstCol + (size / 2);
            }

            else if (num <= maxQ3) {
                firstRow = firstRow + (size / 2);
                firstCol = firstCol + (size / 2);
            }

            else {
                firstRow = firstRow + (size / 2);
                lastCol = (firstCol + lastCol) / 2;
            }

            size = size / 2;

        }

        if (num == maxQ1) {
            System.out.println("row: " + firstRow + "col: " + firstCol);
            return true;
        }

        if (num == maxQ2) {
            System.out.println("row: " + firstRow + "col: " + lastCol);
            return true;
        }

        if (num == maxQ3) {
            System.out.println("row: " + lastRow + "col: " + lastCol);
            return true;
        }

        if (num == maxQ4) {
            System.out.println("row: " + lastRow + " col: " + firstCol);
            return true;
        }
        return false;
    }

    // Time complexity: O(log n)
    // Space complexity: O(1)
}