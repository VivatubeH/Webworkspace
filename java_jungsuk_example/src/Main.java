import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		int[] arr = new int[2000001];
		
		for(int i = 0; i < n; i++) {
			arr[in.nextInt()] = 10;
		}
// [] [] [] [] [] [] [] [] [] [] []
// 10			
// 7 2 3 5 8 9 10 2 3 4
		
		for(int i = -1000000; i <= 1000000; i++) {
			if ( arr[i] != 0 ) {
				System.out.println(i);				
			}
		}
		
	}
}
