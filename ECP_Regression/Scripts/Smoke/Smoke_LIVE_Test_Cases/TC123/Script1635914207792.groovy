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

WebUI.click(findTestObject('Homepage_objects/Home_only/a_Batteries'))

WebUI.click(findTestObject('Product_Listing_Object/Sorting/Sort Click'))

WebUI.click(findTestObject('Product_Listing_Object/Sorting/Heigh to Low'))

WebUI.delay(5)

Amount_1 = WebUI.getText(findTestObject('Product_Listing_Object/Product Amount_1'))

Amount_final_1 = Amount_1.substring(1, 4)

println(Amount_final_1)

Amount_2 = WebUI.getText(findTestObject('Product_Listing_Object/Product Amount20'))

Amount_final_2 = Amount_2.substring(1, 4)

println(Amount_final_2)

Amount2 = WebUI.getText(findTestObject('Product_Listing_Object/Product Amount20'))

WebUI.verifyGreaterThan(Amount_final_1, Amount_final_2)

