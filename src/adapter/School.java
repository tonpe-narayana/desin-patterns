package adapter;

public class School {
	public static void main(String[] args) {
		System.out.println("main");
		Pen p = new PenAdapter();
		AssignmentWork  aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("i am bit tired to write all these assigment");
		

	}
}
