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

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK Delivery'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 0)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK delivery_after_postcode'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Find'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/HWD_Journey/Address_select'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Delivery_select'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'), 0)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/button_Place Order'))

WebUI.delay(7)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_Security_popup/input_OTP'), 'WRONGOTP')

WebUI.delay(2)

WebUI.verifyTextNotPresent('Thank you for your order', false)

