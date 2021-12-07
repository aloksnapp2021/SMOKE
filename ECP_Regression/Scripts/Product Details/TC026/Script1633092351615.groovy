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

WebUI.sendKeys(findTestObject('Product_Details_Objects/input_reg'), GlobalVariable.REG)

WebUI.click(findTestObject('Product_Details_Objects/REG_submit_top'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Basket_objects/Car Parts Page/Change Vehicle Button'), 0)

WebUI.waitForPageLoad(0)

WebUI.delay(2)

//WebUI.mouseOver(findTestObject('Product_Details_Objects/a_Car Parts'))
WebUI.click(findTestObject('Product_Details_Objects/a_Brake Discs'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Product_Listing_Object/Product Title'), 0)

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Product_Listing_Object/Product Title'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Product_Details_Objects/PDP/Add_to_basket'), 0)

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.click(findTestObject('Product_Details_Objects/Cart_popup_close'))

WebUI.delay(2)

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

