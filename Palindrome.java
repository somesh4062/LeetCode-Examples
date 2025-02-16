/* Palindrome Problem Approach 1 : Using String Function */

class Solution
{
  public boolean isPalindrome(int x)
  {
    String o = Integer.toString(x);
    String r = new StringBuilder(o).reverse().toString();
    return o.equals(r);
  }
}

/* Approach 2 : Revert Half of the Number */

class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0||(x%10==0&& x!=0)) {
            return false;
        }
        int r = 0;
        while (x > r) {
            r = r * 10 + x % 10;
            x /= 10 ;
        }

        return x == r || x == r/10;
    }
