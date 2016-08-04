package testcase01;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

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
		System.out.println(IsElementPresent(driver,10,5,"kw0"));
		
		/*
		 * a.���idΪ  kw ��Ԫ�أ�������ڷ������Ԫ�أ����Ƿ���  boolean
		 */
		/*WebDriverWait wait1=new WebDriverWait(driver, 10);
		WebElement element=wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
		element.sendKeys("hello world");*/
		
		/*
		 * b.��鵱ǰҳ������Ƿ����hello������boolean����
		 */
		/*WebDriverWait wait2=new WebDriverWait(driver, 10);
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
	/*public boolean IsElementPresent(WebDriver driver,long timeout,String key){
		boolean flag=true;
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		try{
			wait.until(new ExpectedCondition<WebElement>() {

				@Override
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(By.id(key));//����Ƿ����ã����ڴ˴���ʼ���޸ġ�
				}
			});
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}*/
	
	/* ******************************���Ԫ��״̬*********************************** */
	//isEnabled()  ���Ԫ���Ƿ�����
	//isSelected() Ԫ���Ƿ�ѡ�У���ѡ�򡢶�ѡ��������
	//isDisplay()  ���Ԫ���Ƿ�ɼ�
	
	//�ж�ĳԪ���Ƿ������ϳ��÷�����js��
	public boolean IsElementPresent(WebDriver driver,long timeout,long pollingtime,String id_key){
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(pollingtime, TimeUnit.MILLISECONDS).withTimeout(timeout, TimeUnit.SECONDS);
		WebElement element=wait.until(new Function<WebDriver,WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {	
				return driver.findElement(By.id(id_key));
			}
			
		});
		return element.isDisplayed();
	}
}
