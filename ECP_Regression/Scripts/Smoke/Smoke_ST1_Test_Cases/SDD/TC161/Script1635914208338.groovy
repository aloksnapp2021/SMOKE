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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Homepage_objects/Home_only/input_searchbar'), GlobalVariable.SDDProduct)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Basket_objects/Cart_postcode_objects/input_postcode'), GlobalVariable.Postcode3)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delivery'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 5)

WebUI.click(findTestObject('Basket_objects/Cart_postcode_objects/button_UK Delv_after_post_code'))

WebUI.delay(4)

WebUI.waitForPageLoad(5)

WebUI.verifyElementNotPresent(findTestObject('Checkout_objects/Page_Checkout/SDD'), 0)

