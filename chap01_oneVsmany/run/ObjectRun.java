package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		/*
		// ������ ���� ������ ��Ÿ���� Book Ÿ���� ��ü ����
		// 1. �⺻�����ڷ� ��ü ���� �� setter �޼ҵ�� �� �ʵ忡 ����
		Book bk1 = new Book();
		bk1.setTitle("���� �ڹ� ���α׷���");
		bk1.setAuthor("������");
		bk1.setPrice(25000);
		bk1.setPublisher("������ �к���");
		
		// 2. �Ű����� �����ڷ� ��ü ������ ���ÿ� �� �ʵ忡 �� eodlq
		Book bk2 = new Book("ó������ ����Ʈ",
							"������",
							33000,
							"�Ѻ��̵��");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		// 3. ����ڰ� �Է��� ����� ��ü ����
		//Book bk3 = new Book(����ڰ��Է�������, ���ڸ�,����,���ǻ��);
		Scanner sc = new Scanner(System.in);
		// > �Ű����� �����ڸ� �̿��ߴ� ��!!
		
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("���ڸ�  : ");
		String author = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���ǻ�� : ");
		String publisher = sc.nextLine();
		
		Book bk3 = new Book(title,author,price,publisher);
		
		System.out.println(bk3.information());
		*/
		// �� ���� Book ��ü�� �ʿ��ϴ� ��� ���� �Ͽ�
		// ������ Book ��ü�� ���ε��� �����ϴ� ���α׷�
		// (��, ����ڷκ��� �Է¹��� ������ ä���ֱ�)
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		// > ���������� �׻� �ʱ�ȭ �ϱ�(���� ���� ���� ���ٸ� �ʱⰪ)
		
		Scanner sc = new Scanner(System.in);
		
		// 3���� ��ü ���� ������ �Է¹��� �� �� ��ü�� �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���ڸ� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			
			System.out.print("���ǻ�� : ");
			String publisher = sc.nextLine();
			
			// Book ��ü�� �����ϱ�
			// bk1 : �ݺ� 1ȸ���� �Է¹����� (i�� 0)
			// bk2 : �ݺ� 2ȸ���� �Է¹����� (i�� 1)
			// bk3 : �ݺ� 3ȸ���� �Է¹����� (i�� 2)
			//bk1 = new Book(title, author, price, publisher);
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}
			else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
			
			
			
		}
		// ��ü ���� ���� ���(��ȸ ���, Read)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// ����ڷκ��� �˻��� ���� ������ �Է¹޾�
		// �� ��ü �������� ����� ������ ���Ͽ� ��ġ�ϴ� ������ ������
		// �˷��ִ� �˻� ���
		
		System.out.print("�˻��� ���� ���� : ");
		String searchTitle = sc.nextLine();
		
		if(searchTitle.equals(bk1.getTitle())) {
			System.out.println(bk1.getPrice());
		}
		if(searchTitle.equals(bk2.getTitle())) {
			System.out.println(bk2.getPrice());
		}
		if(searchTitle.equals(bk3.getTitle())) {
			System.out.println(bk3.getPrice());
		}
	}
	

}
