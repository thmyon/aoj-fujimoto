import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H;
		int W;
		for (int i = 0; i < 10000; i ++) {
			H = scan.nextInt();
			W = scan.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (h == 0 || w == 0 || h == H-1 || w == W-1) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
