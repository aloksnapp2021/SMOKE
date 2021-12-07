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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), '485771070')

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.click(findTestObject('Product_Details_Objects/Add to Basket_button'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.click(findTestObject('Basket_objects/International Delivery/International delivery'))

WebUI.verifyElementPresent(findTestObject('Checkout_objects/Page_Checkout/button_Place Order'), 0)

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/Checkout__email'), 'ecptest@netsolutions.com')

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__firstname'), 'Test')

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__secondname'), 'ECP')

WebUI.sendKeys(findTestObject('Checkout_objects/Page_Checkout/input__mobileno'), '967788654243')

WebUI.click(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'))

WebUI.selectOptionByIndex(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 11)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'))

WebUI.verifyElementNotPresent(findTestObject('Checkout_objects/Page_Checkout/Royal Mail'), 0)

