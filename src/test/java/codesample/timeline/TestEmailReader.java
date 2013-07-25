package codesample.timeline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

import org.junit.Test;

public class TestEmailReader 
{
	//@Before
	//@After
	@Test
	public void TestEmailReader() //test 15 E-mails (small amount)
	{
		Path startPath = Paths.get("C:/Users/mcarlton/Desktop/allen-p._sent_mail.15Emails");
		try
		{
			Files.walkFileTree(startPath, new SimpleFileVisitor<Path>());
		}
		catch (IOException e){}
	}
	
	
	
	
	
	
}
