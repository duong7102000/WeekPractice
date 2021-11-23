package week4;

public class Bai6 {
    public static void main(String[] args) {
        String input="once upon a time";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println("Xau s: "+input);
        System.out.print("Xau S1 nguoc cua xau S: ");
        for (int i=0;i<input1.length();i++)
            System.out.print(input1.charAt(i));
        System.out.println("\nDao Tung Duong - 20183509");
    }
}
