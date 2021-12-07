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

WebUI.callTestCase(findTestCase('Base_Class_BranchV3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

switch (GlobalVariable.BranchV3_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.click(findTestObject('BranchV3/Collection Orders/Collection_order_all_branches_ST1'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('BranchV3/Collection Orders/View_collection_order'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.END))

        WebUI.click(findTestObject('BranchV3/Collection Orders/Order_Return/Return_tab'))

        Return = WebUI.verifyElementVisible(findTestObject('BranchV3/Collection Orders/Order_Return/Checkbox_item_select_for_return'), 
            FailureHandling.OPTIONAL)

        if (Return == true) {
            WebUI.delay(1)

            WebUI.click(findTestObject('BranchV3/Collection Orders/Order_Return/Checkbox_item_select_for_return'))

            WebUI.selectOptionByIndex(findTestObject('BranchV3/Collection Orders/Order_Return/Select_reason_for_return'), 
                '1')

            WebUI.sendKeys(findTestObject('BranchV3/Collection Orders/Order_Return/input_K8_credit_no'), '1234')

            WebUI.selectOptionByIndex(findTestObject('BranchV3/Collection Orders/Order_Return/Select_branch_for_return'), 
                '1')

            WebUI.click(findTestObject('BranchV3/Collection Orders/Order_Return/Button_Complete'))

            WebUI.delay(1)

            WebUI.verifyElementPresent(findTestObject('BranchV3/Collection Orders/Order_Return/Return_success_message'), 
                0)
        }
        
        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

