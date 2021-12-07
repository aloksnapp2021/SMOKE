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

WebUI.callTestCase(findTestCase('Smoke/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), 'LR53ETT')

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.verifyElementPresent(findTestObject('HeaderS_objects/Search_home/input_search_box'), 0)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), '52177099')

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

//Fetching special buy product title before placing HWD order
ProductTitle = WebUI.getText(findTestObject('Product_Details_Objects/PDP/Product_title'))

WebUI.click(findTestObject('Product_Listing_Object/Add to Basket_button'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), 'HA90TF')

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'), 0)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.verifyElementPresent(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'), 0)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), 'ecptest@netsolutions.com')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), 'Test')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), 'ECP')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), '967788654243')

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), 1)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Payment_debit_card'))

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'))

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

//Fetching Special Buy Product title at Order Confirmation page
ProductTitle2 = WebUI.getText(findTestObject('Checkout_objects/Page_Checkout/HWD_Order__Product_Title'))

//Verifying Special Buy Product Title is same at Order Confirmation page
WebUI.verifyEqual(ProductTitle, ProductTitle2)

