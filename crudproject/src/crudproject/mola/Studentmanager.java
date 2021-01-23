package crudproject.mola;

import java.util.Scanner;
import java.util.Vector;


public class Studentmanager {
	static Vector<Student> v = new Vector<Student>();
	static Scanner scanner = new Scanner(System.in);

	static void input() {

		System.out.println("이름을 넣어주세요");
		String name = new String();
		name = scanner.next();

		System.out.println("학과을 넣어주세요");
		String clss = new String();
		clss = scanner.next();

		System.out.println("성적을 넣어주세요");
		double score;
		score = scanner.nextDouble();

		System.out.println("등수를 넣어주세요");
		int rank;
		rank = scanner.nextInt();
		v.add(new Student(name, clss, score, rank));
	}

	static void output() {
		for (int i = 0; i < v.size(); i++) {
			Student s = v.get(i);
			System.out.println(s);
		}
	}

	static void search() {
		System.out.print("누구를 검색하시겠습니까?");
		String name = new String();
		name = scanner.next();
		for (int i = 0; i < v.size(); i++) {
			if (name.equals(v.get(i).name)) {
				System.out.println(v.get(i));
			}
		}
	}

	static void modify() {
		System.out.print("누구의 정보를 수정하시겠습니까?");
		String name, newname, clss, newclss, score, rank = new String();
		int newrank;
		Double newscore;
		name = scanner.next();
		for (int i = 0; i < v.size(); i++) {
			if (name.equals(v.get(i).name)) {
				System.out.print("어떤 정보를 수정하시겠습니까? 번호를 입력해주세요\n(1.name,2.class,3.score,4.rank)");
				int modi = scanner.nextInt();
				if (modi == 1) {
					System.out.println("새로 바꿀 이름을 입력해주세요");
					newname = scanner.next();
					v.get(i).name = newname;
					System.out.println(newname + "으로 변경 완료하였습니다.");
				}
				if (modi == 2) {
					System.out.println("새로운 학과를 입력해주세요");
					newclss = scanner.next();
					v.get(i).clss = newclss;
					System.out.println(newclss + "으로 변경 완료하였습니다.");
				}
				if (modi == 3) {
					System.out.println("새로운 성적을 입력해주세요");
					newscore = scanner.nextDouble();
					v.get(i).score = newscore;
					System.out.println(newscore + "점으로 변경 완료하였습니다.");
				}
				if (modi == 4) {
					System.out.println("새로 등수를 입력해주세요");
					newrank = scanner.nextInt();
					v.get(i).rank = newrank;
					System.out.println(newrank + "등으로 변경 완료하였습니다.");
				}

			}
		}
	}

	static void delete() {
		String select = "";
		String y = "y";
		String n = "n";
		System.out.print("누구의 정보를 삭제하시겠습니까?");
		String name = new String();
		name = scanner.next();
		for (int i = 0; i < v.size(); i++) {
			if (name.equals(v.get(i).name)) {
				System.out.println(name + "의 정보를 삭제하겠습니다 (y/n)");
				select = scanner.next();
				if (select.equals(y)) {
					v.remove(i);
					System.out.println("정보가 삭제 되었습니다");
				}
				if(select.equals(n)){
					System.out.println("취소되었습니다.");
				}
			}
		}
	}

	static void end() {
		System.out.println("::: END :::");
		System.out.println("프로그램을 종료합니다. \n수고하셨습니다!");
		System.exit(0);// 강제 종료!
	}

	static int scan = 0;

	static int menu() {
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("메뉴를 입력하세요 >>>>");

		try {
			scan = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요!");
			scanner.next();
			menu();
		}
		return scan;

	}

	public static void main(String[] args) {

		while (true) {
			int no = menu();
			switch (no) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 6:
				end();
				break;
			default:
				System.out.println("경고: 해당사항 없습니다!");
			}
			System.out.println("---------------------------------");
		}
	}

}
