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

WebUI.callTestCase(findTestCase('Smoke/Smoke_LIVE_Test_Cases/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), GlobalVariable.REG)

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_objects/REG_Entered_Menu_Links/a_Spark_Plugs'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/a_Add to Basket'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/PLP_cart_minicart/cart_popup_View Basket'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Basket_objects/Cart_qty_box/Cart_qty_box'))

WebUI.verifyElementPresent(findTestObject('Product_Details_Objects/PDP/Quantity_4'), 5)

WebUI.verifyElementNotPresent(findTestObject('Product_Details_Objects/PDP/Quantity_21'), 5)
