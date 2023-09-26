package ex5_work;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonManager {
	// 1. 모든 기능을 수행하고 종료하기 전까지는
	// 메인 메뉴로 계속 아온다. ->
	// 2. 메뉴를 고른다 -> 어떤 문법을 채택할 것인다.

	public void personMgr() {
		int select; // 입력한 메뉴 번호를 담기 위한 변수
		Person p; // 사람 객체를 담기 위한 필드

		// Person객체를 저장할 수 있는 ArrayList 생성
		List<Person> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		out: while (true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 정보조회");
			System.out.println("4. 종료");
			System.out.println("항목 선택 : ");
			select = sc.nextInt();
			switch (select) {
			case 1:
				// 정보 추가
				System.out.println("---- 정보 추가 ----");
				p = new Person();
				System.out.println("이름 : ");
				p.setName(sc.next());
				System.out.println("나이 : ");
				p.setAge(sc.nextInt());
				System.out.println("번호 : ");
				p.setTel(sc.next());
				list.add(p);
				System.out.println("정보가 저장되었습니다.");
				break;
			case 2:
				System.out.println("---- 정보 삭제 ----");
				System.out.print("삭제할 이름 : ");
				String name = sc.next();
				// 입력한 이름이 리스트에 있는가?
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "의 정보를 삭제했습니다.");
						break;
					} else {
						if (i + 1 == list.size()) {
							System.out.println(name + "이 존재하지 않습니다.");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("---- 전체 조회 ----");
				System.out.println("등록 인원 " + list.size() + "명");
				list.forEach(x -> System.out.println(x));
				System.out.println("-----------------");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break out;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
