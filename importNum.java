package dzqc0312;

import java.util.Arrays;
import java.util.Scanner;

public class importNum {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int[] arrays = new int[6];
		arrays[0] = 92;
		arrays[1] = 78;
		arrays[2] = 87;
		arrays[3] = 10;
		arrays[4] = 56;
		Arrays.sort(arrays);
		int index = 0;//插入的位置
		System.out.println("请输入数字");
		int num = input.nextInt();
		for (int i = 0; i < arrays.length; i++) {//求出应该插入的位置
			if (arrays[i] > num){
				index = i-1;
				break;
			}
		}
		for (int j = 0 ;j<= index; j++) { 	//插入位置后的元素向后移动一位；
			arrays[j] = arrays[j+1];
		}
		//插入数据
		arrays[index] = num;
		//输出检测是否成功
		for (int i = 0; i < arrays.length; i++) {
			System.out.println("插入后的数据是："+arrays[i]);
		}
	}
}
