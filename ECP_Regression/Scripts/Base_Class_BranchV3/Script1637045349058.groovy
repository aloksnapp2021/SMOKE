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

switch (GlobalVariable.BranchV3_Instance) {
    case 'LIVE':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_LIVE)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    case 'ST1':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_ST1)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    case 'ST2':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_ST2)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    case 'ST3':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_ST3)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    case 'ST4':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_ST4)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    case 'DR':
        WebUI.navigateToUrl(GlobalVariable.Branch_V3_URL_DR)

        WebUI.waitForPageLoad(0)

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('BranchV3/Login/input_username'), GlobalVariable.BranchV3_LIVE_ST1_username)

        break
    default:
        println('Instance specified is not in the list. Please check the script')}

WebUI.sendKeys(findTestObject('BranchV3/Login/input_password'), GlobalVariable.BranchV3_LIVE_ST1_password)

WebUI.click(findTestObject('BranchV3/Login/button_Submit'))

WebUI.waitForPageLoad(0)

WebUI.delay(1)

