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

WebUI.callTestCase(findTestCase('Base_Class_LIVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_objects/Newsletter/Newsletter_link_footer'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Homepage_objects/Newsletter/First_name'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Homepage_objects/Newsletter/Last_name'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Homepage_objects/Newsletter/input_email'), GlobalVariable.Reg_email)

WebUI.check(findTestObject('Homepage_objects/Newsletter/Checkbox_1'))

WebUI.check(findTestObject('Homepage_objects/Newsletter/Checkbox_2'))

WebUI.click(findTestObject('Homepage_objects/Newsletter/Submit_button_LIVE'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Homepage_objects/Newsletter/Newsletter_success_popup_message'), 0)

