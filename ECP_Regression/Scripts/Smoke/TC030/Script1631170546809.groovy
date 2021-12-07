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

WebUI.callTestCase(findTestCase('Smoke/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.International_Del_Product_Code)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Add to Basket'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Order_Placement_Journey/HWD_Journey/a_View Basket'), 0)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_View Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Looking_for_International_del'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), GlobalVariable.PhoneNo)

WebUI.selectOptionByLabel(findTestObject('Order_Placement_Journey/HWD_Journey/Select_Country_dropdown'), 'Australia', false)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/Select_Country_dropdown'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input_Address_1'), '# test street')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input_City_Town'), 'Melbourne')

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/input_address_postcode'), '3000')

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/HWD_Journey/DC_CC_select'), 5)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_Credit Card Number'), GlobalVariable.Credit_No)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_ExpDate'), GlobalVariable.Exp_date)

WebUI.sendKeys(findTestObject('Order_Placement_Journey/Checkout_CC/input_CVV'), GlobalVariable.CVV)

