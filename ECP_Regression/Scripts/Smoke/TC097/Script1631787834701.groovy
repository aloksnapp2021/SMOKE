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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), GlobalVariable.REG)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.waitForElementVisible(findTestObject('Basket_objects/Car Parts Page/Change Vehicle Button'), 5)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Brakes'))

WebUI.click(findTestObject('Homepage_objects/Tier_4_links/Brakes/a_Brake Calipers'))

WebUI.waitForElementVisible(findTestObject('Product_Listing_Object/Surcharge/View Detail'), 0)

WebUI.click(findTestObject('Product_Listing_Object/Surcharge/View Detail'))

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Surcharge/Surcharge Text Object'), 5)

