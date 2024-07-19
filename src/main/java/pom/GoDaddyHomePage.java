package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoDaddyHomePage {

	@FindBy(xpath = ("(//li[@data-cy='primary-nav-tray-menu-item'])[2]"))
	private WebElement websitesAndHosting;
	@FindBy(xpath = "(//a[text()='Website Builder'])[1]")
	private WebElement websiteBuilder;
	@FindBy(xpath = "(//a[@aria-label='GoDaddy'])[1]")
	private WebElement logo;
	@FindBy(xpath = ("//li[@data-track-name='domains2']"))
	private WebElement domains;
	@FindBy(xpath = ("(//div//ul//li[@class='pl-prkaso'])[1]"))
	private WebElement searchForDomainNames;
	@FindBy(xpath = ("//li[@data-track-name='in_security']"))
	private WebElement security;
	@FindBy(xpath = ("//a[text()='SSL Certificates']"))
	private WebElement sslCerificates;
	@FindBy(xpath = ("//li[@data-track-name='marketing3']"))
	private WebElement marketing;
	@FindBy(xpath = ("//a[text()='Digital Marketing']"))
	private WebElement digitalMarketing;

	public GoDaddyHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickonWebsitesAndHosting1() {
		websitesAndHosting.click();
	}

	public void ClickonWebsiteBuilder() {
		websiteBuilder.click();
	}

	public void ClickOnLogo() {
		logo.click();
	}

	public void ClickOnDomains() {
		domains.click();
	}

	public void ClickOnSearchForDomainNames() {
		searchForDomainNames.click();

	}

	public void ClickOnSecurity() {
		security.click();
	}

	public void ClickOnSSLCertificates() {
		sslCerificates.click();
	}

	public void ClickOnMarketing() {
		marketing.click();
	}

	public void ClickOnDigitalMarketing() {
		digitalMarketing.click();
	}

}
