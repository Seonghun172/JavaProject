package Games;


import java.util.ArrayList;
import java.util.Scanner;

import com.MenuClose;
import com.User;

public class BaskinRobbins {

  
   static ArrayList<User> ulist = new ArrayList<User>();
   static int saveNum = 0;
   static Scanner scanner = new Scanner(System.in);

   
   public static void BR31(ArrayList<User> _ulist) {
      while (true) {
         System.out.println("==== Baskin Robbins31 Game ====");
         System.out.println();
         System.out.println("1. Game Start");
         System.out.println("2. End Game");
         System.out.println();
         System.out.print("> ");

         ulist = _ulist;

         //System.out.println(ulist.size());
         int menuSelect = scanner.nextInt(); 

         if (menuSelect == 1) { // 1
            game();
         }         
         else if (menuSelect == 2) { //2 
            break;
         }
      }

   }

   public static void game() {
      int scanedNum = 0;
      ArrayList<Integer> playerN = new ArrayList<Integer>();
      System.out.println();
      System.out.println("<< Game Start >>");
      int saveNumFor = 1;
      while (true) {
         for (int i = 0; i < ulist.size(); i++) {
            System.out.println(ulist.get(i).getName() + "님의 차례!"); 
            System.out.print("1~3 숫자를 입력 > ");
            
            scanedNum = scanner.nextInt();
            System.out.println("");
            playerN.add(i, scanedNum); 
            
            
            if (1 <= playerN.get(i) && playerN.get(i) <= 3) {                                                   
               saveNum += playerN.get(i);																		
               for (int j = saveNumFor; j<=saveNum; j++ ) {															
            	   																							
               System.out.println(j + "!");
               if (j >= 31) {break;}																			
               }
               saveNumFor+=playerN.get(i); 																		

               																									
               if (saveNum >= 31) {
                  System.out.println(ulist.get(i).getName() + " 당첨÷!");
                  ulist.remove(i);
                  MenuClose.menuClose();
                  return;
               }

            } else
               System.out.println("숫자를 1~3 으로 입력해주세요!");
         }
      }
   }

}