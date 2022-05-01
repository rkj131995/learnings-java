
import java.util.LinkedList;

public class MainApplication {

	public static void main(String[] args) {
		
		int[] arr = { 2, 3, 4, 5, 6, 6, 7, 6 };
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0, 3);
		String d;
		int result = search(arr, 6);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Found at " + result);

		System.out.println("char ASCII - " + (int) 'A');
		Character.isDigit(0);

		System.out.println(" count is " + countJewels("zAaZ", "zaAZbb"));
	}

	public static int search(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static int countJewels(String J, String S) {
		int[] cnt = new int[123];
		for (char c : S.toCharArray())
			cnt[c]++;
		int ans = 0;
		for (char c : J.toCharArray())
			ans += cnt[c];
		return ans;
	}

}
