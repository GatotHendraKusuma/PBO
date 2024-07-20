package Transpose;

class Subtract {
    public static int[][] subtract(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] result = new int[row][column];

        System.out.println("\nSubtraction of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                result[r][c] = first[r][c] - second[r][c];

        Print2dArray.print2dArray(result);
        return result;
}
}