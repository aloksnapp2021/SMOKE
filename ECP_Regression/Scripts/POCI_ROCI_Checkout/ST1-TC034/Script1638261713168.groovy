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

        WebUI.sendKeys(findTestObject('CMS/Generate_XML_Page_object/Order_number_textbox'), '113-09879487589743544')

        WebUI.click(findTestObject('CMS/Generate_XML_Page_object/Download_button'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementPresent(findTestObject('CMS/Generate_XML_Page_object/Detail_not_exist_validation'), 0)

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}



