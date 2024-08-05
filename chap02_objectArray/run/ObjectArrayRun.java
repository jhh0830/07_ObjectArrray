package com.kh.chap02_objectArray.run;

import java.util.Arrays;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// �޴��� 3�븦 �����ϴ� ���α׷�
		// ���1)
		/*
		Phone p1= null;
		Phone p2= null;
		Phone p3= null;
		*/
		
		
		// ���2)
		Phone[] arr = new Phone[3];
		// ���� �� arr �迭�� ����ִ� �޴����� ������ ��Ÿ���� ����
		int count = 0; 
		// > �޴����� �Ѵ� �����ɶ����� 1�� ������ų ��!!
		
		
		System.out.println(arr); // �迭�� �ּҰ�
		System.out.println(arr.length);// �迭�� ũ��
		System.out.println(arr[0]); // null (�����ڷ��� �⺻��)
		
		System.out.println(Arrays.toString(arr));
		
		// > arr �迭�� �� �ε����� ��� null�� �� ����!!
		
		// 1. �⺻�����ڷ� ��ü ���� �� setter �޼ҵ�� �� ����
		arr[0] = new Phone();
		arr[0].setName("������");
		arr[0].setSeries("11pro");
		arr[0].setBrand("����");
		arr[0].setPrice(1000000);
		count++;
		// 2. �Ű����������ڷ� ��ü ������ ���ÿ� �� ���� 
		arr[1] = new Phone("�ø���","1","�Ｚ",1200000);
		count++;
		System.out.println("-------------");
		
		// System.out.println(Arrays.toString(arr));
		// �޴��� ���� ��� �� �� ������ ����ϴ� for��
		int sum=0;
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].information());
			sum = sum + arr[i].getPrice();
			// sum += arr[i].getPrice();
			
		}
		// > �� �迭�� ����ִ� �޴����� ���� ��ŭ�� �ݺ� ������
		System.out.println("-------------");
		System.out.println("�Ѱ��� : " +sum+"��");
		System.out.println("��հ� : "+ sum/count+"��");
		
		
		
	}

}
