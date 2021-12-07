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

WebUI.callTestCase(findTestCase('Base_Class_LIVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Batteries'))

WebUI.delay(3)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_Continue Shopping'))

WebUI.delay(1)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket_2_product'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Basket_objects/Random_object/input_Promo_code'), 5)

PriceX2 = WebUI.getText(findTestObject('Basket_objects/Random_object/total_price_value'))

price_1 = PriceX2.substring(1, 3)

Price_2_product = price_1.toInteger()

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/span_Remove_Product'))

WebUI.delay(2)

PriceX1 = WebUI.getText(findTestObject('Basket_objects/Random_object/total_price_value'))

price_2 = PriceX1.substring(1, 3)

Price_1_product = price_2.toInteger()

WebUI.verifyLessThan(Price_1_product, Price_2_product)

