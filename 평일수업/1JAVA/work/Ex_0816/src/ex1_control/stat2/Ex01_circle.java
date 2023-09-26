package ex1_control.stat2;

public class Ex01_circle {
	public static void main(String[] args) {
		int R = 15; // 원의 반지름
		int x = 0; // x 좌표
		int y = 0; // y 좌표

		for (x = 0; x < R * 2; x++) {
			for (y = 0; y < R * 2; y++) {
				if ((x - R) * (x - R) + (y - R) * (y - R) >= R * R -R &&
						(x - R) * (x - R) + (y - R) * (y - R) <= R * R +R) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
