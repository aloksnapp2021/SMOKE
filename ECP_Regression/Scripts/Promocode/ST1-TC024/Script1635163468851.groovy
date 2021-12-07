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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Base_Class_AdminV3'), [:], FailureHandling.STOP_ON_FAILURE)

switch (GlobalVariable.Adminv3_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.click(findTestObject('Admin/Dashboard/link_Edit_UK'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('Admin/Edit_page/link_Site_Modules'))

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('Admin/Site Module/Auto Apply Promo (Off)'), 0)

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

