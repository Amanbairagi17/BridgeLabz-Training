class CountNegetiveInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        // for(int i=0 ; i< n ; i++){
        //     for(int j=0 ; j<m ; j++){
        //         if(grid[i][j] < 0){
        //             count += m-j < 0 ? 0: m-j;
        //             //System.out.println(count);
        //             break;
        //         }
        //     }
        // }

        for(int i=0 ; i<n ; i++){
            int low = 0;
            int high = m-1;

            int idx = m;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(grid[i][mid] < 0) {
                    idx = mid;
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
               // System.out.println(idx);
            }
            count += m - idx;
        }
        return count;
    }
}