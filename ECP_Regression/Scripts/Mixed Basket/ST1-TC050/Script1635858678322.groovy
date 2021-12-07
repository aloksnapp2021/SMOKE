import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Wiper Blades'))

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Product_Listing_Object/Product Title'))

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.click(findTestObject('Product_Details_Objects/PDP/cart_popup_View Basket_button'))

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK Delivery'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK delivery_after_postcode'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Expand Arrow'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Reg_email)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

Total = WebUI.getText(findTestObject('Order_Placement_Journey/HWD_Journey/Total (inc VAT) (Value)'))

Subtotal = WebUI.getText(findTestObject('Order_Placement_Journey/HWD_Journey/Subtotal (Price)'))

ShippingCharge = WebUI.getText(findTestObject('Order_Placement_Journey/HWD_Journey/Shipping and Handling charge (Value)'))

ProductPrice = WebUI.getText(findTestObject('Order_Placement_Journey/HWD_Journey/Product Price (Price)'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'), 0)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'))

WebUI.delay(7)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_Security_popup/input_OTP'), GlobalVariable.Security_code)

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

WebUI.verifyTextPresent(GlobalVariable.Reg_fname, false)

WebUI.verifyTextPresent(GlobalVariable.Reg_lname, false)

WebUI.verifyTextPresent(GlobalVariable.Reg_email, false)

WebUI.verifyTextPresent('Delivery Address:', false)

WebUI.verifyTextPresent(Total, false)

WebUI.verifyTextPresent(Subtotal, false)

WebUI.verifyTextPresent(ShippingCharge, false)

WebUI.verifyTextPresent(ProductPrice, false)

