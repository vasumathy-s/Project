package com.test.irctctestcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BusBooking extends BaseClass{
	@Test
	public void bus() throws InterruptedException {
		try{
			System.out.println("Hello i am in bus");
			driver.findElement(By.xpath("//input[@name='departFrom']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("Goa Airport");
			driver.findElement(By.xpath("//input[@id='departDate']")).sendKeys("25-04-2022");
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("In Catch " +e.getMessage());
			System.out.println("cause is "+e.getCause());
			e.printStackTrace();
		}
	}
	//@Test(priority =4)
//	public void flight() throws InterruptedException {
//		try {
//			System.out.println("Hello i m in flight");
//			driver.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("Pune (PNQ)");
//			driver.findElement(By.xpath("//input[@id='stationTo']")).sendKeys("Mumbai (BOM)");
//			//driver.findElement(By.xpath("")).sendKeys("");
//			//driver.findElement(By.xpath("")).sendKeys("");
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println("In Catch " +e.getMessage());
//			System.out.println("cause is "+e.getCause());
//			e.printStackTrace();
//		}
//	}
}
