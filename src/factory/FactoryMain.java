package factory;

public class FactoryMain {
	public static void main(String[] args) {
		OsFactory osf = new OsFactory();
		Os o = osf.getInstance("open");
		o.spec();
		
	}

}
