package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

// ��ü�迭 ��� ��
public class ObjectArrayRun {

	public static void main(String[] args) {

		// 3���� å ������ ���� (��ü �迭�� �̿��ؼ�)
		
		// 3���� Book ��ü�� ��Ƽ� ������ �迭 ����
		
		//�ڷ��� [] �迭��; //����
		// �迭�� = new �ڷ���[ũ��]; // �Ҵ� (new == ����)
		// > �ڷ���[] �迭�� = new �ڷ���[ũ��]; // ����� ���ÿ� �Ҵ�
		
		Book[] arr = new Book[3];
		// > arr[0], arr[1], arr[2]
		// > �� �ε��� �ڸ����� Book Ÿ���� "�ּҰ�" �� �� �� �ִ�.
		
		
		Scanner sc= new Scanner(System.in);
		
		// 3���� ��ü ���� ������ �Է¹��� �� �� �ε����� Book ��ü
		// ���� �� ����ֱ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���ڸ� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ�� : ");
			String publisher = sc.nextLine();
			
			arr[i] =  new Book(title, author, price, publisher);
			
		}
		// ��ü���� ������ ��� ����ϱ� (��ȸ)
		for(int i = 0; i <arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(arr[i].information());
		
		
		}
		// ����ڿ��� �˻��� ���� ������ �Է¹޾�
		// �� ��ü �������� ����� ������ ���Ͽ�
		// ��ġ�ϴ� ������ ������ �˷��ֱ�
		
		System.out.println("�˻��� å ���� : ");
		String searcTitle = sc.nextLine();
		/*
		for(int i = 0; i <arr.length; i++) {
			if(searcTitle.equals(arr[i].getTitle())) {
				System.out.println(arr[i].getPrice());
			}
		}*/
		// + ��� ����
		// ���� ��ġ�ϴ� ������ ã�� ���Ѱ��
		// "�˻��� ������ �����ϴ�." ��� ����ϱ�
		
		// �������ִ� ���� Ȱ��
		int count = 0;  // ��ġ�ϴ� ������ ã�������� 1�� ����
					    // > ��ġ�ϴ� ������ ������ �� �뵵
						// ��ġ�ϴ� ������ ã�������� 1 ���� (count++;)
		
		
		
		
		for(int i = 0; i <arr.length; i++) {
			if(searcTitle.equals(arr[i].getTitle())) {
				System.out.println(arr[i].getPrice());
				count++;
			
				
				// "å�� ������ �ߺ����� �ʴ� ���� �Ͽ�"
				// ù��° �˻� ����� ��ġ�Ѵٸ�? �� ������ �˻�� ���� ���ص� ��
				// > �˻����ִ� for���� �����������ν� �˻� ����
				break;
				
			    }
			}
		
		    // �� �������� �������� count����
			// ��ġ�ϴ� ������ �� �ѱǵ� �����ٸ�? count == 0
			// ��ġ�ϴ� ������ n���̶��? count == n
			if(count == 0) {
				System.out.println("�˻��� ������ �����ϴ�.");
			
		}
		
	}
}
