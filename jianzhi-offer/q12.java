//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//保证base和exponent不同时为0

public class q12 {
    public double Power(double base, int exponent) {
        if(exponent == 0)return 1;
        double tmp = base;
        int count = exponent;
        if(exponent < 0)count = 0 - exponent;
        while(count > 1){
            tmp *= base;
            count--;
        }
        if(exponent<0)return 1/tmp;
        return tmp;
    }
}
