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

ProductName = WebUI.getAttribute(findTestObject('Product_Listing_Object/Product Title'), 'title')

Exists = ProductName.contains('Special Buy')

//Verifying that first product at PLP is a special buy product
WebUI.verifyEqual(Exists, true)

WebUI.scrollToElement(findTestObject('Product_Listing_Object/Product Title'), 0)

//Fetching image src of first product at PLP which is a special buy cloned product
Image1 = WebUI.getAttribute(findTestObject('Product_Listing_Object/Product Image'), 'src')

println(Image1)

GlobalVariable.GroupProductCode = '521770991'

WebUI.click(findTestObject('Product_Listing_Object/Click Brand In Grouping (By Product Code)', [('ProductCode') : GlobalVariable.GroupProductCode]))

//Fetching image src of original brand 
Image2 = WebUI.getAttribute(findTestObject('Product_Listing_Object/Product Image (Product Code)', [('ProductCode') : GlobalVariable.GroupProductCode]), 
    'src')

println(Image2)

//Verifying cloned product and original products images are same with src
WebUI.verifyEqual(Image1, Image2)

