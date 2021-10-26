package Games;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.MenuClose;
import com.User;

public class NumberSelection {

	ArrayList<User> ulist = new ArrayList<User>();
	Scanner scan = new Scanner(System.in);

	public void Start(ArrayList<User> _ulist) {

		System.out.println("----- 어서와 술 뚜껑 숫자 맞추기 게임은 처음이지? -----");
		System.out.println();
		System.out.println("인원수는?: " + _ulist.size());
		System.out.println();
		System.out.println(_ulist.size() + " 명만큼 게임을 시작하겠습니다! ");

		ulist = _ulist;

		Game();

	}

	@SuppressWarnings({ "resource", "unused" })
	public void Game() {
		Random random = new Random();

		int answer = random.nextInt(200);

		int inputNumber;

		boolean test = true;

		int[] a = new int[ulist.size()];

		Scanner scan = new Scanner(System.in);
		System.out.println(" 술 뚜껑에 적힌 1~200사이 숫자를 맞추세요  ");

		while(test) {
		   for (int i = 0; i < ulist.size(); i++) {
				System.out.println((i + 1) + "플레이어의 차례 ! ");
				System.out.println("숫자를 입력하세요:  ");
				inputNumber = scan.nextInt();

				a[(ulist.size() - i) - 1] = inputNumber;

				if (a[(ulist.size() - i) - 1] > answer)
					System.out.println("Down");
				else if (a[(ulist.size() - i) - 1] < answer)
					System.out.println("Up");
				else if (a[(ulist.size() - i) - 1] == answer) {
					System.out.println((i+1) + "번째 플레이어 마셔");
					ulist.remove((i));
					MenuClose.menuClose();
					return;
				}
			}
		}
	}

}
