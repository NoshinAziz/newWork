package com.izaanschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime= System.currentTimeMillis();
         long execuTionTime= endTime-startTime;
       System.out.println(execuTionTime);

        System.setProperty("webdriver.chrome.driver", "/Users/nrahman/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //driver.findElement(By.linkText("YacQv")).click();
       String pageTitle = driver.getTitle();
       System.out.println("Page Title : " + pageTitle);


        driver.quit();




    }
}
