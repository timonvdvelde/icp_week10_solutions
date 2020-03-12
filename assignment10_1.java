class Main {
  /* Returns the factorial of the given number.
   */
  static int factorial(int n) {
    // Base case
    if (n == 0) {
      return 1;
    }
    // Recursive call.
    return n * factorial(n-1);
  }

  public static void main(String[] args) {
    System.out.println("4! = " + factorial(4));
  }
}

