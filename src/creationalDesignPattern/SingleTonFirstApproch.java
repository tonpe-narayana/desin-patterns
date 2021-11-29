package creationalDesignPattern;



public class SingleTonFirstApproch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("single ton design pattern");
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();

		Test t3 = Test.getTest();


	}

}
class Test{
		private static Test t = new Test();
		private Test()
		{
			
		}
		public static Test getTest()
		{
			return t;
		}
}

