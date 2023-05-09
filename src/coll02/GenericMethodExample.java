package coll02;

public class GenericMethodExample {
	public static <T> GStack<T> reverse(GStack<T> a) { // a는 gs객체를 받음
		// <T>는 특정메소드에 제네릭을 적용하겠다는 표시
		// GStack<T>는 reverse메소드의 리턴(반환)타입
		// GStack<T>는 a에서 a는 GStack클래스의 매개변수
		GStack<T> s = new GStack<T>();
		// s는 GStack클래스 객체 변수 생성
		while (true) {
			T tmp;
			tmp = a.pop(); // 객체변수 a에 있는 데이터를 읽어서 tmp에 저장
			if (tmp == null)
				break;
			else
				s.push(tmp); // tmp에 저장되어 있는 데이터를 새로운 s객체에 데이터를 저장
		}
		return s;

	}

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		for (int i = 0; i < 5; i++) {
			gs.push(Double.valueOf(i)); // 0.0 , 1.0, 2.0, 3.0, 4.0순으로 데이터가 저장
			// Double.valueOf(i)는 정수 i값을 실수형으로 변환
		}
		gs = reverse(gs);
		// gs는 reverse메소드의 s객체를 받음
		for (int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}
	}

}
