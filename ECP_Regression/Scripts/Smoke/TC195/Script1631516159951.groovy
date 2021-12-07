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

WebUI.callTestCase(findTestCase('Smoke/TC194'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CMS/Dashboard/statistics_dropdown_link'))

WebUI.click(findTestObject('CMS/Dashboard/link_channel_reporting'))

WebUI.delay(1)

WebUI.clearText(findTestObject('CMS/Channel_reporting/calendar_start_date'))

WebUI.sendKeys(findTestObject('CMS/Channel_reporting/calendar_start_date'), '08/01/2021')

WebUI.clearText(findTestObject('CMS/Channel_reporting/calendar_end_date'))

WebUI.sendKeys(findTestObject('CMS/Channel_reporting/calendar_end_date'), '08/30/2021')

WebUI.click(findTestObject('CMS/Channel_reporting/button_submit_search'))

WebUI.delay(1)
