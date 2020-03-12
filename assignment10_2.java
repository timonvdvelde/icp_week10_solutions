class Main {
  /* returns the value of sum (1 / 2^n)
   */
  static double sumSeries(int n) {
    // Base case
    if (n == 1) {
      return 0.5;
    }

    // returns current term + rest of the series (recursive)
    return 1.0 / (Math.pow(2.0, n)) + sumSeries(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(sumSeries(4));
  }
}


