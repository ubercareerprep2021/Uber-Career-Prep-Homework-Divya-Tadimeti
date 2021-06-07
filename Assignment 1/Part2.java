public boolean isStringPermutation(String s1, String s2) {
  if (s1.length() != s2.length()) {
    return false;
  }

  HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();

  s1_chars = s1.toCharArray();
  s2_chars = s2.toCharArray();

  int num = 1;

  for (Character x: s1_chars) {
    if(tracker.containsKey(x)) {
      num++;
      tracker.put(x, num);
    } else {
      tracker.put(x, num);
    }
  }

  for (Character x: s2_chars) {
    if (tracker.containsKey(x)) {
      count--;
      tracker.put(x, count);
    } else {
      return false;
    }
  }
  return true;
}


public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
  int[][] final_pairs = new int[][];

  for (int i = 0; i < inputArray.length; i++) {
    for (int j = i+1; j < inputArray.length; j++) {
      if (inputArray[i]+inputArray[j] == targetSum) {
        final_pairs.append([inputArray[i], inputArray[j]);
      }
    }
  }
  return final_pairs;
}
