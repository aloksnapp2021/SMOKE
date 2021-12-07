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

WebUI.callTestCase(findTestCase('Basket/TC003'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_FIFM_link'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode_FIFM_again'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode_FIFM_again'), GlobalVariable.Postcode2)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/Find_button_FIFM_again'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('NW10 0UX', false)

WebUI.verifyTextPresent('PO61US', false)

WebUI.delay(2)

