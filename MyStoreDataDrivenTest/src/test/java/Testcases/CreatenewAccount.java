package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Baseclass;
import PageObjects.MystorePageObjects;
import Utilities.XLUtils;

public class CreatenewAccount extends Baseclass{
	
	@Test(dataProvider="createAcc")
	public void mainTest(String newem,String gen,String fname, String lname,String pass,String day,String mon,String yr,String cmp,String addr,String city,String state,String code,String country,String mob) throws Exception
	{
		MystorePageObjects obj=new MystorePageObjects(driver);
        obj.clicksignin();
        obj.Setemail(newem);
        obj.clickCreate();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       WebElement gen1= driver.findElement(By.xpath("//input[@id='id_gender1']"));
       WebElement gen2= driver.findElement(By.xpath("//input[@id='id_gender2']"));
        String gender=obj.custgender(gen);
        if(gender.equalsIgnoreCase("Mrs"))
        {
        	gen2.click();
        }else {
        	gen1.click();
        }
       obj.firstName(fname);
       Thread.sleep(3000);
       
       obj.lastName(lname);
       Thread.sleep(3000);
       
     /*  obj.setEmail(email);
       Thread.sleep(3000);*/
       
       obj.setpassword(pass);
       Thread.sleep(3000);
       
       obj.setday(day);
       Thread.sleep(3000);
       
       obj.setmonth(mon);
       Thread.sleep(3000);
       
       obj.setyear(yr);
       Thread.sleep(3000);
       
     /*  obj.firstName(fname);
       Thread.sleep(3000);
       
       obj.lastName(lname);
       Thread.sleep(3000);*/
       
       obj.setcompany(cmp);
       Thread.sleep(3000);
       
       obj.setAddress(addr);
       Thread.sleep(3000);
       
       obj.setCity(city);
       Thread.sleep(3000);
       
       obj.setState(state);
       Thread.sleep(3000);
       
       obj.setcode(code);
       Thread.sleep(3000);
       
       obj.setcountry(country);
       Thread.sleep(3000);
       
       obj.setmobile(mob);
       
       Thread.sleep(3000);
       obj.clicksubmit();
       
       obj.clicksignout();
        	
}








@DataProvider(name="createAcc")
String[][] getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/resources/TestData/TestData.xlsx";
 
	int rownum=XLUtils.getRowCount(path,"AccountCreationData");
    int colcount=XLUtils.getCellCount(path,"AccountCreationData",1);
    String newaccountdata[][]=new String[rownum][colcount];
    for(int i=1;i<=rownum;i++)
    {
    	for(int j=0;j<colcount;j++)
    	{
    		newaccountdata[i-1][j]=XLUtils.getCellData(path,"AccountCreationData", i, j);
    		System.out.println("values := "+newaccountdata[i-1][j]);
    	}


}
    return newaccountdata;
}
}