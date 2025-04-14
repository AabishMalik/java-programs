package programs;






public class CountDays {
  public static void main(String[] args) {
    int[][] meetings = {{1, 3}, {4, 7}};
    int days = 10;

    System.out.println(countDays(days, meetings));
  }

  public static int countDays(int days, int[][] meetings) {
    boolean[] available = new boolean[days + 1];
    for (int i = 1; i < available.length; i++) {
      available[i] = true;
    }

    for (int[] meeting : meetings) {
      int low = meeting[0];
      int high = meeting[1];

      for (int i = low; i <= high; i++) {
        available[i] = false;
      }
    }

    int count = 0;
    for (int i = 1; i < available.length; i++) {
      if (available[i]) {
        count += 1;
      }
    }
    return count;
  }
}
