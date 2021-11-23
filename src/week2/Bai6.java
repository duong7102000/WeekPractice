package week2;
public class Bai6 {
	public static boolean isHoanHao(int a) {
		if (a==1) return true;
		int sum = 0;
		for(int i=1;i<=a/2;i++){
		      if(a%i==0) 
		        sum+=i;
		    }
		    if(sum==a){
		    	return true;
		    }
		    else {
		    	return false;
		    }
	}
	public static void main(String[] args) {
		System.out.println("5 số hoàn hảo đầu tiên là:");
        int dem = 0, i = 1;
        while(dem < 5) {
        	if(isHoanHao(i)) {
        		System.out.print(i + " ");
        		dem++;
        	}
        	i++;
        }
        System.out.println("\nĐào Tùng Dương - 20183509");
	}
}
