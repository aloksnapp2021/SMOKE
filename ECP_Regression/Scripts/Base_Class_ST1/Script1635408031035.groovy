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

switch (GlobalVariable.Instance) {
    case 'ST1':
    case 'LIVE':
        //These test cases can only be executed on lower instances as we are placing order.
        //LIVE URL is not used as the set of test cases for lower instances are different from other.
        WebDriver driver = DriverFactory.getWebDriver()

        driver.get('https://admin:g21Rlq7I0EvGjf@lte-uat.ecpplatform.com/')

        break
    case 'ST2':
        WebDriver driver = DriverFactory.getWebDriver()

        driver.get('https://admin:R4Z4bnhvElBqXB@st2-ecp.ecpplatform.com/')

        break
    case 'ST3':
        WebDriver driver = DriverFactory.getWebDriver()

        driver.get('https://admin:d0we0JQQKL6UUL@st3-ecp.ecpplatform.com/')

        break
    case 'ST4':
        WebDriver driver = DriverFactory.getWebDriver()

        driver.get('https://admin:d0we0JQQKL6UUL@st4-ecp.ecpplatform.com/')

        break
    case 'DR':
        WebUI.navigateToUrl(GlobalVariable.DR_URL)

       break
    default:
        println('Instance specified is not in the list. Please check the script')}

WebUI.waitForPageLoad(0)

//WebUI.click(findTestObject('Global_objects/Popup_close_ST1'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

WebUI.delay(1)

