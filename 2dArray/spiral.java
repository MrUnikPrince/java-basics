

public class spiral {
    public static void main(String[] args) {
        int arr[][] = {{10},{20},{30}};
        spiralPrint(arr);
    }  
    public static void spiralPrint(int matrix[][]){
		int startRow =0;
        int startCol=0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        if(matrix.length==0){
            return;
        }
        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;startRow++;
            endCol--;endRow--;
        }   
	}  
}
