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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), 'LR53ETT')

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.verifyElementPresent(findTestObject('Basket_objects/Oils_Link/a_OIL'), 0)

WebUI.click(findTestObject('Basket_objects/Oils_Link/a_OIL'))

cookies = WebUI.verifyElementPresent(findTestObject('Global_objects/button_Accept All Cookies'), 5, FailureHandling.OPTIONAL)

if (cookies) {
    WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)
}

//Applying filter to show only Special Buy Products
WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Filters/Special Buy Brand'), 5)

WebUI.click(findTestObject('Product_Listing_Object/Filters/Special Buy Brand'))

ProductName = WebUI.getText(findTestObject('Product_Listing_Object/Product Title'))

Exists = ProductName.contains('Special Buy')

//Verifying First Product is Special Buy Product
WebUI.verifyEqual(Exists, true)

WebUI.refresh()

cookies = WebUI.verifyElementPresent(findTestObject('Global_objects/button_Accept All Cookies'), 5, FailureHandling.OPTIONAL)

if (cookies) {
    WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)
}

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Filters/Special Buy Brand'), 0)

WebUI.click(findTestObject('Product_Listing_Object/Filters/Special Buy Brand'))

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Filters/0w30'), 5)

//Applying filter to 0w30(A PIM data of oil)
WebUI.click(findTestObject('Product_Listing_Object/Filters/0w30'))

ProductName = WebUI.getText(findTestObject('Product_Listing_Object/Product Title'))

Exists = ProductName.contains('Special Buy')

//Verifying first product is Special Buy
WebUI.verifyEqual(Exists, true)

Exists = ProductName.contains('0W-30')

//Verifying first special buy product shows after applying filter has 0W-30
WebUI.verifyEqual(Exists, true)

Exists = ProductName.contains('0W-40')

//Verifying that special buy product does not have incorrect PIP data in title say here we checking 0W-40 which is incorrect
WebUI.verifyEqual(Exists, false)

WebUI.refresh()

cookies = WebUI.verifyElementPresent(findTestObject('Global_objects/button_Accept All Cookies'), 5, FailureHandling.OPTIONAL)

if (cookies) {
    WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Product_Listing_Object/Filters/0w30'))

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Filters/0w40'), 5)

//Applying filter for PIM data 0w40
WebUI.click(findTestObject('Product_Listing_Object/Filters/0w40'))

WebUI.refresh()

ProductName = WebUI.getText(findTestObject('Product_Listing_Object/Product Title'))

Exists = ProductName.contains('Special Buy')

//Verifying First resulted product is a special buy product
WebUI.verifyEqual(Exists, true)

Exists = ProductName.contains('0W-40')

//Verifying first resulted product has correct PIM data 0W-40 as per selected in filter
WebUI.verifyEqual(Exists, true)

