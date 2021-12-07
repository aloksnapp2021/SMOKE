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
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

switch(GlobalVariable.Instance) {
	
	case 'LIVE':	

	WebUI.navigateToUrl(GlobalVariable.URL_LIVE)
	WebUI.click(findTestObject('Global_objects/Popup_close_LIVE'), FailureHandling.OPTIONAL)	
	
	break;
	
	case 'ST1':
	
	WebDriver driver = DriverFactory.getWebDriver()

	driver.get("https://admin:g21Rlq7I0EvGjf@lte-uat.ecpplatform.com/")
	WebUI.click(findTestObject('Global_objects/Popup_close_ST1'), FailureHandling.OPTIONAL)
	
	break;
	
	default:
	println("Instance specified is not in the list. Please check the script")	
	
}

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

Title = WebUI.getWindowTitle()

WebUI.verifyMatch(Title, 'Euro Car Parts | Car Parts Online & In Store – FREE UK Delivery', false)

