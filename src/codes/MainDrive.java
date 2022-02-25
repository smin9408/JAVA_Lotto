package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		6개의 숫자 입력받기.
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {

			while (true) {

				System.out.print(i + 1 + "번째 숫자 : ");
				int inputNum = sc.nextInt();

				boolean isRangeOk = (1 <= inputNum) && (inputNum <= 45);

				if (isRangeOk) {
					break;
				} else {
					System.out.println("45이하의 숫자를 넣어주세요");
				}

			}

		}

	}
}
