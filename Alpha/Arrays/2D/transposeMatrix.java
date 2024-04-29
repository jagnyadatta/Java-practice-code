public class transposeMatrix {
    public static void printMatrix(int transMtrix[][]){
        for(int i=0;i<transMtrix.length;i++){
            for(int j=0;j<transMtrix[0].length;j++){
                System.out.print(transMtrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{2,3,7},{5,6,7}};
        int row=2,col=3;
        printMatrix(matrix);
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
}
