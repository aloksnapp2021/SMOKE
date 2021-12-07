import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.support.Color as Color
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('Base_Class_LIVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Product_Details_Objects/input_search_box'), GlobalVariable.ProductNo)

WebUI.click(findTestObject('Product_Details_Objects/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

ColorCode = WebUI.getCSSValue(findTestObject('Product_Listing_Object/In Stock Text'), 'color')

ColorCode = Color.fromString(ColorCode).asHex()

WebUI.verifyEqual(ColorCode, '#62a020')

WebUI.sendKeys(findTestObject('Product_Details_Objects/input_search_box'), GlobalVariable.ProductNo7)

WebUI.click(findTestObject('Product_Details_Objects/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

ColorCode2 = WebUI.getCSSValue(findTestObject('Product_Listing_Object/Out of stock Text'), 'color')

ColorCode2 = Color.fromString(ColorCode2).asHex()

WebUI.verifyEqual(ColorCode2, '#ff0000')

