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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), GlobalVariable.REG_2)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/Oils_Link/a_OIL'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

//Validating First Product in list is Special buy Cloned Product
ProductName = WebUI.getAttribute(findTestObject('Product_Listing_Object/Product Title'), 'title')

Exists = ProductName.contains('Special Buy')

WebUI.verifyEqual(Exists, true)

//Verifing cloned product price (should be £10.00)
WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Cloned Product Price'), 0)

//Verifing Masked product price (should be £82.99)
WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Masked Product Price'), 0)

