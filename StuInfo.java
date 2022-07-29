package StuInfo;
/*
 *
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 */

import java.util.Arrays;
import java.util.Scanner;

public class StuInfo {

	public static void main(String[] args) {
			
			    Scanner sc = new Scanner(System.in);
		        //배열 생성
		        int [] stu = new int[28];

		        //배열에 입력값 삽입
		        for(int i = 0; i<28; i++){
		            stu[i] = sc.nextInt();
		        }
		        // 낮은 순서 배열 정렬
		        Arrays.sort(stu);
		        
		        //i번째 인덱스 +1 과 i+1번째 인덱스 값이 다르면
		        for(int i = 0; i<28; i++){
		            if(i != 27 && stu[i]+1 != stu[i+1])
		                System.out.println(stu[i]+1);
		        }
		    }
		}
	

