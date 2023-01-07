package com.izaanschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuApp {
    public void forgetPassword(){

        System.setProperty("webdriver.chrome.driver", "/Users/nrahman/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("rahman78@gmail.com");
        // driver.findElement(By.className("row")).sendKeys("rahman78@gmail.com");
        driver.findElement(By.tagName("i")).click();
        driver.quit();
    }

}
