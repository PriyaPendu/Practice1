package testcases;

import com.Page;
import org.openqa.selenium.JavascriptExecutor;
public class HtmlVideoTest extends Page

{

	public void test() throws Exception 
	{
		openBrowser("chrome","https://www.w3.org/2010/05/video/mediaevents.html");
		
		((JavascriptExecutor)driver).executeScript("var vid=document.getElementById('video');vid.play();");
		Thread.sleep(10000);
		System.out.println("video Played ");
		
		((JavascriptExecutor)driver).executeScript("var vid=document.getElementById('video');vid.pause();");
		Thread.sleep(10000);
		System.out.println("video Paused");
		
		((JavascriptExecutor)driver).executeScript("var vid=document.getElementById('video');vid.play();");
		Thread.sleep(10000);
		System.out.println("video Played");
		
		((JavascriptExecutor)driver).executeScript("var vid=document.getElementById('video');vid.muted=true;");
		Thread.sleep(10000);
		System.out.println("video muted");
		
		
		((JavascriptExecutor)driver).executeScript("var vid=document.getElementById('video');vid.muted=false;");
		System.out.println("video unmuted");
		
	}
	public static void main(String[] args) throws Exception
	{
		HtmlVideoTest p = new HtmlVideoTest();
		p.test();

	}

}
