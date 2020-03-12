class Main {
  /* Returns the nth fibonacci number.
   */
  static int fibonacci(int n) {
    // first base case, first fibonacci number is 0
    if (n == 1) {
      return 0;
    }
    // second base case, second fibonacci number is 1
    if (n == 2) {
      return 1;
    }
    // recursive call
    return fibonacci(n-1) + fibonacci(n-2);
  }
  
  public static void main(String[] args) {
    // Looping to print the first 10 fibonacci numbers.
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d, ", fibonacci(i));
    }
    System.out.println();
  }
}
