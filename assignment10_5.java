class Main {
  /* Helper method to make the permutation call nicer from the main method.
   * This is where the actual recursion happens.
   */
  static void permutation(String s1, String s2) {
    // If string s2 is empty, we have reached the end of our initial string
    // In which case, we just want to print s1. We add a newline before to
    // make printing a bit nicer. Though the first one could be removed to
    // be perfect.
    if (s2.length() == 0) {
      System.out.println();
      System.out.print(s1);
    }
  
    // Think of this as traversing a tree structure. We recursively call
    // this method with one character from string s2 removed. 
    for (int i = 0; i < s2.length(); i++) {
      // FIXME: replace probably doesn't work if that character exists multiple
      // times.
      String ch = Character.toString(s2.charAt(i));
      permutation(ch, s2.replace(ch, ""));

      // After the recursive call we can print s1, which is the character
      // that we took off the last call.
      System.out.print(s1);
    }
  }

  /* Prints all permutations of any given string s2
   */
  static void permutation(String s) {
    // Initial call to the other actual method.
    permutation("", s);

    // To add new line to end of program.
    System.out.println();
  }

  public static void main(String[] args) {
    permutation("abc");
  }
}
