class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int noOfElements = m*n;
        int count = 0;
        int [] result = new int [noOfElements];
        
        int i = 0;
        int j = 0;
        int dir = 1;
        
        while (count < noOfElements) {
            
            result[count++] = mat[i][j];
            System.out.println ("I: "+i+", J:"+j+", Dir: "+dir+", Count:"+count+", Mat[i][j]: "+mat[i][j]);
            
            if (dir == 1){ //Dir up
                
                if (j == n - 1) {
                    i++;
                    dir = -1;
                }else if (i == 0) {
                    j++;
                    dir = -1;
                }else {
                    i--;
                    j++;
                }
                
            }else { // Dir Down
                
                if (i == m - 1){
                    dir = 1;
                    j++;
                }else if ( j == 0) {
                    i++;
                    dir = 1;
                }else {
                    i++;
                    j--;
                }
            }
            
        }
        return result;
    }
}
