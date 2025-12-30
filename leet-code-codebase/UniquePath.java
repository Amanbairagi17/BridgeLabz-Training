//62. Unique Paths
class UniquePath {
    public int uniquePaths(int m, int n) {
        //intializing 2D array for m,n
        int[][] arr = new int[m][n];
		
		//making first row 1, because you can go only right 
        for(int i=0 ; i<n ; i++) arr[0][i] = 1;
		
		//making first column 1, because you can go only down 
        for(int i=0 ; i<m ; i++) arr[i][0] = 1;

		
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                arr[i][j] = Math.max(arr[i][j], arr[i-1][j] + arr[i][j-1]);
            }
        }
        return arr[m-1][n-1];
    }
}