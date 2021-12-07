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

WebUI.callTestCase(findTestCase('Base_Class_CMS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Dashboard/statistics_dropdown_link'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Dashboard/link_FIFM'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('CMS/FIFM/Report_type_select'), '1')

WebUI.delay(1)

String Current_date = new java.text.SimpleDateFormat('dd-MM-YYYY').format(new Date())

WebUI.sendKeys(findTestObject('CMS/FIFM/input_From_date'), Current_date)

WebUI.delay(1)

WebUI.click(findTestObject('CMS/FIFM/Submit_btn'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('CMS/FIFM/FIFM_Sales_report_data'), 0)

