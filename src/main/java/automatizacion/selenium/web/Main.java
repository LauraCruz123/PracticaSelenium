package automatizacion.selenium.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("http://10.238.60.2:8049");

        try {

            WebElement usuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("custom-field")));
            usuario.click();

            usuario.sendKeys("sop");

            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("f1")));
            password.click();
            password.sendKeys("sop");


        }
        catch(Exception e) {
            System.out.println("accion incorrecta."+ e.getMessage());
        }


        try {

            WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xlg0019")));
            ingresar.click();

                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ingresar")));

            System.out.println(" El botón fue ccionado correctamente.");
        }
       catch(Exception e) {
           System.out.println("El boton no fue acciónado correctamente."+ e.getMessage());
       }


        Thread.sleep(2000);
        driver.quit();

    }

    }