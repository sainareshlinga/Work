public class BossFight {
    public static void main(String[] args) {
      int n = 10;
      int k = 3;
      for (int i = 1; i <= n; i++) {
        System.out.println("Boss " + i + ": ");
        for (int j = 1; j <= k; j++) {
          if (killBoss()) {
            break;
          }
          System.out.println("Monocarp: Attack " + j + " failed.");
        }
        for (int j = 1; j <= k; j++) {
          if (killBoss()) {
            break;
          }
          System.out.println("Polycarp: Attack " + j + " failed.");
        }
      }
    }
    public static boolean killBoss() {
      return Math.random() < 0.5;
    }
  }