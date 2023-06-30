package testcases;

import org.openqa.selenium.By;
import java.util.Set;
import java.util.Iterator;

import com.Page;

public class MoveTabs extends Page
{
	public void test()
	{
		openBrowser("chrome","http://www.rminfotechsolutions.com/selenium-automation-software-testing-training.html");
		driver.findElement(By.xpath("/html/body/div/a[4]/img")).click();
		
		Set<String> alltabref = driver.getWindowHandles();
		
	    Iterator <String> it = alltabref.iterator();
	    while(it.hasNext())
	    {
	    	String tabref = it.next();
	    	System.out.println("tabref"+tabref);
	    	
	    	driver.switchTo().window(tabref);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	
	    	if (title.contains("RM Infotech"))
	    	{
	    		String email = driver.findElement(By.xpath("/html/body/div/strong[11]/strong/p[13]/font")).getText();
	    		System.out.println(email);
	    	}
	    	else if (title.contains("Complete Software"))
	    	{
	    		driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("JAVA");
	    	}
	    }
	    					
	}

	public static void main(String[] args) 
	{
		MoveTabs p = new MoveTabs();
		p.test();

	}

}
