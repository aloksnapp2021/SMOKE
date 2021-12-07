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

WebUI.callTestCase(findTestCase('Signup/SignUp_Base_Class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Signup_objects/input_firstname'), GlobalVariable.Reg_fname)

WebUI.sendKeys(findTestObject('Signup_objects/input_Surname'), GlobalVariable.Reg_lname)

WebUI.sendKeys(findTestObject('Signup_objects/input_email'), GlobalVariable.Reg_email)

WebUI.sendKeys(findTestObject('Signup_objects/input_Password'), 'test')

WebUI.sendKeys(findTestObject('Signup_objects/input_Confirm_password'), 'test')

WebUI.scrollToElement(findTestObject('Signup_objects/Sigup_page_verify_headingtext'), 5)

WebUI.click(findTestObject('Signup_objects/Complete_registration_submit'))

WebUI.delay(2)

WebUI.verifyTextPresent('Password must contain minimum 8 characters.', true)

