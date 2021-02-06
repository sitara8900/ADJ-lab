package exp2;
import java.net.*;
import java.io.DataOutputStream;
public class TCPclient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("First Server Program");
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}