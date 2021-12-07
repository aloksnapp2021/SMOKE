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

WebUI.click(findTestObject('CMS/Dashboard/Content_dropdow_link'))

WebUI.mouseOver(findTestObject('CMS/Dashboard/link_promotions'))

WebUI.click(findTestObject('CMS/Dashboard/link_Multiple_Promo_Code'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CMS/Promocode/Select Countdown Timer Dropdown'), 0)

WebUI.verifyElementPresent(findTestObject('CMS/Promocode/Select Autopopulate Dropdown'), 0)

WebUI.verifyElementNotPresent(findTestObject('CMS/Promocode/Autopopulate checkbox'), 0)

