package coll02;

import java.util.*;

// (영어, 한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라.
// "exit"이 입력되면 프로그램이 종료되는 프로그램 작성
public class HashMapEx {

	public static void main(String[] args) {
		// dic 객체변수는 HashMap 타입이고 key 값은 String, value 값도 String
		HashMap<String, String> dic = new HashMap<String, String>();

		// HashMape 객체인 dic에 3개의 (key, value)값을 저장
		dic.put("baby", "아기"); // key : "baby", value : "아기"
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		Scanner scanner = new Scanner(System.in); // 키보드로 입력받기 위한 객체 생성
		while (true) { // 무한 반복
			System.out.print("찾고 싶은 단어는 ? ");
			String eng = scanner.next(); // 키보드로부터 문자열 입력 받음
			if (eng.equals("exit")) { // 입력받은 문자열이 "exit"이면 true 반환
				System.out.print("종료합니다.");
				break; // while 반복문을 빠져나감
			}
			String kor = dic.get(eng); // eng 키 값에 해당하는 value를 kor에 저장
			// 만약 입력한 키 값이 dic 객체에 없는 키 값이면 null을 반환
			if (kor == null)
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}

	}

}