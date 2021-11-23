package week2;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int hight;
	    System.out.printf("Nhập vào chiều cao của tam giác: ");
	    hight = sc.nextInt();
	    while((hight<2)||(hight>10)) {
	    	System.out.printf("Nhập vào chiều cao của tam giác: ");
		    hight = sc.nextInt();
	    }
	    sc.close();
	    for (int i = 1; i <= hight; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	    System.out.println("\nĐào Tùng Dương - 20183509");
	}
}
