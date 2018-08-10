package gs.interview.questions;

public class _20_Armstrong {

	public static void main(String[] args) {
		boolean a = isArmstrong(153);
		System.out.println(a);
	}

	private static boolean isArmstrong(int input) {
		int length = String.valueOf(input).length();
		System.out.println("lenght = " + length);
		int sum = 0;
		int num = input;
		while (num > 0) {
			int remainder  = num % 10;
			sum = (int) (sum + Math.pow(remainder , length));
			num = num / 10;
		}
		return (input == sum);
	}
}
