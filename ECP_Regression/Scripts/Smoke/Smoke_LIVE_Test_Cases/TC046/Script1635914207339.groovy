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

WebUI.callTestCase(findTestCase('Smoke/Smoke_LIVE_Test_Cases/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Login_object/span_Sign In'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Login_object/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Login_object/input__password'), GlobalVariable.Login_password_LIVE)

WebUI.click(findTestObject('Login_object/button_Sign In'))

WebUI.delay(2)

WebUI.click(findTestObject('Login_object/span_My Account'))

WebUI.delay(1)

WebUI.click(findTestObject('Myaccount_objects/span_View My Orders'))

WebUI.delay(1)

WebUI.click(findTestObject('Smoke_objects/Account_order_view_link'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Smoke_objects/Account_Print_button'), 5)
