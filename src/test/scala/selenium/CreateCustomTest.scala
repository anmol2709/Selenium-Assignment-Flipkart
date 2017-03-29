package selenium

import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions
import org.scalatest.FlatSpec


class CreateCustomTest extends FlatSpec with TestSetUp {

  "A user" should "visit on flipkart.com" in {
    driver.manage().window().maximize()
    driver.get(BASE_URL)
  }

  "user" should "logged in " in {
    driver.findElementByLinkText("Log In").click()
    driver.findElementByCssSelector("._39M2dM ._2zrpKA").sendKeys(EMAIl)
    driver.findElementByCssSelector("._39M2dM ._2zrpKA._3v41xv").sendKeys(password)
    driver.findElementByCssSelector("._1avdGP ._2AkmmA._1LctnI._7UHT_c").click()
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)
  }

  "user" should "search shoes " in {
    Thread.sleep(5000)
    driver.findElementByCssSelector(".O8ZS_U .LM6RPg").sendKeys(shoes)
    //    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.className("puxlXr")))
    driver.findElementByCssSelector(".O8ZS_U .LM6RPg").submit
    //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)
  }

  "user" should "select a particular shoes " in {
    driver.findElementByLinkText("Nike LITEFORCE I Sneakers").click()
    driver.findElementByLinkText("9").click()
    driver.findElementByCssSelector("._1oaFsP._3YvPug .row .col.col-6-12 ._2AkmmA._3Plo8Q._19RW-r").click()
  }

  "user" should "search second item " in {
    Thread.sleep(5000)
    driver.findElementByCssSelector(".O8ZS_U .LM6RPg").sendKeys(phone)
    //    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.className("puxlXr")))
    driver.findElementByCssSelector(".O8ZS_U .LM6RPg").submit
    //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)
  }

  "user" should "select a particular mobile " in {
    driver.findElementByCssSelector("._1UoZlX ._3SQWE6").click()
    driver.findElementByCssSelector("._1oaFsP .row .col.col-6-12 ._2AkmmA._3Plo8Q._19RW-r").click()
  }

  "user" should "Go to cart and verify products" in {
    Thread.sleep(2000)
    driver.findElementByCssSelector(".AsXM8z .row ._3NFO0d").click()
    val cart = driver.findElementByCssSelector("._1k-OSK span:nth-child(2)")
    if (cart.getText == "2") println("Item added")
    else println("Item not added")
  }

  "user" should "Confirm order" in {
    Thread.sleep(5000)
    driver.findElement(By.cssSelector("div._1QdAN_ form button")).click()
  }

  "user" should "Fill up information" in {
    Thread.sleep(2000)
    driver.findElementById("name").sendKeys(name)
    driver.findElementById("pincode").sendKeys(pincode)
    driver.findElementById("address").sendKeys(address)
    driver.findElementById("phone").sendKeys(mobileNumber)
    Thread.sleep(2000)
    driver.findElementByCssSelector(".tpadding15 .btn.btn-large.btn-orange.address_submit").submit()
  }

  "user" should "go to home" in {
    Thread.sleep(5000)
    driver.findElementByClassName("flipkart-logo").click()
  }

  "user" should "log out" in {
    Thread.sleep(2000)
    val dropDown = driver.findElementByCssSelector("._3Ji-EC ._2sYLhZ._2mEF1S ._1AHrFc._2k0gmP")
    val mouseHover = new Actions(driver)
    mouseHover.moveToElement(dropDown)
    mouseHover.build().perform()
    driver.findElementByCssSelector("._1u5ANM li:nth-child(10) a._2k0gmP").click()
    Thread.sleep(2000)
    driver.close()
  }

}

