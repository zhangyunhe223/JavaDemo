package com.Jmeter.com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Screen_Web {

	public static void main(String[] args) {
		/**
		 * 
		 */
		try {
			System.out.println("启动浏览器...");

			WebDriver driver = new FirefoxDriver();

			System.out.println("打开地址....");
			driver.get("http://www.baidu.com/");
			// 最大化浏览器
			driver.manage().window().maximize();
			
			System.out.println("打开地址成功...");
								
			// 等待10s开始截屏
			Thread.sleep(3000);
			// -------------------------截屏操作
			System.out.println("等待3s开始截屏，开始截屏...");
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);			
			
			try {
				// ----------保存图片  new File("C:\\Users\\XD\\Desktop\\jpg\\screenshots1.jpg")
				Date currentTime = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String dateString = formatter.format(currentTime);
				File screenshot2 = new File("C:\\Users\\XD\\Desktop\\jpg\\"+ dateString  + ".png");
				FileUtils.copyFile(screenshot1, screenshot2);
				System.out.println("保存截屏完毕...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("保存截屏失败...");
			}
			
			// 等待10s关闭
			Thread.sleep(3000);
			// 关闭浏览器
			System.out.println("等待3s开始关闭浏览器...");
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("抛出异常！");
		}
	}

}
