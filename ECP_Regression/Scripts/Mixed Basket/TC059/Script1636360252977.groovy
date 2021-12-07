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

WebUI.sendKeys(findTestObject('Product_Details_Objects/input_search_box'), GlobalVariable.ProductNo)

WebUI.click(findTestObject('Product_Details_Objects/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Add to Basket'))

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Global_objects/Basket_icon'))

WebUI.click(findTestObject('Global_objects/Basket_icon_View_Basket'))

WebUI.delay(2)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('My Basket - 1 item', false)

WebUI.click(findTestObject('Global_objects/Basket_icon'))

WebUI.click(findTestObject('Global_objects/Basket_Icon_Checkout'))

WebUI.delay(2)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('My Basket - 1 item', false)

