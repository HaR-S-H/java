package RECURSION;

public class blue {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = fib(n - 1) + fib(n - 2);
        return ans;
    }

    public static void print(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        print(str.substring(1), ans);
        print(str.substring(1), ans + ch);
    }

    // static int count = 0;
    public static void toss(int n, String ans) {
        if (ans.length() == n) {
            System.out.println(ans);
            // count++;
            return;
        }
        if (ans.length() == 0 || (ans.charAt(ans.length() - 1) != 'h')) {
            toss(n, ans + 'h');
        }

        toss(n, ans + 't');
    }
        public static int count(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        char ch = str.charAt(0);
       int a= count(str.substring(1), ans);
       int b = count(str.substring(1), ans + ch);
       return a + b;
    }

    public static void step(int n,int curr ,String str) {
        if (curr > n) {
            return;
        }
        if (curr==n) {
            System.out.println(str);
            return;
        }
        step(n,curr+1, str+"1");
        step(n,curr+2, str+"2");
        step(n,curr+3, str + "3");
        return;
    }

    public static void step1(int n, int curr, String str) {
        if (curr > n) {
            return;
        }
        if (curr == n) {
            System.out.println(str);
            return;
        }
        for (int dice = 1; dice <= 3; dice++) {
            step1(n, curr + dice, str + dice);
        }
        return;
    }
//er-end row
    public static void ways(int er,int ec,int cr,int cc, String str) {
        if (cr == er && cc == ec) {
            System.out.println(str);
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        ways(er, ec, cr, cc+1, str + "h");
        ways(er, ec, cr+1, cc, str + "v");
    }

    public static void main(String[] args) {
        // String str = "abc";
        // int n = 4;
        // System.out.println(fib(5));
        // print(str, "");
        // toss(n, "");
        // System.out.println(count);
        // System.out.println("\n"+count(str,""));
        // step(4,0, "");
        int m = 3;
        int n = 3;
        step1(4, 0, "");
        ways(n-1, m-1,0 , 0, "");
    }
}
