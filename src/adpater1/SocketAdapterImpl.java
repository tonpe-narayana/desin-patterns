package adpater1;

public class SocketAdapterImpl extends Socket implements SocketAdapter
{
 
    //Using Composition for adapter pattern
    private Socket sock = new Socket();
 
    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts() / i);
    }
 
    @Override
    public Voltage get240Voltage()
    {
        return sock.getVoltage();
    }
 
    @Override
    public Voltage get12Voltage()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 20);
    }
 
    @Override
    public Voltage get3VVoltage()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 80);
    }
}