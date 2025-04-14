package programs;

import java.util.*;

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();

    int max = 0;
    for (int e : candies) {
      if (e > max) {
        max = e;
      }
    }

    for (int e : candies) {
      if (e + extraCandies >= max) {
        result.add(true);
      } else {
        result.add(false);
      }
    }
    return result;
  }
}

public class GreatestNumberofCandies {}
