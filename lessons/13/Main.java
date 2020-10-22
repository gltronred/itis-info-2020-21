import java.util.*;
import java.util.stream.*;

// Входной массив размером 5x2 содержит руку:
// в каждой строке - описание карты:
// значение и масть
// Строки упорядочены по невозрастанию достоинства карт
//
// Значение карты:
// * 2..10
// * 11 - валет
// * 12 - дама
// * 13 - король
// * 14 - туз
//
// Масть карты: 0 - ♥, 1 - ♦, 2 - ♠, 3 - ♣
//
// Комбинации:
// *  0 - старшая карта
// *  1 - одна пара: две карты одного достоинства
// *  2 - две пары
// *  3 - тройка: три карты одного достоинства
// *  4 - стрит: пять карт по порядку любых мастей
// *  5 - флэш: пять карт одной масти
// *  6 - фулл-хаус: тройка и двойка
// *  7 - каре: четыре карты одного достоинства
// *  8 - стрит-флэш: пять карт одной масти по порядку

public class Main {
    public static int hand(int[][] a) {
      int[] b = new int[4];
      int[] c = new int[15];
      for (int i = 0; i < 5; i++){
        c[a[i][0]]++;
      }
      for (int i = 0; i < 5; i++){
        b[a[i][1]]++;
      }
      int m = 0;
      for (int i = 2; i<14;i++ ) {
        if (c[i] == 1 && c[i+1] == 1) {
          m++;
        } else if  (m == 4) {
          for (int j = 0; j < 4; j++) {
            if (b[j] == 5) {
              return 8; 
            }
          }
        } else {
          m = 0;
        }
        }
      for (int i = 2; i < 15; i++){
        if (c[i] == 4){
          return 7;
        }
      }
      int f = 0;
      int g = 0;
      for(int i = 2; i < 15;i++) {
        if(c[i] == 2) {
          f++;
        }
        if(c[i] == 3) {
          g++;
        }
      }
      if(f==1 && g ==1) {
        return 6;
      }
      
      for (int i = 0; i < 4; i++){
        if (b[i] == 5){
          return 5;
        }
      }
      int h = 0;
      for (int i = 2; i<15;i++ ) {
        if (c[i] == 1 && c[i+1]==1) {
          h++;
        } else if  (h == 4) {
          return 4;
        } else {
          h = 0;
        }
        }
      for (int i = 2; i < 15; i++){
        if (c[i] == 3){
          return 3;
        }
      }

      int pair = 0;
      for(int i=2;i<15;i++){
        if(c[i]==2){
          pair++;
        }
      }
      if(pair==2){
        return 2;
      }

      for (int i = 0; i < 15; i++){
        if (c[i] == 2){
          return 1;
        }
      }


      
        return 0;
    }
    public static void main(String[] args) {
        t(new int[][]{{14,0},{6,0},{4,0},{3,0},{2,0}},     // flush
          5);
        t(new int[][]{{13,1},{12,2},{11,3},{10,0},{8,0}}, // nothing (K,Q,J,T,8)
          0);
          t(new int[][]{{11,2},{11,0},{11,3},{3,1},{2,0}},     // troyka
          3);
          t(new int[][]{{11,2},{11,0},{11,3},{11,1},{2,0}},     // kare
          7);
          t(new int[][]{{11,3},{11,0},{10,3},{9,1},{2,0}},     // one couple
          1);
          t(new int[][]{{12,0},{12,1},{11,0},{11,1},{2,0}},     // two pair
          2);
          t(new int[][]{{12,0},{12,1},{12,2},{11,1},{11,0}},     // 2+3;
          6);
          t(new int[][]{{12,0},{11,1},{10,2},{9,1},{8,0}},     // street;
          4);
          t(new int[][]{{12,0},{11,0},{10,0},{9,0},{8,0}},     // street-flash;
          8);

    }

    // ----- Вспомогательные функции для тестирования -----

    /**
     * Проверяем, что функция hand возвращает нужный результат
     *
     * @param a - рука
     * @param c - ожидаемый результат
     */
    public static void t(int[][] a, int c) {
        int r = hand(a);
        String d = " ? ";
        String l = "\033[0m";
        if (r == c) {
            System.out.print("\033[32mOK: ");
            d = " = ";
        } else {
            System.out.print("\033[1;91mWA: ");
            d = " ≠ ";
        }
        System.out.print(handToString(a) + "  ->  ");
        System.out.println(r + d + c + l);
    }
    // Преобразуем всю руку в строку для красоты
    public static String handToString(int[][] hand) {
        return Arrays.stream(hand)
            .map(Main::cardToString)
            .collect(Collectors.joining(" "));
    }
    // Преобразуем карту в строку для красоты
    public static String cardToString(int[] card) {
        String[] suits = {"♥","♦","♠","♣"};
        String val = "";
        switch (card[0]) {
            case 10: val = "T"; break;
            case 11: val = "J"; break;
            case 12: val = "Q"; break;
            case 13: val = "K"; break;
            case 14: val = "A"; break;
            default: val = Integer.valueOf(card[0]).toString();
        }
        return val + suits[card[1]];
    }
}
