//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

public class q1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        int coll = col-1;
        int roww = 0;
        while(coll>=0 && roww<=row-1){
            if(array[roww][coll]==target)return true;
            else if(array[roww][coll]>target)coll--;
            else roww++;
        }
        return false;
    }
}
