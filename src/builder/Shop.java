package builder;

public class Shop {
	public static void main(String[] args) {
		Phone p = new PhoneBuilder().setRam(8).setOs("ios").setBattery(4000).getPhone();
        System.out.println(p);
	}
	

}
