//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

import java.util.LinkedList;
import java.util.Queue;

public class q13 {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int[] tmp = new int[len];
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<len; i++){
            if(array[i]%2!=0){
                tmp[index] = array[i];
                index++;
            }else queue.offer(array[i]);
        }
        while(index<len){
            tmp[index] = queue.poll();
            index++;
        }
        for(int i = 0; i<len; i++){
            array[i] = tmp[i];
        }
    }

    public void reOrderArray2(int [] array) {
        int len = array.length;
        for(int i = 0; i<len; i++){
            for(int j = 1; j<len; j++){
                if(array[j-1]%2==0 && array[j]%2==1){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
