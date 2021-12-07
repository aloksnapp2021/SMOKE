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

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Product_Details_Objects/input_search_box'), GlobalVariable.ProductNo)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Wiper Blades'))

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Product_Listing_Object/Product Title'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Add to Basket'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode2)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK delivery_after_postcode'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Page_Checkout/Checkout_as_register'))

String number = Math.abs(new Random().nextInt() % 2000) + 1

println(number)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/Checkout__email'), ('testingecp' + number) + '@gmail.com')

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/Checkout_password'), GlobalVariable.Reg_pass)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/Checkout_Cpass'), GlobalVariable.Reg_cpass)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

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

WebUI.verifyTextPresent('Sign up today to receive all of our latest offers', false)

