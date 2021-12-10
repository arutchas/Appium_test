import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class emiAutomation {
    public static <MobileElement> void main(String args[]){


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "R58M765HRDF");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.continuum.emi.calculator");
        dc.setCapability("appActivity","com.finance.emicalci.activity.Splash_screnn");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);


        MobileElement el1 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/btnStart");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/etLoanAmount");
        el2.click();
        el2.sendKeys("100000");
        MobileElement el3 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/etInterest");
        el3.click();
        el3.sendKeys("9.0");
        MobileElement el4 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/etYears");
        el4.click();
        el4.sendKeys("2");
        MobileElement el5 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/etFee");
        el5.click();
        el5.sendKeys("2.0");
        MobileElement el6 = (MobileElement) ad.findElementById("com.continuum.emi.calculator:id/btnCalculate");
        el6.click();

    }
}
