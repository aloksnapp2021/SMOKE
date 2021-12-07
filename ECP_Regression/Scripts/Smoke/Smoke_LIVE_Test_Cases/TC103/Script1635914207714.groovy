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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), GlobalVariable.REG)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_4_links/Service_parts/a_Brake Discs'))

WebUI.waitForPageLoad(0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product_Listing_Object/Surcharge/View Detail'))

WebUI.waitForPageLoad(0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product_Listing_Object/Check Stock/PDP_Check_stock_in_other_stores'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Product_Listing_Object/Check Stock/Postcode Textfield'), GlobalVariable.Postcode3)

WebUI.click(findTestObject('Product_Listing_Object/Check Stock/Check Stock Submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

Store = WebUI.getText(findTestObject('Product_Listing_Object/Check Stock/First Store Name'))

WebUI.click(findTestObject('Product_Listing_Object/Check Stock/Add for collection'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_Continue Shopping'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

Store2 = WebUI.getText(findTestObject('Product_Listing_Object/Check Stock/Store Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyEqual(Store, Store2)

