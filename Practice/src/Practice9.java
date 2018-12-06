
public class Practice9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1から12の好きな数字を入力してください。");

		int month = new java.util.Scanner(System.in).nextInt();
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febryary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("Novenber");
			break;
		case 12:
			System.out.println("Decembet");
			break;
		default:
			System.out.println("1から12の数値を入力して下さい。");
		}
		System.out.println("ありがとうございました");
	}
}
