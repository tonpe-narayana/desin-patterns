package adapter;

public class PenAdapter implements Pen

{

	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		System.out.println("inside penadapter class write method");

		pp.mark(str);
		
	}

}
