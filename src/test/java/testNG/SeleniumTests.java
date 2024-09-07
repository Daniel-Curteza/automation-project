package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTests {
    WebDriver driver;
        @Test
        public void test03() {
            driver = BrowserUtils.getDriver();
            System.out.println(driver);
            //valabil pentru toate elementele din metoda; asteapta pana la maximum 10 secunde, dar nu si daca gaseste elementul
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

            driver.navigate().to("http://57.151.123.81:3000/#/");
            //WebElement dismiss = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted"));
            WebElement dismiss = driver.findElement(By.cssSelector(".close-dialog"));
            dismiss.click();

            WebElement account = driver.findElement(By.id("navbarAccount"));
            account.click();

            //WebElement login = driver.findElement(By.cssSelector("#mat-menu-panel-0"));
            //WebElement login = driver.findElement(By.id("navbarLoginButton"));
            //explicit wait,

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#navbarLoginButton")));

            login.click();

            WebElement loginText = driver.findElement(By.cssSelector(".mat-card > h1:nth-child(1)"));
            Assert.assertEquals(loginText.getText(), "Login");

            WebElement email = driver.findElement(By.cssSelector("#email"));
            email.click();
            email.clear();
            email.sendKeys("email@email.com");

            WebElement password = driver.findElement(By.id("password"));
            password.clear();
            password.sendKeys("password");

            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            //driver.quit();

        }
}
