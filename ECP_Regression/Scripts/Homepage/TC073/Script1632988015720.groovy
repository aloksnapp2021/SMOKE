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

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Parts', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Batteries'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Battery', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Oil'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Engine Oils', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Wiper Blades'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Wiper Blades', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Bulbs'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Bulbs', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/Winter'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Accessories', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Garage Tools', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Travel  Touring'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Bike Carriers', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Performance'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Car Modification Parts', false)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Clearance'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.verifyTextPresent('Clearance', false)

