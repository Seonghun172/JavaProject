package Games;

import java.util.ArrayList;

import java.util.Scanner;

import com.MenuClose;
import com.User;

public class ApartMent {

   ArrayList<User> ulist = new ArrayList<User>();
   Scanner scan = new Scanner(System.in);
   int[] hand;

   /*
    * ulist.size() -> 참여자 숫자
    * 
    * 만약 참여자가 1명일 경우 hand[2] -> 2개의 배열 저장 공간이 생김. sel 변수는 hand index 숫자 내에서 나와야 함
    * 그러면 sel 변수 숫자는 0~2 까지 나와야 함.
    * 
    * 만약 참여자가 2명일 경우 hand[4] -> 4개의 배열 저장 공간이 생김. sel 변수는 hand index 숫자 내에서 나와야 함
    * 그러면 sel 변수 숫자는 0~4 까지 나와야 함.
    */
   
   int sel = ((int) (Math.random() * (ulist.size() * 2)+1)) + 1;

   // 시작과 동시에 인원수 체크
   public void apartStart(ArrayList<User> _ulist) {
      System.out.println("아파트 게임을 시작합니다!");
      System.out.println();
      System.out.println("인원수는?:" + _ulist.size());
      System.out.println();
      System.out.println(_ulist.size() + "명만큼 게임을 시작합니다!");
      System.out.println();

      ulist = _ulist;
      hand = new int[ulist.size() * 2];

      apartGame();
      apartResult();
   }

   // 손 쌓기
   private void apartGame() {

      int i = 0;

      while (true) {
         if (i == (ulist.size() * 2)) {

            System.out.println("손을 다쌓았습니다!");
            System.out.println();
            break;

         } else {
            System.out.print("손을 쌓을 플레이어 번호는?");
            int a = scan.nextInt();
            hand[i] = a;
            i++;
         }
      }

      for (int j = 0; j < i; j++) {
         System.out.println(" ☞ ");
      }
      
   }

   // 결과
   @SuppressWarnings("static-access")
private void apartResult() {
	   MenuClose mc = new MenuClose();

      System.out.println();
      System.out.println("걸리게 될 숫자는?");
      System.out.println("********************");
      System.out.println((sel+1) + "번째 층입니다");
      System.out.println("********************");

      int c;

      c = hand[sel];

      System.out.println("탈락자는 " + c + "번째 플레이어 입니다!");
      System.out.println();

      ulist.remove((c-1));
      System.out.println();
      System.out.println();
		mc.menuClose();
   }

}