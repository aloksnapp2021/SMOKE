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

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_reg'), 'LR53ETT')

WebUI.click(findTestObject('HeaderS_objects/Search_home/input_Reg_submit'))

WebUI.verifyElementPresent(findTestObject('Basket_objects/Car Parts Page/Change Vehicle Button'), 5)

WebUI.sendKeys(findTestObject('HeaderS_objects/Search_home/input_search_box'), '52177099')

WebUI.click(findTestObject('HeaderS_objects/Search_home/Search_submit'))

WebUI.click(findTestObject('Product_Listing_Object/Add to Basket_button'))

WebUI.click(findTestObject('Product_Listing_Object/cart_popup_View Basket'))

WebUI.click(findTestObject('Basket_objects/FIFM/View Fitting Option'))

WebUI.sendKeys(findTestObject('Order_Placement_Journey/FIFM_Journey/input_FIFM_postcode'), 'SR53JG')

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Next'))

//Verifying alert showing to add oil filter, required to purchase oil
WebUI.verifyTextPresent('An Oil Filter must be replaced when changing your Engine Oil. Please add an Oil Filter to proceed.', 
    false)

WebUI.click(findTestObject('Basket_objects/FIFM/Add reqired product'))

WebUI.click(findTestObject('Basket_objects/FIFM/Add to basket in FIFM journey'))

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Next_2'))

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_View details'))

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Select workshop'))

WebUI.click(findTestObject('Order_Placement_Journey/FIFM_Journey/button_Continue'))

