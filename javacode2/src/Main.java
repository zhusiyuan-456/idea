package io;
import java.nio.file.*;;
 class ReadTextAsString
{
    public static String LCS(String X, String Y, int m, int n, int[][] T)
    {

        if (m == 0 || n == 0) {
            return new String();
        }

        if (X.charAt(m - 1) == Y.charAt(n - 1))
        {
            return LCS(X, Y, m - 1, n - 1, T) + X.charAt(m - 1);
        }


        if (T[m - 1][n] > T[m][n - 1]) {
            return LCS(X, Y, m - 1, n, T);
        }
        else {
            return LCS(X, Y, m, n - 1, T);
        }
    }

    public static void LCSLength(String X, String Y, int m, int n, int[][] T)
    {
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                }
                else {
                    T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
        String data = readFileAsString("C:\\Users\\absno\\Desktop\\data.txt");
        String data2 = readFileAsString("C:\\Users\\absno\\Desktop\\data2.txt");
        int m = data.length(), n = data2.length();
        int[][] T = new int[m + 1][n + 1];
        LCSLength(data, data2, m, n, T);
        int length=LCS(data,data2,m,n,T).length();
        System.out.println(LCS(data, data2, m, n, T));
        System.out.println("the bytes of LCS is "+length);
    }
}



