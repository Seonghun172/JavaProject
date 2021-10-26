package com;

import java.util.Scanner;

public class MenuClose{
	public static void menuClose() {
		System.out.print("@ 넘어 가실려면 아무키나 입력해주세요 @");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		String nothing = sc.next();
	}

}
