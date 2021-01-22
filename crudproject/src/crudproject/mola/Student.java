package crudproject.mola;

public class Student {
	String name,clss = new String();
	double score ;
	int rank;
	public Student(String name, String clss, double score, int rank) {
		
		this.name = name;
		this.clss = clss;
		this.score = score;
		this.rank = rank;
		
	}
	
	public String toString() {
		return name+"/"+clss+"/"+score+"/"+rank;
	}
}
