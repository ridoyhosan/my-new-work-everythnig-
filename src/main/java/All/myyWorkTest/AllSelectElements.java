package All.myyWorkTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class AllSelectElements extends ToOpenNClose{
	public static void tittleurl() {
		//ToOpenNClose.opentDriver("crome");
		System.out.println(dr.getTitle());
	}
	
	

	
	public static void click() {
		System.out.println("click");
	 dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[1]/button")).click();
	 dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[2]/button")).click();
	 dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[3]/button")).click();
	 dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[4]/button")).click();
	 dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[4]/button")).click();

	 WebElement mainMeno=dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[1]/button"));
		System.out.println(mainMeno.getText());
	}
	
	
	
	
	public static void elementsloop() throws InterruptedException {
		 //WebElement mainMen=dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[1]/button"));

		for(int i=1;i<=5;i++) {
			 WebElement mainMeno=dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li["+ i+"]/button"));
			 mainMeno.click();
			 System.out.println(mainMeno.getText());
			 System.out.println(mainMeno.isDisplayed());
			 

		}
	}
	

}
