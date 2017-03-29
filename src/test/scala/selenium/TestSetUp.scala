package selenium

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "http://www.flipkart.com/"
  val EMAIl = "" //put your flipkart id
  val password = ""  //put your flipkart password and keep cart empty and no address by default
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
  val shoes="Nike sneakers"
  val phone="i-phone 7 128gb"
  val name="Anmol"
  val pincode="121001"
  val address="House number-987 ,Faridabad"
  val mobileNumber="9971783971"

}
