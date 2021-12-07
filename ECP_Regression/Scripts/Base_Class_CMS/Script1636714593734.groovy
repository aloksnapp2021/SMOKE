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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

switch (GlobalVariable.CMS_Instance) {
	
	case 'LIVE':
		WebUI.navigateToUrl(GlobalVariable.CMS_URL)
		
		WebUI.waitForPageLoad(0)
		
		WebUI.delay(1)
	
		WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_LIVE)
	
		break
	
    case 'ST1':
    	WebUI.navigateToUrl(GlobalVariable.CMS_URL_ST1)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_ST1)

        break
    case 'ST2':
        WebUI.navigateToUrl(GlobalVariable.CMS_URL_ST2)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_ST1)

        break
    case 'ST3':
        WebUI.navigateToUrl(GlobalVariable.CMS_URL_ST3)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_ST1)

        break
    case 'ST4':
        WebUI.navigateToUrl(GlobalVariable.CMS_URL_ST4)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_ST1)

        break
    case 'DR':
        WebUI.navigateToUrl(GlobalVariable.CMS_URL_DR)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('CMS/Login/input_username'), GlobalVariable.CMS_login_username_LIVE)

        break
    default:
        println('Instance specified is not in the list. Please check the script')}

		WebUI.sendKeys(findTestObject('CMS/Login/input_password'), GlobalVariable.CMS_login_password_LIVE)

		WebUI.click(findTestObject('CMS/Login/button_sign_in'))

		WebUI.waitForPageLoad(0)

		WebUI.delay(1)


