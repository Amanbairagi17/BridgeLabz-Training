class MagicSquare{
    private boolean isMagicGrid(int[][] grid, int row, int col){
        //to find unique numbers berween 1 to 9
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                int num = grid[row + i][col + j];
                if(num < 1 || num > 9 || set.contains(num)) return false;
                else set.add(num);
            }
        }

        //calculate sum of first row 
        int sum = grid[row][col] + grid[row][col+1] + grid[row][col+2];

        //check for each row and col if both have same sum or not
        for(int i=0 ; i<3 ; i++){
            if(grid[row + i][col] + grid[row + i][col + 1] + grid[row + i][col + 2] != sum)
            return false;
            if(grid[row][col + i] + grid[row + 1][col + i] + grid[row + 2][col + i] != sum)
            return false;
        }

        //checking sum for diagonal and anti-diagonal
        if(grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != sum)
            return false;

        if(grid[row][col + 2] + grid[row + 1][col + 1] + grid[row +2][col] != sum)
            return false;

        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for(int i=0 ; i<=n-3 ; i++){
            for(int j=0 ; j<=m-3 ; j++){
                if(isMagicGrid(grid, i, j)) count++;
            }
        }
        return count;
    }
}