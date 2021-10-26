package Interface;

import com.MenuClose;

//import java.util.ArrayList;

public interface GameTypeStrategy  {

	   // 메인에있는 ulist를 매개변수로 가져와야함

//	   static ArrayList<User> ulist = new ArrayList<User>();

	   void gameSelc();

	class BaskinRobbins2 implements GameTypeStrategy {

	      @Override
	      public void gameSelc() {
	    	  System.out.println("베스킨라빈스 게임을 시작합니다.");
	    	  MenuClose.menuClose();



	      }

	   }

	   class NumberSelection2 implements GameTypeStrategy {

		   @Override
		      public void gameSelc() {
		    	  System.out.println("숫자 게임을 시작합니다.");
		    	  MenuClose.menuClose();

	      }

	   }

	   class Apartment2 implements GameTypeStrategy {

		   @Override
		      public void gameSelc() {
		    	  System.out.println("아파트 게임을 시작합니다.");
		    	  MenuClose.menuClose();

	      }
	   }
	}