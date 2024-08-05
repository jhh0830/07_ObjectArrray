package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

// 객체배열 사용 후
public class ObjectArrayRun {

	public static void main(String[] args) {

		// 3권의 책 정보를 관리 (객체 배열을 이용해서)
		
		// 3개의 Book 객체를 담아서 보관할 배열 생성
		
		//자료형 [] 배열명; //선언
		// 배열명 = new 자료형[크기]; // 할당 (new == 생성)
		// > 자료형[] 배열명 = new 자료형[크기]; // 선언과 동시에 할당
		
		Book[] arr = new Book[3];
		// > arr[0], arr[1], arr[2]
		// > 각 인덱스 자리에는 Book 타입의 "주소값" 만 들어갈 수 있다.
		
		
		Scanner sc= new Scanner(System.in);
		
		// 3개의 전체 도서 정보를 입력받은 후 각 인덱스에 Book 객체
		// 생성 후 담아주기
		for(int i = 0; i < arr.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			arr[i] =  new Book(title, author, price, publisher);
			
		}
		// 전체도서 정보들 모두 출력하기 (조회)
		for(int i = 0; i <arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(arr[i].information());
		
		
		}
		// 사용자에게 검색할 도서 제목을 입력받아
		// 각 전체 도서들의 제목과 일일이 비교하여
		// 일치하는 도서의 가격을 알려주기
		
		System.out.println("검색할 책 제목 : ");
		String searcTitle = sc.nextLine();
		/*
		for(int i = 0; i <arr.length; i++) {
			if(searcTitle.equals(arr[i].getTitle())) {
				System.out.println(arr[i].getPrice());
			}
		}*/
		// + 기능 보완
		// 만약 일치하는 도서를 찾지 못한경우
		// "검색된 도서가 없습니다." 라고 출력하기
		
		// 보조해주는 변수 활용
		int count = 0;  // 일치하는 도서를 찾을때마다 1씩 증가
					    // > 일치하는 도서의 갯수를 셀 용도
						// 일치하는 도서를 찾을때마다 1 증가 (count++;)
		
		
		
		
		for(int i = 0; i <arr.length; i++) {
			if(searcTitle.equals(arr[i].getTitle())) {
				System.out.println(arr[i].getPrice());
				count++;
			
				
				// "책의 제목이 중복되지 않는 가정 하에"
				// 첫번째 검색 결과가 일치한다면? 그 이후의 검사는 굳이 안해도 됨
				// > 검사해주는 for문을 빠져나감으로써 검사 중지
				break;
				
			    }
			}
		
		    // 이 시점으로 기준으로 count에는
			// 일치하는 도서가 단 한권도 없었다면? count == 0
			// 일치하는 도서가 n권이라면? count == n
			if(count == 0) {
				System.out.println("검색된 도서가 없습니다.");
			
		}
		
	}
}
