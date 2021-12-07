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

WebUI.callTestCase(findTestCase('Smoke/TC031'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Basket_objects/Random_object/input_Promo_code'), 5)

WebUI.click(findTestObject('Basket_objects/Cart_qty_box/cart_qty_change_box'))

WebUI.click(findTestObject('Basket_objects/Cart_qty_box/qty_select_2'))

WebUI.delay(3)

pricevalue_initial = WebUI.getText(findTestObject('Basket_objects/Random_object/total_price_value'))

pricevalue_initial_final = pricevalue_initial.substring(1, 3)

Total_parsed_price = pricevalue_initial_final.toInteger()

WebUI.click(findTestObject('Basket_objects/Cart_qty_box/cart_qty_change_box'))

WebUI.click(findTestObject('Basket_objects/Cart_qty_box/qty_select_1'))

WebUI.delay(3)

pricevalue_final = WebUI.getText(findTestObject('Basket_objects/Random_object/total_price_value'))

pricevalue_final_parsed = pricevalue_final.substring(1, 3)

WebUI.verifyEqual(pricevalue_final_parsed, Total_parsed_price / 2)

