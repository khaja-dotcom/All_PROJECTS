package stevejobs;

import java.util.Iterator;

import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test91
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("minimize.png"); //to minimize eclipse window
		Thread.sleep(5000);
		Iterator<Match> l=s.findAll("fileicon.png"); //sequential collection
		l.next(); //goto 1st matched element in visible area of desktop
		l.next(); //goto 2nd matched element in visible area of desktop
		l.next().click(); //goto 3rd matched element and click

	}
}








