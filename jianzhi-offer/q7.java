//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）
//n<=39

public class q7 {
    public int Fibonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        return Fibonacci(n-2)+Fibonacci(n-1);
    }
    public int Fibonacci2(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int[] tmp = new int[n+1];
        tmp[0] = 0;
        tmp[1] = 1;
        for(int i = 2; i<=n; i++){
            tmp[i] = tmp[i-1]+tmp[i-2];
        }
        return tmp[n];
    }
}
