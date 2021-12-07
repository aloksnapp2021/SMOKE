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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), GlobalVariable.REG_2)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.GroupProductCode)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

//Fetching special buy product title before placing HWD order
ProductTitle = WebUI.getText(findTestObject('Product_Details_Objects/PDP/Product_title'))

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), GlobalVariable.Postcode3)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(4)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'))

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_Security_popup/input_OTP'), GlobalVariable.Security_code)

WebUI.delay(1)

String Browser_name = DriverFactory.getExecutedBrowser().getName()

if (Browser_name == 'FIREFOX_DRIVER') {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
} else {
    WebUI.scrollToElement(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'), 5)

    WebUI.click(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'))
}

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Thank you for your order', false)

//Verifying Special Buy Product Title is same at Order Confirmation page
WebUI.verifyTextPresent(ProductTitle, false)

