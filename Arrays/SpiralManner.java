package Arrays;

import java.util.List;
import java.util.ArrayList;
public class SpiralManner {
    public static List<Integer> SpiralOrder(int[][] matrix){
        int m = matrix.length; //row
        int n = matrix[0].length; // col
        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;
        List<Integer> result = new ArrayList<>();
        while(srow <= erow && scol <= ecol){
            // top
            for(int j=scol;j<=ecol;j++){
                result.add(matrix[srow][j]);
            }

            // right side
            for(int i=srow+1;i<=erow;i++){
                result.add(matrix[i][ecol]);
            }

            // bottom
            for(int j=ecol-1;j>=scol;j--){
                if(srow == erow) break;
                result.add(matrix[erow][j]);
            }

            // left side
            for(int i=erow-1;i>=srow+1;i--){
                if(scol == ecol) break;
                result.add(matrix[i][scol]);
            }
            srow++;scol++;
            erow--;ecol--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = SpiralOrder(matrix);
        for(int i=0;i<result.size();i++){
            if(i != result.size()-1){
                System.out.print(result.get(i)+"->");
            }else{
                System.out.println(result.get(i));
            }
        }
    }
}


