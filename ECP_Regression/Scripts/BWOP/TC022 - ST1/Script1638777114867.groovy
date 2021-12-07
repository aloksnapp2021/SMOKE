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

WebUI.callTestCase(findTestCase('Base_Class_BranchV3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

switch (GlobalVariable.BranchV3_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.verifyElementPresent(findTestObject('BranchV3/Dashboard/Collection_orders_link'), 0)

        WebUI.verifyElementPresent(findTestObject('BranchV3/Dashboard/Ebay_link_menu'), 0)

        WebUI.verifyElementPresent(findTestObject('BranchV3/Dashboard/Euro_car_parts_link'), 0)

        WebUI.verifyElementPresent(findTestObject('BranchV3/Dashboard/FIFM_menu_link'), 0)

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

