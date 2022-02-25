package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		6개의 숫자 입력받기.
		Scanner sc = new Scanner(System.in);

		int[] myNumbers = new int[6];

		for (int i = 0; i < myNumbers.length; i++) {

			while (true) {

				System.out.print(i + 1 + "번째 숫자 : ");
				int inputNum = sc.nextInt();

				boolean isRangeOk = (1 <= inputNum) && (inputNum <= 45);
				boolean isDupOk = true;

				for (int myNum : myNumbers) {
					if (myNum == inputNum) {
						isDupOk = false;
						System.out.println("중복된 숫자입니다.");
						break;

					}
				}

				if (isRangeOk && isDupOk) {

					myNumbers[i] = inputNum;

					break;
				} else if (isRangeOk == false) {
					System.out.println("45이하의 숫자를 넣어주세요");
				}

			}

		}

		int[] lottoNumbers = new int[6];

		for (int i = 0; i < lottoNumbers.length; i++) {

			while (true) {

//				Math.random() =>  1 <= 랜덤 값 < 46
				int randomNum = (int) (Math.random() * 45 + 1);

				boolean isDupOk = true;

				for (int num : lottoNumbers) {
					if (num == randomNum) {
						isDupOk = false;
						break;
					}
				}

				if (isDupOk) {
					lottoNumbers[i] = randomNum;
					break;
				}
			}
		}

//		임시 당첨 번호 선정 -> 담청 등수 로직 테스트용
//		lottoNumbers[0] = 10;
//		lottoNumbers[1] = 11;
//		lottoNumbers[2] = 20;
//		lottoNumbers[3] = 21;
//		lottoNumbers[4] = 30;
//		lottoNumbers[5] = 35;

//		랜덤으로 만들어진 당첨번호들을 > 작은 수 ~ 큰 수로 정리.
		for (int i = 0; i < lottoNumbers.length; i++) {
			for (int j = 0; j < lottoNumbers.length-1; j++) {
				if (lottoNumbers[j] > lottoNumbers[j + 1]) {
					int backUp = lottoNumbers[j];
					
					lottoNumbers[j] = lottoNumbers[j+1];
					
					lottoNumbers[j+1] = backUp;
				}
			}
		}

//		정리 된 당첨번호를 확인
		for (int num : lottoNumbers) {
			System.out.println(num);
		}

		int correctCount = 0;

		for (int myNum : myNumbers) {
			for (int winNum : lottoNumbers) {
				if (myNum == winNum) {
					correctCount++;
				}
			}
		}

		if (correctCount == 6) {
			System.out.println("1등 당첨");
		} else if (correctCount == 5) {
			System.out.println("임시 - 3등 당첨");
		} else if (correctCount == 4) {
			System.out.println("4등 당첨");
		} else if (correctCount == 3) {
			System.out.println("4등 당첨");
		} else {
			System.out.println("낙첨");
		}

	}
}
