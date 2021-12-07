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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Admin_URL)

WebUI.sendKeys(findTestObject('Admin/Login/input_username'), GlobalVariable.Admin_username_LIVE)

WebUI.sendKeys(findTestObject('Admin/Login/input_password'), GlobalVariable.Admin_password_ST1_LIVE)

'This code is used because in case of Firefox there is a popup coming on the password field due to which the Submit button is gettin hidden and the script fails.'
String Browser_name = DriverFactory.getExecutedBrowser().getName()

if ((Browser_name == 'CHROME_DRIVER') || (Browser_name == 'EDGE_CHROMIUM_DRIVER')) {
    WebUI.click(findTestObject('Admin/Login/button_sign_in'))
} else if (Browser_name == 'FIREFOX_DRIVER') {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
} else {
    println('Specified browser is not in the list of the script browsers. Please check if-else statements.')
}

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Dashboard/link_Edit_UK'))

WebUI.click(findTestObject('Admin/Edit_page/link_Site_Modules'))

WebUI.delay(2)

WebUI.verifyTextPresent('PAYPALCREDITBRAINTREE', false)

WebUI.delay(2)

