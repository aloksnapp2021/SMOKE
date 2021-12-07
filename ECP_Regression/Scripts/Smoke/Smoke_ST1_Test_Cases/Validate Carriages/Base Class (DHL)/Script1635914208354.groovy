import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Homepage_objects/Home_only/input_searchbar'), GlobalVariable.DHL_DPD_Branch_Product)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), GlobalVariable.DHL_DPD_Carriages_Postcode)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.waitForPageLoad(0)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 5)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.waitForPageLoad(0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL_ST1 + GlobalVariable.CarriageURL)

WebUI.delay(2)

WebUI.back()

WebUI.delay(3)

Time = WebUI.getText(findTestObject('Checkout_objects/Page_Checkout/DHL Express Delivery Time Text'), FailureHandling.OPTIONAL)

WebUI.verifyEqual(GlobalVariable.CarriageTime, Time, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/select_address_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Checkout_objects/Page_Checkout/select_address_dropdown'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Express_delivery'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'), 0)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Checkout_objects/Security_OTP/input_OTP'), GlobalVariable.Security_code)

WebUI.delay(1)

String Browser_name = DriverFactory.getExecutedBrowser().getName()

if (Browser_name == 'FIREFOX_DRIVER') {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
} else {
    WebUI.scrollToElement(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'), 5)

    WebUI.click(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'))
}

WebUI.waitForPageLoad(0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Thank you for your order', false)

