public class Matrix {

    private int nrow,ncol;
    private double element[][];

    public Matrix(int nrow,int ncol) {
        this.nrow = nrow;
        this.ncol = ncol;
        element=new double[this.nrow][this.ncol];
    }

    public Matrix(double mat[][]) {
        this.nrow = mat.length;
        this.ncol = mat[0].length;
        element = mat;
    }

    public void identity() {
        if ( nrow==ncol)
        {
            for(int r=0;r<nrow;r++)
                element[r][r] = 1;
        }
    }

    public void diagonal(double diae[]) {
        if ( nrow==ncol)
        {
            for(int r=0;r<nrow;r++)
                element[r][r] = diae[r];
        }
    }

    public int getNrow() {
        return nrow;
    }
    public int getNcol() {
        return ncol;
    }
    public double getElement(int row,int col) {
        return element[row][col];
    }

    public void setElement(int row,int col,double val) {
        element[row][col] = val;
    }

    public Matrix transpose() {
        Matrix mat = new Matrix(this.ncol,this.nrow);
        for(int r=0;r<nrow;r++) {
            for(int c=0;c<ncol;c++)
                mat.setElement(c,r, element[r][c]);
        }
        return mat;

    }

    public  Matrix cofactor(int m,int n)
    {
        Matrix cmat=new Matrix(this.getNrow()-1,this.getNcol()-1);
        int i=0,j=0;
        for(int r=0;r<this.getNrow();r++)
        {
            j=0;
            for(int c=0;c<this.getNcol();c++)
            {
                if ( r!=m && c!=n )
                    cmat.setElement(i, j++, this.getElement(r, c));
            }
            if ( r!=m )
                i++;
        }
        return cmat;
    }

    public String toString() {
        StringBuffer matstr=new StringBuffer();
        for(int r=0;r<nrow;r++) {
            for(int c=0;c<ncol;c++)
                matstr.append( element[r][c] +"  "  );

            matstr.append( "rn");
        }
        return matstr.toString();
    }



    public static void main(String str[]) {


        Matrix A =new Matrix(3,3);
        System.out.println("Matrix A Zero Matrix");
        System.out.println(A.toString());



        System.out.println("Matrix A Leading Diagonal Matrix");
        double diae[] ={1, 4, 6};
        A.diagonal(diae);
        System.out.println(A.toString());

        double vals[][]={{3,1,2},{2,-1,1},{1,3,-1}};
        Matrix B =new Matrix(vals);
        System.out.println("Matrix B");
        System.out.println(B.toString());


        System.out.println("Transpose of Matrix B ");
        Matrix Bt=B.transpose();
        System.out.println(Bt.toString());

        Matrix C00=B.cofactor(0, 0);
        System.out.println("Cofactor of Matrix B(i=0,j=0)");
        System.out.println(C00.toString());

        Matrix C01=B.cofactor(0, 1);
        System.out.println("Cofactor of Matrix B(i=0,j=1)");
        System.out.println(C01.toString());

        Matrix C02=B.cofactor(0, 2);
        System.out.println("Cofactor of Matrix B(i=0,j=2)");
        System.out.println(C02.toString());
    }

}