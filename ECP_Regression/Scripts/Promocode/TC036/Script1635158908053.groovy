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

//Select Auto Promo applicable category
'Select Auto Promo applicable category'
WebUI.click(findTestObject('Homepage_objects/Home_only/a_Batteries'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Product_Listing_Object/Product Title_Updated'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

'If fail (Select auto promo applicable category product)'
OriginalPrice = WebUI.getText(findTestObject('Product_Details_Objects/PDP/Original Price'))

OriginalPrice = OriginalPrice.substring(1)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/Random_object/Promo_code_Remove_button'))

WebUI.delay(3)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.delay(2)

OriginalPricePDP = WebUI.getText(findTestObject('Product_Details_Objects/PDP/Price (When no promo applied)'))

WebUI.verifyEqual(OriginalPrice, OriginalPricePDP)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.delay(2)

OriginalPricePLP = WebUI.getText(findTestObject('Product_Listing_Object/Price (When No promo applied)'))

OriginalPricePLP = OriginalPricePLP.substring(1)

WebUI.verifyEqual(OriginalPrice, OriginalPricePLP)
