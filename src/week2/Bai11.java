package week2;
import java.util.Random;

public class Bai11 {
	private static void shuffleArray(int[] array)
	{
	    int index, temp;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
	    }
	}
	public static void main(String args[]){
	    int[] solutionArray = {1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11};
	    System.out.println("Dãy số ban đầu là: ");
	    for (int i = 0; i < solutionArray.length; i++)
	    {
	      System.out.print(solutionArray[i] + " ");
	    }
	    shuffleArray(solutionArray);
	    System.out.println("\nDãy số sau khi đảo ngẫu nhiên: ");
	    for (int i = 0; i < solutionArray.length; i++)
	    {
	      System.out.print(solutionArray[i] + " ");
	    }
	    System.out.println("\nĐào Tùng Dương - 20183509");
	  }
}
