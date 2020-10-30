package com.company.稀疏数组;

public class SparesArry {

    public static void main(String[] args) {

        int[][] arry = new int[11][11];
        int sum = 0;
        arry[0][2] = 1;
        arry[2][3] = 2;
        arry[4][4] = 4;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(" "+arry[i][j]);
                if (arry[i][j] != 0) {
                    sum++;
                }
            }
            System.out.println();
        }
        int[][] sparArry = new int[sum + 1][3];
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arry[i][j] != 0) {
                    count++;
                    sparArry[count][0] =i;
                    sparArry[count][1] =j;
                    sparArry[count][2] =arry[i][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i < sum + 1; i++) {
            for (int j = 0; j < 3; j++) {
                sparArry[0][0] =11;
                sparArry[0][1] =11;
                sparArry[0][2] =sum;
                System.out.print("   "+sparArry[i][j]);
            }
            System.out.println();
        }

    }
}
