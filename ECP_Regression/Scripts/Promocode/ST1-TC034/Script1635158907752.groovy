import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('Base_Class_CMS'), [:], FailureHandling.STOP_ON_FAILURE)

switch (GlobalVariable.CMS_Instance) {
	case 'ST1':
	case 'ST2':
	case 'ST3':
	case 'ST4':

WebUI.delay(2)

WebUI.click(findTestObject('CMS/Dashboard/Content_dropdow_link'))

WebUI.mouseOver(findTestObject('CMS/Dashboard/link_promotions'))

WebUI.click(findTestObject('CMS/Dashboard/link_single_promo_code'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('CMS/Promocode/add_new_promo/Apply Auto Populate(Single Promo)'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('CMS/Promocode/add_new_promo/Alert Message Single Promo'), 0)


break
default:
	println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

