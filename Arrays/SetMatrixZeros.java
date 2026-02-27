package Arrays;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstrowzero = false;
        boolean firstcolzero = false;

        // check first row is zero
        for(int i=0;i<n;i++){
            if(matrix[0][i] == 0){
                firstrowzero = true;
                break;
            }
        }

        // check first col is zero
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstcolzero = true;
                break;
            }
        }

        // use first row and col as markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; //mark row
                    matrix[0][j] = 0; //mark column
                }
            }
        }

        // set zero on markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstrowzero){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }

        if(firstcolzero){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}


