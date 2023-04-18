package coll02;

import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		// v객체 변수는 Point타입의 데이터를 저장
		Vector<Point> v = new Vector<Point>();

		v.add(new Point(2, 3)); // 0번째 데이터 삽입
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		v.remove(1); // 인덱스 1번째 데이터를 삭제한다.
		// v.add(100,20); ---에러발생

		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i); // 벡터에서 i 번째 Point 객체 얻어내기
			System.out.println(p); // p.toString()를 호출
		}
	}
}