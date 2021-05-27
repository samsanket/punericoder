package CodeChef;

import java.util.Scanner;
import java.util.*;

public class SMPAIR {

	public static void main(String[] args) {

		int t = 0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (t != 0) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}

			t--;

		}

		int s = 0;
		s = Collections.min(arr);
		// int in=arr.indexOf(s);
		arr.remove(34);
		int m = Collections.min(arr);
		int sum = s + m;
		System.out.println("****" + sum);
		sc.close();

	}

}
