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

//Validating First Product in list is Special buy Cloned Product
ProductName = WebUI.getAttribute(findTestObject('Product_Listing_Object/Product Title'), 'title')

Exists = ProductName.contains('Special Buy')

WebUI.verifyEqual(Exists, true)

//Fetching Price of Cloned Product
Price = WebUI.getText(findTestObject('Product_Listing_Object/Price (Product Code)', [('ProductCode') : 'SPECIAL_BUY-52177099']))

println(Price)

Exists = Price.contains('£20.00')

//Veryfing cloned product price is same as set in CMS
WebUI.verifyEqual(Exists, true)

//Fetching Price of Masked Product (521772351 is the product code)
Price = WebUI.getText(findTestObject('Product_Listing_Object/Price (Product Code)', [('ProductCode') : '521772351']))

println(Price)

Exists = Price.contains('£82.99')

//Veryfing Masked product price is same as set in CMS
WebUI.verifyEqual(Exists, true)

