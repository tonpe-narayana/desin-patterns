package factory;

public class OsFactory {
	public Os getInstance(String s)
	{
		if(s.equals("open"))
		{
			return new Android();
		}
		else if(s.equals("closed"))
		{
			return new Ios();
		}
		else{
			return new Windows();
		}
	}

}
