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

WebUI.callTestCase(findTestCase('Base_Class_CMS'), [:], FailureHandling.STOP_ON_FAILURE)

switch (GlobalVariable.CMS_Instance) {
	case 'ST1':
	case 'ST2':
	case 'ST3':
	case 'ST4':

WebUI.delay(2)

WebUI.click(findTestObject('CMS/Dashboard/Content_dropdow_link'))

WebUI.mouseOver(findTestObject('CMS/Dashboard/link_promotions'))

WebUI.click(findTestObject('CMS/Dashboard/link_Multiple_Promo_Code'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('CMS/Promocode/Select Site Dropdown'), '1', false)

WebUI.click(findTestObject('CMS/Promocode/Search Button'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('CMS/Promocode/Edit Promo'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.END))

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Promocode/Autopouplate Promo Code (Checkbox)'))

WebUI.verifyAlertPresent(0)

break
default:
	println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

