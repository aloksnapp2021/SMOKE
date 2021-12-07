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

WebUI.callTestCase(findTestCase('Smoke/Smoke_LIVE_Test_Cases/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Batteries'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/button_Collection'))

WebUI.delay(3)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/span_Select this store'))

WebUI.delay(3)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/button_Collection_after_postcode'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Select_POCI_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Country_address_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Country_address_dropdown'), 
    '1')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Postcode_address_billing'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/btn_FIND_POCI'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Address_select'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Address_select'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/DC_CC_select'), 5)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), GlobalVariable.CVV)

