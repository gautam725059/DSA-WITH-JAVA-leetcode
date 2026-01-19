class Solution {
    public static void printNumbers(int n) {
        if (n == 0) return;          // base case
        printNumbers(n - 1);         // recursive call
        System.out.print(n + " ");  // print after recursion
    }

    public static void main(String[] args) {
        int n = 500;
        printNumbers(n);
    }
}
