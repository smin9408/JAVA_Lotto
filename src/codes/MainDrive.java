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

			while(true) {
				
//				Math.random() =>  1 <= 랜덤 값 < 46
				int randomNum = (int)(Math.random()*45+1);
				
				boolean isDupOk = true;
				
				for (int num : lottoNumbers) {
					if(num == randomNum) {
						isDupOk = false;
						break;
					}
				}
				
				if(isDupOk) {
					lottoNumbers[i] = randomNum;
					break;
				}
			}
		}
		
		for(int num : lottoNumbers) {
			System.out.println(num);
		}

	}
}
