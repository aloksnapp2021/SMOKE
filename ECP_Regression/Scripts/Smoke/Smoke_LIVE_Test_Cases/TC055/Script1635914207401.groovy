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
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Smoke/Smoke_LIVE_Test_Cases/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

for (i = 23; i <= 23; i++) {
    WebUI.scrollToElement(findTestObject('Homepage_objects/Footer_links/footer_xpath', [('footer_link') : findTestData('Footer_links').getValue(
                    1, i)]), 5)

    WebUI.click(findTestObject('Homepage_objects/Footer_links/footer_xpath', [('footer_link') : findTestData('Footer_links').getValue(
                    1, i)]))

    WebUI.delay(2)

    WebUI.verifyTextPresent(findTestData('Footer_links').getValue(2, i), false)

    WebUI.delay(1)

    WebUI.closeBrowser()
}

for (j = 24; j <= 26; j++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl(GlobalVariable.URL_LIVE)

    WebUI.click(findTestObject('Global_objects/Popup_close_LIVE'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Global_objects/button_Accept All Cookies'), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('Homepage_objects/Footer_links/footer_xpath', [('footer_link') : findTestData('Footer_links').getValue(
                    1, j)]), 5)

    WebUI.click(findTestObject('Homepage_objects/Footer_links/footer_xpath', [('footer_link') : findTestData('Footer_links').getValue(
                    1, j)]))

    WebUI.delay(3)

    String Browser_name = DriverFactory.getExecutedBrowser().getName()

    if (((Browser_name == 'CHROME_DRIVER') || (Browser_name == 'EDGE_CHROMIUM_DRIVER')) || (Browser_name == 'FIREFOX_DRIVER')) {
		
        WebUI.switchToWindowIndex(1)
		
		WebUI.verifyTextPresent(findTestData('Footer_links').getValue(2, j), false)
		
		WebUI.delay(2)
		
		WebUI.closeBrowser()
		
    }
	
	else if (Browser_name == 'SAFARI_DRIVER') {
		
		WebUI.closeBrowser()
		
	}
    
    
}

