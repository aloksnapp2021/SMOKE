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

WebUI.callTestCase(findTestCase('Base Class'), [:], FailureHandling.STOP_ON_FAILURE)

'all dimenssions less than 61 product selected'
WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), '408440170')

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), 'SR53JG')

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'), 0)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/button_Place Order'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/Royal Mail'), 0)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/button_Find_delivery_details'))

WebUI.selectOptionByIndex(findTestObject('Checkout_objects/Page_Checkout/select_address_dropdown'), 1)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'))

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Royal Mail'))

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Payment_debit_card'))

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Checkout_objects/Checkout_CC_number/input_CVV'), GlobalVariable.CVV)

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/button_Place Order'))

WebUI.sendKeys(findTestObject('Checkout_objects/Security_OTP/input_OTP'), GlobalVariable.Security_code)

WebUI.sendKeys(findTestObject('Checkout_objects/Security_OTP/input_OTP'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('HWDorder_objects/Page_Order Confirmation/h2_Thank you for your order'), 0)

