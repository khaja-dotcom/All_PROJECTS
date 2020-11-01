package stevejobs;

public class Test84
{
	public static void main(String[] args) throws Exception
	{
		String x=System.getProperty("os.name");
		String sdcmd=null;
		if(x.contains("Windows"))
		{
			sdcmd="shutdown.exe -s -t 0";
		}
		else if(x.contains("Linux"))
		{
			sdcmd="shutdown -h now";
		}
		else if(x.contains("Mac"))
		{
			sdcmd="shutdown -h now";
		}
		Runtime.getRuntime().exec(sdcmd);
		System.exit(0);
	}
}










