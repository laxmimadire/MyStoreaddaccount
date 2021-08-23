package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MystorePageObjects {
	WebDriver ldriver;
	 public MystorePageObjects(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
	 
@FindBy(xpath = "//a[contains(text(),'Sign in')]")
@CacheLookup
WebElement signin;

@FindBy(xpath="//input[@id='email_create']")
@CacheLookup
WebElement newemail;

@FindBy(xpath="//button[@id='SubmitCreate']")
@CacheLookup
WebElement createbtn;

@FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/div[1]")
@CacheLookup
WebElement rad;

@FindBy(xpath="//input[@id='customer_firstname']")
@CacheLookup
WebElement fname;

@FindBy(xpath="//input[@id='customer_lastname']")
@CacheLookup
WebElement lname;



@FindBy(xpath="//input[@id='passwd']")
@CacheLookup
WebElement password;

@FindBy(xpath="//select[@id='days']")
@CacheLookup
WebElement day;

@FindBy(xpath="//select[@id='months']")
@CacheLookup
WebElement month;

@FindBy(xpath=" //select[@id='years']")
@CacheLookup
WebElement year;

@FindBy(xpath="//input[@id='company']")
@CacheLookup
WebElement company;

@FindBy(xpath="//input[@id='address1']")
@CacheLookup
WebElement Address;

@FindBy(xpath="//input[@id='city']")
@CacheLookup
WebElement city;

@FindBy(xpath="//select[@id='id_state']")
@CacheLookup
WebElement state;

@FindBy(xpath="//input[@id='postcode']")
@CacheLookup
WebElement postcode;

@FindBy(xpath="//select[@id='id_country']")
@CacheLookup
WebElement country;

@FindBy(xpath="//input[@id='phone_mobile']")
@CacheLookup
WebElement mobile;

@FindBy(xpath = "//button[@id='submitAccount']")
@CacheLookup
WebElement submitbtn;

@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
@CacheLookup
WebElement signout;


public void clicksignin()
{
	signin.click();
}
public void Setemail(String email)
{
	newemail.sendKeys(email);	
}
public void clickCreate()
{
	createbtn.click();
}
public String custgender(String gen)
{
rad.click();
return gen;	
}
public void firstName(String name)
{
	fname.sendKeys(name);
}
public void lastName(String lastname)
{
	lname.sendKeys(lastname);
}

public void setpassword(String pass)
{
password.sendKeys(pass);
}
public void setday(String days)
{
day.sendKeys(days);
}
public void setmonth(String mon)
{
	month.sendKeys(mon);
}
public void setyear(String yr)
{
	year.sendKeys(yr);
}
public void setcompany(String cmp)
{
	company.sendKeys(cmp);
}
public void setAddress(String addr)
{
	 Address.sendKeys(addr);
}
public void setCity(String citi)
{
	city.sendKeys(citi);
}
public void setState(String stat)
{
	state.sendKeys(stat);
}
public void setcode(String post)
{
	postcode.sendKeys(post);
}
public void setcountry(String contry)
{
	country.sendKeys(contry);
}
public void setmobile(String mnum)
{
	mobile.sendKeys(String.valueOf(mnum));
}
public void clicksubmit()
{
	submitbtn.click();
}
public void clicksignout()
{
	signout.click();
}
}
