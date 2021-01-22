package crudproject.mola;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.jar.Attributes.Name;

import com.sun.org.apache.xpath.internal.operations.Equals;

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

	}

	static void delete() {

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
		System.out.println();
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
