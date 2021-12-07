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

WebUI.delay(2)

WebUI.click(findTestObject('Login_object/span_Sign In'))

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Login_object/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Login_object/input__password'), GlobalVariable.Login_password_LIVE)

WebUI.click(findTestObject('Login_object/button_Sign In'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), GlobalVariable.ProductNo3)

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_Add to Basket'))

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/HWD_Journey/a_View Basket'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

Post = WebUI.verifyElementVisible(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), FailureHandling.OPTIONAL)

if (Post == true) {
    WebUI.setText(findTestObject('Order_Placement_Journey/HWD_Journey/Basket_input_postcode'), GlobalVariable.Postcode)

    WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/button_Collection'))

    WebUI.waitForPageLoad(0)

    WebUI.delay(3)

    WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/span_Select this store'))

    WebUI.waitForPageLoad(0)

    WebUI.delay(3)

    WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/button_Collection_after_postcode'))

    WebUI.waitForPageLoad(0)

    WebUI.delay(3)
} else {
   

    WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/PLP_to_Cart/button_Collection_after_postcode'))

    WebUI.waitForPageLoad(0)

    WebUI.delay(3)
}

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/HWD_Journey/input__email'), 'value', GlobalVariable.Login_email, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/HWD_Journey/input__firstname'), 'value', 'ECP UK', 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/HWD_Journey/input__secondname'), 'value', 'Test User', 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/HWD_Journey/input__mobileno'), 'value', '9876543212', 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Checkout_objects/CNC/Unselect_POCI_Button'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/Select_POCI_button'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_Address_1'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_Address_1'), 
    'value', '28-28A Fulton Road', 0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_Address_2'), 
    'value', '', 0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_city'), 
    'value', 'Wembley', 0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_country'), 
    'value', 'Brent', 0, FailureHandling.OPTIONAL)

WebUI.verifyElementAttributeValue(findTestObject('Order_Placement_Journey/CNC-POCI_ROCI_Journey/Checkout/CNC_input_postcode'), 
    'value', 'SR53JG', 0, FailureHandling.OPTIONAL)
