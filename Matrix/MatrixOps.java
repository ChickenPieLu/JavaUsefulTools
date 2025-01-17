package Matrix;

public class MatrixOps {

    public static double[][] add(Matrix a, Matrix b) throws IllegalArgumentException{
        if (a.getColNum() != b.getColNum() || a.getRowNum() != b.getRowNum()){
            throw new IllegalArgumentException();
        }
        double[][] result = new double[a.getRowNum()][a.getColNum()];
        for (int i = 0; i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                result[i][j] = a.getMatrix()[i][j] + b.getMatrix()[i][j];
            }
        }
        return result;
    }

    public static double[][] scalarMult(Matrix a, double c){
        double[][] result = new double[a.getRowNum()][a.getColNum()];
        for (int i = 0; i < a.getRowNum(); i++){
            for (int j = 0; j < a.getColNum(); j++){
                result[i][j] = a.getMatrix()[i][j] * c;
            }
        }
        return result;
    }

    public static double[][] transpose(Matrix a){
        double[][] result = new double[a.getColNum()][a.getRowNum()];
        for (int i = 0; i<a.getRowNum(); i++){
            for (int j = 0; j<a.getColNum(); j++){
                result[j][i] = a.getMatrix()[i][j];
            }
        }
        return result;
    }
}
