package com.multi.d_array;

import java.util.Arrays;

public class Exec01 {
	public static void main(String[] args) {
		
		// 기본데이터를 다른 변수에 복사   (값복사)
		int math1 = 100;
		int math2 = math1;
		System.out.println("수학1: " + math1);
		System.out.println("수학2: " + math2);
		math2 = 90;
		System.out.println("수학1: " + math1);
		System.out.println("수학2: " + math2);
		
		
		// 참조형복사(주소가 복사, 얕은 복사)
		int[] n1 = {100, 200, 300};
		int[] n2 = n1;//얕은복사
		System.out.println("n1: " + Arrays.toString(n1));
		System.out.println("n2: " + Arrays.toString(n2));
		
		n2[1] = 500;
		System.out.println("n1: " + n1); //n1: [I@5b6f7412
		System.out.println("n2: " + n2); //n2: [I@5b6f7412
		
		System.out.println("n1: " + Arrays.toString(n1));
		System.out.println("n2: " + Arrays.toString(n2));
		// n1: [100, 500, 300]
		// n2: [100, 500, 300] 주소값도 일치함...
		
		int[] n3 = n1.clone();//깊은복사 : 주소가 다르니 값도 하나만 바뀐다.
		System.out.println("n1: " + n1); // n1: [I@5b6f7412
		System.out.println("n3: " + n3); // n3: [I@27973e9b
		System.out.println(Arrays.toString(n3)); // [100, 500, 300]
		
		n3[1]=700;
		System.out.println("n1: " + n1); // n1: [I@5b6f7412
		System.out.println("n3: " + n3); // n3: [I@27973e9b
		System.out.println(Arrays.toString(n1));//[100, 500, 300]
		System.out.println(Arrays.toString(n3)); // [100, 500, 300]
		
		// 깊은 복사
		/* 1. for문을 이용한 동일한 인덱스의 값 복사
	     * 2. Object의 clone()을 이용한 복사
		 * 3. System의 arraycopy()를 이용한 복사
		 * 4. Arrays의 copyOf()를 이용한 복사 */
		
		
		
		
		
		
		
		
		
		
	}
}
