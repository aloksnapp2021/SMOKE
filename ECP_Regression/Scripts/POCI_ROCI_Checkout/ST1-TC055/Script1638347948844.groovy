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

WebUI.callTestCase(findTestCase('Base_Class_SOPV3'), [:], FailureHandling.STOP_ON_FAILURE)

switch (GlobalVariable.SOPv3_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/Collection_orders_menu'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('SOPV3/Order Processing/Search Keyword'), '113-00015271308')

        WebUI.click(findTestObject('SOPV3/Order Processing/Submit'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('SOPV3/CNC/Order_detail_Page_Elements/Order_Type(Paid online or Payment-in-store)'), 
            0)

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

