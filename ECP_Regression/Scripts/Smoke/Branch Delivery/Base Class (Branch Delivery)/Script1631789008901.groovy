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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.authenticate(GlobalVariable.URL_ST1, GlobalVariable.Auth_username, GlobalVariable.Auth_password, 5)

WebUI.click(findTestObject('Global_objects/Popup_close_ST1'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Homepage_objects/Home_only/input_searchbar'), GlobalVariable.DHL_DPD_Branch_Product)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 5)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/button_Place Order'), 0)

WebUI.navigateToUrl(GlobalVariable.URL_ST1 + GlobalVariable.CarriageURL)

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/Branch Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/BD Express Delivery'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/Checkout__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/button_Find_delivery_details'))

WebUI.selectOptionByIndex(findTestObject('Checkout_objects/Page_Checkout/select_address_dropdown'), 1)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Branch Delivery'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'), 0)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/button_Place Order'))

WebUI.sendKeys(findTestObject('Checkout_objects/Security_OTP/input_OTP'), GlobalVariable.Security_code)

String Browser_name = DriverFactory.getExecutedBrowser().getName()

if ((Browser_name == 'CHROME_DRIVER') || (Browser_name == 'EDGE_CHROMIUM_DRIVER')) {
    WebUI.scrollToElement(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'), 5)

    WebUI.click(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'))
} else if (Browser_name == 'FIREFOX_DRIVER') {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
} else {
    println('Specified browser is not in the list of the script browsers. Please check if-else statements.')
}

WebUI.delay(10)

WebUI.verifyTextPresent('Thank you for your order', false)

