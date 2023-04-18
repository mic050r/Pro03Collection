package coll02;

import java.util.Vector;

public class PointVectorEx {

	public static void main (String[] args) {
		// v 객체변수는 Point 타입의 데이터를 저장
		Vector<Point> v =new Vector<Point>();
		
		v.add(new Point(2, 3));	// 0번째 데이터 삽입
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		// v.add(100, 200); ---- 에러 발생
		
		v.remove(1);	// 인덱스 1번째 데이터 삭제
		
		for(int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}

	}
}
