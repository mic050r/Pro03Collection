package coll02;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		Iterator<Integer> it = v.iterator(); // v벡터에 5, 4, 100, -1 저장
		// it 객체변수는 v객체의 데이터를 순차적으로 접근할 수 있다.
		while (it.hasNext()) { // 첫번째 실행 it.hasNext()는 5를 가리키기 떄문에 true 값을 리턴
			int n = it.next();
			System.out.println(n);
		}

		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			// 5를 n에게 넘겨주고 난 후에 it는 그 다음 데이터를 가리키게 됨.
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}