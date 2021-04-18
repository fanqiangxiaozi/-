import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Mymain {
    public static void main(String[] args) {
        int array[]=new int[10];
        for( int i=0;i<10;i++)
        {
            Scanner reader=new Scanner(System.in);
            array[i]= reader.nextInt();
        }
        //冒泡排序
        int a;
        for (int i=0;i<10;i++) {
            for(int j=0;j<10-i-1;j++) {
            if (array[j] > array[j + 1]) {
                a = array[j];
                array[j] = array[j + 1];
                array[j + 1] = a;
            }
        }
            //下面是删除数组中重复的数字的算法：
        }
        for (int i=0;i<array.length-1;i++)   // i为初始index
        {
            if(array[i]==array[i+1]) {
                for (int j = i + 1; j < array.length - 1; j++)
                    array[j] = array[j + 1];
                array = Arrays.copyOf(array, array.length - 1);//每次去一个重复数字都要将数组的长度减1。
                i=0; // 必须初始index设置为0，否则若一个数字有三个以上重复数字时会出现不能完全删除的问题。
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
//总结：1.删除之前要排序，只有排序了才能开始进行删除重复数字的步骤。2.删除算法中的思想主要是覆盖，然后减少数组的长度。具体代码中应该注意
//       两点：array[j]==array[j+1]为true则开始覆盖覆盖，覆盖完成后记得将数组的长度减1，然后再将循环的开始index设置为0，从头开始
//       再次进行检索，如不这样设置，会造成数组中一个数字有三以上的重复数字时无法完全删除重复数字。
