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

WebUI.callTestCase(findTestCase('Basket/TC003'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Promocode = WebUI.getAttribute(findTestObject('Basket_objects/Random_object/Promo_code_fetch_from_header'), 'innerHTML')

println(Promocode)

WebUI.click(findTestObject('Basket_objects/Random_object/Promo_code_Remove_button'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Basket_objects/Random_object/input_Promo_code'), Promocode)

WebUI.click(findTestObject('Basket_objects/Random_object/Promo_code_submit'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Basket_objects/Random_object/Promocode_success_bar'), 5)

