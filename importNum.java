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
		int index = 0;//�����λ��
		System.out.println("����������");
		int num = input.nextInt();
		for (int i = 0; i < arrays.length; i++) {//���Ӧ�ò����λ��
			if (arrays[i] > num){
				index = i-1;
				break;
			}
		}
		for (int j = 0 ;j<= index; j++) { 	//����λ�ú��Ԫ������ƶ�һλ��
			arrays[j] = arrays[j+1];
		}
		//��������
		arrays[index] = num;
		//�������Ƿ�ɹ�
		for (int i = 0; i < arrays.length; i++) {
			System.out.println("�����������ǣ�"+arrays[i]);
		}
	}
}
