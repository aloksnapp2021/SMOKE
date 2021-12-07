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

//Validating Top Trending section is visible
WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/Top Trending Section'), 0)

//Validating Latest Offers section is visible
WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/span_Latest Offers'), 0)

WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/Latest_Offer_Section'), 0)

//Viewing a product PDP
WebUI.click(findTestObject('Homepage_objects/Home_only/a_Batteries'))

WebUI.click(findTestObject('Product_Listing_Object/3BO Product Title'))

WebUI.click(findTestObject('Homepage_objects/Home_only/home_logo'))

//Validating Recently viewd section and Recently viewed product is visible at home page
WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/Recently Viewed Items Section'), 0)

WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/Recently Viewd Product'), 0)

//Validating What our customers think is visible at home page
WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/What our Customers think Section'), 0)

//Validating Why use anyone else is visible at home page
WebUI.waitForElementVisible(findTestObject('Homepage_objects/Home_only/Why use anyone else'), 0)

