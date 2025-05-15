package mavennewpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class democlass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("suryamol.devu@gmmail.com");
Thread.sleep(3000);
driver.close();
	}
   @Test
    public void demoTest() {
       System.out.println("TestNG is working!");
	}

}
	
