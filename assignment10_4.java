class Main {
  /* Prints the given integer in reverse digit order.
   */
  static void printReverse(int n) {
    // if we have one digit left, println it.
    if (n < 10) {
      System.out.println(n);
      return;
    }

    // print the rightmost digit without a new line.
    System.out.print(n % 10);
    // recursive call without the rightmost digit
    printReverse(n / 10);
  }

  public static void main(String[] args) {
    printReverse(1234);
  }
}

