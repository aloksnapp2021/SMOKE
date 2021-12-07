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

WebUI.callTestCase(findTestCase('My Account/My Account (Base class)'), [:], FailureHandling.STOP_ON_FAILURE)

Code_green = WebUI.verifyElementVisible(findTestObject('Order_objects/Status_code_green_refunded'), FailureHandling.OPTIONAL)

if (Code_green == true) {
    WebUI.verifyElementPresent(findTestObject('Order_objects/Status_code_green_refunded'), 0)
}

Code_red = WebUI.verifyElementVisible(findTestObject('Order_objects/Status_code_red_cancelled'), FailureHandling.OPTIONAL)

if (Code_red == true) {
    WebUI.verifyElementPresent(findTestObject('Order_objects/Status_code_red_cancelled'), 0)
}

Code_yellow = WebUI.verifyElementVisible(findTestObject('Order_objects/Status_code_yellow_processing'), FailureHandling.OPTIONAL)

if (Code_yellow == true) {
    WebUI.verifyElementPresent(findTestObject('Order_objects/Status_code_yellow_processing'), 0)
}

