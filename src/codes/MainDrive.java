package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		// 컴퓨터가 3자리 숫자를 출제
		// 객체지향을 배운후에는 랜덤 3자리 문제로 변경

		int[] cpuNumbers = { 7, 4, 1 };

		// 스캐너는 한번만 만들어 두면 되니, while앞에서 만들자

		Scanner scan = new Scanner(System.in);

		// 3S를 맞출 때 까지 입력을 해서 반복을 받자

		while (true) {

			System.out.print("3자리 숫자 입력 : ");
			int input = scan.nextInt();

			// 배열 {7, 4, 1} vs 입력값 741 => {7, 4, 1}로 분해 작업 필요

			int[] myNumbers = new int[3];

			// myNumbers의 0번 칸 : 입력값의 100의 자리,입력값은 100으로 나눈 몫이 들어간다
			myNumbers[0] = input / 100;
			// myNumbers의 1번 칸 : 입력값의 10 자리
			myNumbers[1] = input / 10 % 10;

			// myNumbers의 2번 칸 : 입력값의 1의 자리 = > 4 / 10 % 10
			myNumbers[2] = input % 10;
					

		}

	}

}
