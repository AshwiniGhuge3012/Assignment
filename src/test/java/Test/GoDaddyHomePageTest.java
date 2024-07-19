package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.GoDaddyHomePage;

public class GoDaddyHomePageTest extends BaseTest {

	@BeforeMethod
	public void openApplication() {
		driver = Browser.launchApplication();
	}

	@Test

	public void verifyIfUserIsAbleToAccessMenu1() {

		goDaddyHomePage = new GoDaddyHomePage(driver);
		goDaddyHomePage.ClickOnDomains();
		FluentWait<WebDriver> Wait = new FluentWait<WebDriver>(driver);
		Wait.withTimeout(Duration.ofSeconds(5));
		Wait.pollingEvery(Duration.ofSeconds(1));
		Wait.ignoring(TimeoutException.class);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//ul//li[@class='pl-prkaso'])[1]")));
		goDaddyHomePage.ClickOnSearchForDomainNames();
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		Assert.assertTrue(Title1.contains("Domain"));
		goDaddyHomePage.ClickOnLogo();

	}

	@Test
	public void verifyIfUserIsAbleToAccessMenu2() throws EncryptedDocumentException, IOException, InterruptedException {
		goDaddyHomePage = new GoDaddyHomePage(driver);
		goDaddyHomePage.ClickonWebsitesAndHosting1();
		FluentWait<WebDriver> Wait = new FluentWait<WebDriver>(driver);
		Wait.withTimeout(Duration.ofSeconds(5));
		Wait.pollingEvery(Duration.ofSeconds(1));
		Wait.ignoring(TimeoutException.class);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Website Builder'])[1]")));
		goDaddyHomePage.ClickonWebsiteBuilder();
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		Assert.assertTrue(Title2.contains("Website Builder"));
		goDaddyHomePage.ClickOnLogo();

	}

	@Test

	public void verifyIfUserIsAbleToAccessMenu3() {
		goDaddyHomePage = new GoDaddyHomePage(driver);
		goDaddyHomePage.ClickOnSecurity();
		FluentWait<WebDriver> Wait = new FluentWait<WebDriver>(driver);
		Wait.withTimeout(Duration.ofSeconds(5));
		Wait.pollingEvery(Duration.ofSeconds(1));
		Wait.ignoring(TimeoutException.class);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SSL Certificates']")));
		goDaddyHomePage.ClickOnSSLCertificates();
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		Assert.assertTrue(Title3.contains("SSL Certificates"));
		goDaddyHomePage.ClickOnLogo();

	}

	@Test

	public void verifyIfUserIsAbleToAccessMenu4() {
		goDaddyHomePage = new GoDaddyHomePage(driver);
		goDaddyHomePage.ClickOnMarketing();
		FluentWait<WebDriver> Wait = new FluentWait<WebDriver>(driver);
		Wait.withTimeout(Duration.ofSeconds(10));
		Wait.pollingEvery(Duration.ofSeconds(1));
		Wait.ignoring(TimeoutException.class);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Digital Marketing']")));
		goDaddyHomePage.ClickOnDigitalMarketing();
		String Title4 = driver.getTitle();
		System.out.println(Title4);
		Assert.assertTrue(Title4.contains("Digital Marketing"));
		goDaddyHomePage.ClickOnLogo();

	}

}
