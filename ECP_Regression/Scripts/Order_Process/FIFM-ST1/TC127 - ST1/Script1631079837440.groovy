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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.ProductNo5)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_close'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.Product4_FIFM_Disabled)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/FIFM/Basket_View_Fitting_options'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Basket_objects/FIFM/input_FIFM_postcode'), GlobalVariable.Postcode)

WebUI.sendKeys(findTestObject('Basket_objects/FIFM/input_FIFM_REG'), GlobalVariable.REG_2)

WebUI.click(findTestObject('Basket_objects/FIFM/button_Next'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.END))

WebUI.click(findTestObject('Basket_objects/FIFM/button_Next_2'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/FIFM_Journey/View_details_scroll'), 5)

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_View details'))

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/FIFM_Journey/Select_workshop_navigate'), 5)

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Select workshop'))

WebUI.delay(5)

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Continue'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_Objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Checkout/input_email'), 'costantz@yopmail.com')

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/FIFM_Checkout/select_Title'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Checkout/input_firstname'), 'Deigo')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Checkout/input_secondname'), 'Costa')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Checkout/input__mobileno'), '9998887776')

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Checkout/select_payment_method_type'))

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_Credit Card Number'), '4111 1111 1111 1111')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), '09 / 23')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), '567')

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/FIFM_Checkout/select_Country_dropdown'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Checkout/input_postcode_address'), 'SR53JG')

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Checkout/button_Find'))

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/FIFM_Checkout/select_address_from_dropdown'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Checkout/button_Place Order'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_Security_popup/input_OTP'), '1234')

WebUI.delay(2)

String Browser_name = DriverFactory.getExecutedBrowser().getName()

if (((Browser_name == 'CHROME_DRIVER') || (Browser_name == 'EDGE_CHROMIUM_DRIVER')) || (Browser_name == 'SAFARI_DRIVER')) {
    WebUI.scrollToElement(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'), 5)

    WebUI.click(findTestObject('Order_Placement_Journey/Checkout_Security_popup/button_submit'))
} else if (Browser_name == 'FIREFOX_DRIVER') {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
} else {
    println('Specified browser is not in the list of the script browsers. Please check if-else statements.')
}

WebUI.waitForPageLoad(0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Order_Placement_Journey/Order Success_objects/h2_Thank you for your order'), 
    0)

