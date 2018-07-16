import java.util.HashSet;
import java.util.Scanner;

public class Hunter_6 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int ak = sc.nextInt();
		char arr[] = new char[ak];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.next().charAt(0);
		}
		HashSet hs=new HashSet<>();
				 
		for(int i=0;i<arr.length;i++) {
			int count=0;
		for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		if(count>=2) {
			hs.add(arr[i]);
		}
		}
		if(hs.size()==0) {
			System.out.println("Unique");
		}
		else {		
		System.out.println(hs.size());
		}
	}
}
