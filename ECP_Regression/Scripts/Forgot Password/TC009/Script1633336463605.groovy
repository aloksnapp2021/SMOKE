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

WebUI.callTestCase(findTestCase('Forgot Password/TC005'), [:], FailureHandling.STOP_ON_FAILURE)
//Code commented as this is based upon the 3 party email verification.
/*
WebUI.scrollToElement(findTestObject('Resetpass_objects/Change_password_heading'), 5)

WebUI.sendKeys(findTestObject('Resetpass_objects/input_Password'), 'Tester')

WebUI.sendKeys(findTestObject('Resetpass_objects/input_Confirm Password'), 'Tester')

WebUI.click(findTestObject('Resetpass_objects/button_Submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Resetpass_objects/Pformat_error'), 5)
*/
