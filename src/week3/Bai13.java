package week3;

import java.util.Scanner;

public class Bai13 {
    static int n = 0;
    static void showMatric(int[][] a){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        while (n<3 || n>8){
            System.out.print("Moi ban nhap so n: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
        }
        int a[][] = new int[n][n];
        int d = 1;
        int cnt = 0;
        int Column = n;
        int Row = n;

        while ( cnt <= n / 2 )
        {
            for (int x = cnt; x < Column; x++)
                a[cnt][x] = d ++;

            for (int y = cnt + 1; y < Row - 1; y++)
                a[y][Column - 1] = d ++;

            for (int x = Column - 1; x > cnt; x--)
                a[Row - 1][x] = d ++;

            for (int y = Row - 1; y > cnt; y--)
                a[y][cnt] = d ++;

            cnt ++;
            Column --;
            Row --;
        }
        showMatric(a);
        System.out.println("Dao Tung Duong - 20183509");
    }
}
