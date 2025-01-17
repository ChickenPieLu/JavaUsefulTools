public class Matrix {
    protected int rowNum;
    protected int colNum;
    protected boolean sqMatrix;
    protected double[][] m;


    public Matrix(double[][] m) throws IllegalArgumentException{
        if (m.length == 0 || !validMatrix(m)){
            throw new IllegalArgumentException("invalid matrix input");
        }
        this.rowNum = m.length;
        this.colNum = m[0].length;
        this.sqMatrix = false;
        if (this.rowNum == this.colNum) this.sqMatrix = true;
        this.m = m;
    }

    public Matrix(){
        this.rowNum = 2;
        this.colNum = 2;
        this.sqMatrix = true;
        this.m = new double[][]{{0,0},{0,0}};
    }

    public void changeMatrix(double[][] m){

    }

    public int getColNum(){
        return this.colNum;
    }

    public int getRowNum(){
        return this.rowNum;
    }

    public double[][] getMatrix(){
        return this.m;
    }

    protected boolean validMatrix(double[][] matrix){
        //checks every row has same length
        int r = matrix[0].length;
        for (double[] rows : matrix){
            if (rows.length != r) return false;
        }
        return true;
    }
}
