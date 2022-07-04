//LC74
// 
//Search in 2D Matrix
//We treat the 2D matrix as a 1D array and do binary search
//time complexity = log(mn)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            int r = mid/n;
            int c = mid%n;
            if(matrix[r][c]==target) return true;
            if (matrix[r][c]>target){
                high = mid-1; 
            }
            else{
                low = mid+1;
            }
        }
            
        return false;
    }
}