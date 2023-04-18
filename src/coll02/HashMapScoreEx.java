// 해시맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라
package coll02;
import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		// 5개의 점수를 저장
		javaScore.put("이용복", 97);
		javaScore.put("최범규", 88);
		javaScore.put("이주헌", 98);
		javaScore.put("김성철", 100);
		javaScore.put("양정인", 97);
		
		System.out.println("HashMape의 요소의 갯수는 : "+javaScore.size());
		
		// 모든 사람의 점수를 출력
		// javaScore에 저장되어 있는 (key, value)를 출력하는데
		// keySet()은 key의 집합을 Set콜렉션 keys객체변수에 넘겨준다
		Set<String> keys = javaScore.keySet();
		
		// key값들을 순하적으로 접근할 수 있는 iterator 객체변수를 생성
		Iterator<String> it = keys.iterator();
		// it은 "이용복", "최범규", "이주헌", "김성철", "양정인"을 가리킴
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);	// 순차적으로 해당하는 점수값을 score에 넘겨준다.
			System.out.println(name+" : "+score);
		}
	}

}