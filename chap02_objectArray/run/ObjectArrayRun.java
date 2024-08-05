package com.kh.chap02_objectArray.run;

import java.util.Arrays;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// 휴대폰 3대를 관리하는 프로그램
		// 방법1)
		/*
		Phone p1= null;
		Phone p2= null;
		Phone p3= null;
		*/
		
		
		// 방법2)
		Phone[] arr = new Phone[3];
		// 현재 이 arr 배열에 들어있는 휴대폰의 갯수를 나타내는 변수
		int count = 0; 
		// > 휴대폰이 한대 생성될때마다 1씩 증가시킬 것!!
		
		
		System.out.println(arr); // 배열의 주소값
		System.out.println(arr.length);// 배열의 크기
		System.out.println(arr[0]); // null (참조자료형 기본값)
		
		System.out.println(Arrays.toString(arr));
		
		// > arr 배열의 각 인덱스는 모두 null이 들어가 있음!!
		
		// 1. 기본생성자로 객체 생성 후 setter 메소드로 값 셋팅
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("11pro");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		count++;
		// 2. 매개변수생성자로 객체 생성과 동시에 값 셋팅 
		arr[1] = new Phone("플립폰","1","삼성",1200000);
		count++;
		System.out.println("-------------");
		
		// System.out.println(Arrays.toString(arr));
		// 휴대폰 정보 출력 및 총 가격을 계산하는 for문
		int sum=0;
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].information());
			sum = sum + arr[i].getPrice();
			// sum += arr[i].getPrice();
			
		}
		// > 이 배열에 들어있는 휴대폰의 갯수 만큼은 반복 돌리기
		System.out.println("-------------");
		System.out.println("총가격 : " +sum+"원");
		System.out.println("평균가 : "+ sum/count+"원");
		
		
		
	}

}
