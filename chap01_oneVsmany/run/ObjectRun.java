package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		/*
		// 각각의 도서 정보를 나타내는 Book 타입의 객체 생성
		// 1. 기본생성자로 객체 생성 후 setter 메소드로 각 필드에 대입
		Book bk1 = new Book();
		bk1.setTitle("두잇 자바 프로그래밍");
		bk1.setAuthor("박은종");
		bk1.setPrice(25000);
		bk1.setPublisher("이지스 패블리싱");
		
		// 2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값 eodlq
		Book bk2 = new Book("처음만난 리액트",
							"이인제",
							33000,
							"한빛미디어");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		// 3. 사용자가 입력한 값들로 객체 생성
		//Book bk3 = new Book(사용자가입력한제목, 저자명,가격,출판사명);
		Scanner sc = new Scanner(System.in);
		// > 매개변수 생성자를 이용했던 것!!
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("저자명  : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사명 : ");
		String publisher = sc.nextLine();
		
		Book bk3 = new Book(title,author,price,publisher);
		
		System.out.println(bk3.information());
		*/
		// 세 개의 Book 객체가 필요하다 라는 가정 하에
		// 각각의 Book 객체를 따로따로 관리하는 프로그램
		// (단, 사용자로부터 입력받은 값들을 채워넣기)
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		// > 지역변수는 항상 초기화 하기(딱히 넣을 값이 없다면 초기값)
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서 정보를 입력받은 후 각 객체에 초기화
		for(int i = 0; i < 3; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			// Book 객체를 생성하기
			// bk1 : 반복 1회차때 입력받은값 (i가 0)
			// bk2 : 반복 2회차때 입력받은값 (i가 1)
			// bk3 : 반복 3회차때 입력받은값 (i가 2)
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
		// 전체 도서 정보 출력(조회 기능, Read)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 사용자로부터 검색할 도서 제목을 입력받아
		// 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을
		// 알려주는 검색 기능
		
		System.out.print("검색할 도서 제목 : ");
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
