import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('Base_Class_ST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Wiper Blades'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Auto Promo Applied'), 0)

WebUI.click(findTestObject('Product_Listing_Object/Product Title'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Product_Listing_Object/Auto Promo Applied'), 0)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

DiscountedPrice = WebUI.getText(findTestObject('Basket_objects/Cart_qty_box/Discounted Price'))

WebUI.sendKeys(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK Delivery'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Basket_objects/Cart_postcode_objects/a_Change postcode_HWD_link'), 0)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_UK delivery_after_postcode'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/Expand Arrow'))

WebUI.delay(2)

WebUI.verifyTextPresent(DiscountedPrice, false)



