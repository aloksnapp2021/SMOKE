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

WebUI.callTestCase(findTestCase('Order_Process/CNC - POCI_ROCI/POCI_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(5)

OrderID = WebUI.getText(findTestObject('Order_Confirmation_objects/CNC/Order_reference_CNC'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Base_Class_CMS'), [:], FailureHandling.STOP_ON_FAILURE)

switch (GlobalVariable.CMS_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.click(findTestObject('CMS/Dashboard/Reserve_and_collect_dropdown_link'))

        WebUI.delay(2)

        WebUI.click(findTestObject('CMS/Dashboard/Generate_XML_link'))

        WebUI.delay(2)

        WebUI.click(findTestObject('CMS/Generate_XML_Page_object/Select_Site'))

        WebUI.delay(2)

        WebUI.selectOptionByValue(findTestObject('CMS/Generate_XML_Page_object/Select_Site'), '1', false)

        WebUI.delay(2)

        WebUI.selectOptionByValue(findTestObject('CMS/Generate_XML_Page_object/Order_Type_dropdown'), '6-7', false)

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('CMS/Generate_XML_Page_object/Order_number_textbox'), OrderID)
		
		WebUI.click(findTestObject('CMS/Generate_XML_Page_object/Download_button'))

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}



