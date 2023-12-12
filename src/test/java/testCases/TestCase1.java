package testCases;

import basisDatei.basis;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends basis {


    @Test (priority = 1)
    public void inputHose() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.id("gdpr-banner-accept")).click(); Cookie

        driver.findElement(By.id("gh-ac")).sendKeys("Hose");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

//        WebElement radioButtonBlau = driver.findElement(By.xpath("//input[@aria-label='Blau']"));
//        radioButtonBlau.click();
//        Thread.sleep(3000);
        //Assert.assertTrue(radioButtonBlau.isSelected());     //Überprüfen, ob radioButton angeklickt wurde

    }

    @Test (priority = 2)
    public void print1(){
        System.out.println("Es ist TestCase1");
        Assert.assertEquals(1,1);
    }


}

