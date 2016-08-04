package testcase01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAPI {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/jenkins");
		
		driver.findElement(By.id("j_username")).sendKeys("leeson");
		driver.findElement(By.name("j_password")).sendKeys("123456ls");
		driver.findElement(By.id("yui-gen1-button")).click();
		
		driver.findElement(By.className("task-link")).click();
		driver.findElement(By.id("name")).sendKeys("item04");
		driver.findElement(By.className("label")).click();
		driver.findElement(By.id("ok-button")).click();
		//driver.findElement(By.name("description")).sendKeys("test:2016-7-31  16:51");
		//driver.findElement(By.id("cb5")).click();
		//driver.findElement(By.id("yui-gen37-button")).click();
	}
	
}
