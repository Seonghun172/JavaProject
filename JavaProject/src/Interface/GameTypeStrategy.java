package Interface;

import com.MenuClose;

//import java.util.ArrayList;

public interface GameTypeStrategy  {

	   // ���ο��ִ� ulist�� �Ű������� �����;���

//	   static ArrayList<User> ulist = new ArrayList<User>();

	   void gameSelc();

	class BaskinRobbins2 implements GameTypeStrategy {

	      @Override
	      public void gameSelc() {
	    	  System.out.println("����Ų��� ������ �����մϴ�.");
	    	  MenuClose.menuClose();



	      }

	   }

	   class NumberSelection2 implements GameTypeStrategy {

		   @Override
		      public void gameSelc() {
		    	  System.out.println("���� ������ �����մϴ�.");
		    	  MenuClose.menuClose();

	      }

	   }

	   class Apartment2 implements GameTypeStrategy {

		   @Override
		      public void gameSelc() {
		    	  System.out.println("����Ʈ ������ �����մϴ�.");
		    	  MenuClose.menuClose();

	      }
	   }
	}