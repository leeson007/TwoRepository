package testcase01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 
 * ���Ʋ���������
 * ��ʾ�ȴ���������Ч�����ƶ�Ԫ��û����������ʱ��������ָ��ʱ�䷶Χ�ڣ�����һ�β��ң�����ָ��ʱ�䣬�����׳�һ��
 */
public class Kongzhiliu {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		
		/*
		 * a.���idΪ  kw ��Ԫ�أ�������ڷ������Ԫ�أ����Ƿ���  boolean
		 */
		/*WebDriverWait wait1=new WebDriverWait(driver, 10);
		WebElement element=wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
		element.sendKeys("hello world");*/
		
		/*
		 * b.��鵱ǰҳ������Ƿ����hello������boolean����
		 */
	/*	WebDriverWait wait2=new WebDriverWait(driver, 10);
		Boolean flag=wait2.until(ExpectedConditions.titleContains("hello"));
		System.out.println("flag="+flag);*/
		
		/*
		 * c.�Զ��������ȴ������ã�ָ��ʱ�䶨λָ��Ԫ�أ�
		 */
		/*WebDriverWait wait=new WebDriverWait(driver, 5);
		WebElement we=wait.until(
				new ExpectedCondition<WebElement>() {
					public WebElement apply(WebDriver driver){
					return driver.findElement(By.id("kw"));
			}
		});*/
		
		
		
		
	}
	
	/*
	 * ����Ƿ����ĳԪ�ط�����ͨ��id��
	 */
	@SuppressWarnings("unused") //ǿ��֢����
	private boolean IsElementPresent(WebDriver driver,String key){
		try{
			driver.findElement(By.id(key));
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
}
