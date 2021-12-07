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

WebUI.callTestCase(findTestCase('Checkout/TC018'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'GB Mainland', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Isle Of Man', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Northern Ireland', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Isles of Scilly', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Scottish Islands', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Scottish Highlands', 
    false, 5)

WebUI.verifyOptionPresentByLabel(findTestObject('Checkout_objects/Page_Checkout/Int_delivery/select_country'), 'Isle of Wight', 
    false, 5)

