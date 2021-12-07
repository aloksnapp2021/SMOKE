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

WebUI.callTestCase(findTestCase('Smoke/TC016'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.Reset_email_client)

WebUI.waitForElementVisible(findTestObject('Resetpass_objects/email_input'), 0)

WebUI.sendKeys(findTestObject('Resetpass_objects/email_input'), GlobalVariable.Forgot_email)

WebUI.sendKeys(findTestObject('Resetpass_objects/email_input'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Resetpass_objects/a_Password reset link'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Resetpass_objects/input_Password'), 0)

WebUI.sendKeys(findTestObject('Resetpass_objects/input_Password'), GlobalVariable.Reset_password)

WebUI.sendKeys(findTestObject('Resetpass_objects/input_Confirm Password'), 'Tester@123123123')

WebUI.click(findTestObject('Resetpass_objects/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Resetpass_objects/Mismatchingpass_error'), 0)

WebUI.verifyElementPresent(findTestObject('Resetpass_objects/Mismatchingpass_error'), 0)

