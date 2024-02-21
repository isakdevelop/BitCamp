package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {
//        int[] arr = new int[9];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (i + 1);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();

//        int[] matrix = new int[5];

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(k + " ");
//                k++;
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        int k = 1;
        int[][] mtx = new int[5][5];

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                mtx[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        k = 1;

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                mtx[j][i] = k;
                k++;
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        k = 1;

        for (int i = 0; i < mtx.length; i++) {
            if (i % 2 != 0) {
                for (int j = mtx.length-1; j >= 0; j--) {
                    mtx[i][j] = k;
                    k++;
                }
            }   else {
                for (int j = 0; j < mtx.length; j++)    {
                    mtx[i][j] = k;
                    k++;
                }
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        k = 1;

        for (int i = mtx.length - 1; i >= 0; i--) {
            for (int j = mtx.length - 1; j >= 0; j--)    {
                mtx[j][i] = k;
                k++;
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        k = 1;

        for (int i = mtx.length - 1; i >= 0; i--) {
            for (int j = mtx.length-1; j >=0; j--)  {
                mtx[j][i] = k;
                k++;
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx.length; j++)    {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
