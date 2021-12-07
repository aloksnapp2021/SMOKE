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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.SOP_URL_LIVE)

WebUI.sendKeys(findTestObject('SOPV3/Login/login_Username'), GlobalVariable.Admin_username_LIVE)

WebUI.sendKeys(findTestObject('SOPV3/Login/login_Password'), GlobalVariable.Admin_password_ST1_LIVE)

WebUI.selectOptionByIndex(findTestObject('SOPV3/Login/login_select_site_name'), '1')

WebUI.click(findTestObject('SOPV3/Login/Login_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/Website_dropdown'))

WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/ECP_UK_FIFM'))

