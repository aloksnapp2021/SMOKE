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

WebUI.callTestCase(findTestCase('Smoke/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Homepage_objects/Home_only/input_reg'), GlobalVariable.REG_2)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.delay(2)

WebUI.verifyTextPresent('Volkswagen', false)

WebUI.verifyTextPresent('Polo Hatch', false)

WebUI.click(findTestObject('Homepage_objects/MVL/MVL_change_vehicle_button'))

WebUI.selectOptionByValue(findTestObject('Homepage_objects/MVL/Select_make'), 'Volkswagen', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Homepage_objects/MVL/Select_model'), 'Polo Hatch', false)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Homepage_objects/MVL/Select_year'), '2004', false)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Homepage_objects/MVL/Select_Engine'), '1.4', false)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Homepage_objects/MVL/Select_Fuel'), 'Petrol', false)

WebUI.click(findTestObject('Homepage_objects/MVL/Submit_OK_MVL'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyTextPresent('Volkswagen', false)

WebUI.verifyTextPresent('Polo Hatch', false, FailureHandling.STOP_ON_FAILURE)

