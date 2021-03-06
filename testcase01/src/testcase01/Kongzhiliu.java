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
 * 控制测试流例子
 * 显示等待：方法高效，当制定元素没有立即出现时，他会在指定时间范围内，进行一次查找，超出指定时间，程序抛出一场
 */
public class Kongzhiliu {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		System.out.println(IsElementPresent(driver,10,5,"kw0"));
		
		/*
		 * a.检查id为  kw 的元素，如果存在返回这个元素，或是返回  boolean
		 */
		/*WebDriverWait wait1=new WebDriverWait(driver, 10);
		WebElement element=wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
		element.sendKeys("hello world");*/
		
		/*
		 * b.检查当前页面标题是否包含hello，返回boolean类型
		 */
		/*WebDriverWait wait2=new WebDriverWait(driver, 10);
		Boolean flag=wait2.until(ExpectedConditions.titleContains("hello"));
		System.out.println("flag="+flag);*/
		
		/*
		 * c.自定义条件等待（常用：指定时间定位指定元素）
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
	 * 检查是否存在某元素方法（通过id）
	 */
	/*public boolean IsElementPresent(WebDriver driver,long timeout,String key){
		boolean flag=true;
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		try{
			wait.until(new ExpectedCondition<WebElement>() {

				@Override
				public WebElement apply(WebDriver arg0) {
					return driver.findElement(By.id(key));//检查是否启用，可在此处开始做修改。
				}
			});
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}*/
	
	/* ******************************检查元素状态*********************************** */
	//isEnabled()  检查元素是否启用
	//isSelected() 元素是否被选中（单选框、多选框、下拉框）
	//isDisplay()  检查元素是否可见
	
	//判断某元素是否加载完毕常用方法（js）
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
}//////651664164164141
