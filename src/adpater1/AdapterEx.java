package adpater1;

public class AdapterEx
{
 
    public static void main(String[] args)
    {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Voltage voltage12 = socketAdapter.get12Voltage();
        System.out.println(voltage12.getVolts());
         
        Voltage voltage3 = socketAdapter.get3VVoltage();
        System.out.println(voltage3.getVolts());
         
        Voltage voltage240 = socketAdapter.get240Voltage();
        System.out.println(voltage240.getVolts());
    }
}