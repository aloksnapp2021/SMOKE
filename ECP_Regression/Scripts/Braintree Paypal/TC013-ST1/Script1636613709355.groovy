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

WebUI.waitForPageLoad(0)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.ProductNo5)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK Delivery'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 0)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK delivery_after_postcode'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Checkout_Paypal_radio'))

WebUI.delay(5)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Pay With paypal Button'))

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Checkout_objects/Paypal_Login/Username'), GlobalVariable.Paypal_Username)

WebUI.click(findTestObject('Checkout_objects/Paypal_Login/Next_Button'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Checkout_objects/Paypal_Login/Password'), GlobalVariable.Paypal_Password)

WebUI.delay(2)

WebUI.click(findTestObject('Checkout_objects/Paypal_Login/Login_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Checkout_objects/Paypal_Login/PayNow_Button'))

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(0)

WebUI.delay(5)

OrderID = WebUI.getText(findTestObject('Order_objects/Order_details/Order Id'))

WebUI.navigateToUrl(GlobalVariable.Braintree_Sandbox_URL_ST1_ST3)

WebUI.sendKeys(findTestObject('Braintree Sandox Website/Login/Username'), GlobalVariable.Braintree_Username_ST1_ST3)

WebUI.sendKeys(findTestObject('Braintree Sandox Website/Login/Password'), GlobalVariable.Braintree_Password_ST1_ST3)

WebUI.click(findTestObject('Braintree Sandox Website/Login/Submit_Login_Button'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

'Delay because order takes time to show in braintree'
WebUI.delay(20)

WebUI.sendKeys(findTestObject('Braintree Sandox Website/Home Page/Search'), OrderID)

WebUI.click(findTestObject('Braintree Sandox Website/Home Page/Search'))

WebUI.sendKeys(findTestObject('Braintree Sandox Website/Home Page/Search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Braintree Sandox Website/Search Results/Payment method Paypal'), 0)

