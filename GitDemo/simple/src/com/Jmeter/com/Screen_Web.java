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
			System.out.println("���������...");

			WebDriver driver = new FirefoxDriver();

			System.out.println("�򿪵�ַ....");
			driver.get("http://www.baidu.com/");
			// ��������
			driver.manage().window().maximize();
			
			System.out.println("�򿪵�ַ�ɹ�...");
								
			// �ȴ�10s��ʼ����
			Thread.sleep(3000);
			// -------------------------��������
			System.out.println("�ȴ�3s��ʼ��������ʼ����...");
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);			
			
			try {
				// ----------����ͼƬ  new File("C:\\Users\\XD\\Desktop\\jpg\\screenshots1.jpg")
				Date currentTime = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String dateString = formatter.format(currentTime);
				File screenshot2 = new File("C:\\Users\\XD\\Desktop\\jpg\\"+ dateString  + ".png");
				FileUtils.copyFile(screenshot1, screenshot2);
				System.out.println("����������...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�������ʧ��...");
			}
			
			// �ȴ�10s�ر�
			Thread.sleep(3000);
			// �ر������
			System.out.println("�ȴ�3s��ʼ�ر������...");
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�׳��쳣��");
		}
	}

}
