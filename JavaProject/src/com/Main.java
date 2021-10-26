package com;

import java.util.ArrayList;

import java.util.Scanner;

import Games.ApartMent;
import Games.BaskinRobbins;
import Games.NumberSelection;
import Interface.GameTypeStrategy.*;

public class Main {

	static ArrayList<User> ulist = new ArrayList<User>();

	public static void main(String[] args) {

		// �޴����� ���� ��

		String choi = "";

		// Scanner�� �̿��� �Է�
		// import java.util.Scanner;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			// �ʱ� ��Ʈ ���

			menu();

			// ��ĳ�� �� �޾ƿ���

			choi = "";

			choi = sc.nextLine();

			if (choi.equals("1")) {

				createUser();

			} else if (choi.equals("2")) {

				showAll();

			} else if (choi.equals("3")) {

				// 게임 선택

				selectGame();

			} else if (choi.equals("4")) {
				System.out.println("");
				System.out.println("종료합니다.");
				System.out.println("");
				System.exit(0);

			} else {

				System.out.println("1~3 사이 숫자를 입력해주세요.");

			}

		}

	}

	// �ʱ� �޴� Show ���

	private static void menu() {
		for (int i = 0; i < 30; i++)
			System.out.println();

		System.out.println("******************************************************");
		System.out.println("*     술 자리 랜덤 게임에 오신걸 환영 합니다. 아래 숫자 중 골라 주세요.     *");
		System.out.println("*                                                    *");
		System.out.println("*    1. 참여자 생성, 2. 유저 전체 출력, 3. 게임 선택    4.종료               *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");

		System.out.print("입력: ");

	}

	

	private static void createUser() {

		String name;

		String gender;

		int age;

		

		// import java.util.Scanner;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("참여자 생성 정보를 입력해 주세요.");

		System.out.print("이름: ");

		name = sc.nextLine();

		System.out.println();

		System.out.print("성별: ");

		gender = sc.nextLine();

		System.out.println();

		System.out.print("나이: ");

		age = sc.nextInt();

		ulist.add(new User(name, gender, age));

	}

	
	private static void showAll() {
		System.out.print("등록된 참여자 : ");

		for (User us : ulist) {
			System.out.println();
			System.out.print("이름 : " + us.getName() + ",  ");
			System.out.print("성별 : " + us.getGender() + ",  ");
			System.out.print("나이 : " + us.getAge() + "  ");
			System.out.println("");

		}
		System.out.println();
		/*
		 * System.out.print("@ �ڷ� ���Ƿ��� �ƹ�Ű�� �Է����ּ��� @"); Scanner sc = new
		 * Scanner(System.in); choose = sc.next(); if (choose.equals("1")) { close =
		 * false; } else { close = false; }
		 */
		MenuClose.menuClose();
	}

	@SuppressWarnings("static-access")
	private static void selectGame() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String gameChoi = "";

		
		System.out.println("      1 :   베스킨 라빈스 게임 ");
		System.out.println("      2 :       아파트 게임 ");
		System.out.println("      3 : 술뚜껑 랜덤 숫자 게임 ");

		System.out.print("입력 > ");

		gameChoi = scan.next();
		
		if (ulist.size() >= 2) {

		if (gameChoi.equals("1")) {
			BaskinRobbins2 brs = new BaskinRobbins2();
			brs.gameSelc();

			BaskinRobbins br = new BaskinRobbins();
			br.BR31(ulist);

		} else if (gameChoi.equals("2")) {
			
			
			Apartment2 apt = new Apartment2();
			apt.gameSelc();
			
			ApartMent apart = new ApartMent();
			apart.apartStart(ulist);
			
		} else if (gameChoi.equals("3")) {
			NumberSelection2 ns = new NumberSelection2();
			ns.gameSelc();
			
			NumberSelection numSelec = new NumberSelection();
			numSelec.Start(ulist);
			
		} else System.out.println("번호를 제대로 입력해주세요");
		} else {
			System.out.println("인원수는 2명 이상이어야 합니다.");
			MenuClose.menuClose();
		}
		
 
	}
 
}