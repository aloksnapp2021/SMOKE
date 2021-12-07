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
import java.lang.String as String
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Base_Class_SOPV3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

switch (GlobalVariable.SOPv3_Instance) {
    case 'ST1':
    case 'ST2':
    case 'ST3':
    case 'ST4':
        WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/Website_dropdown'))

        WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/ECP_UK_website'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/Order_sort_latest_ontop'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/Order_sort_latest_ontop'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/order_view_icon'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/a_Detail_tab'))

        WebUI.delay(2)

        WebDriver Driver = DriverFactory.getWebDriver()

        if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[2]'))) {
            WebUI.scrollToElement(findTestObject('SOPV3/Order Processing/Order_detail/Item_check_1'), 5)

            Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[2]')).click()

            WebUI.delay(1)
        }
        
        if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[3]'))) {
            Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[3]')).click()

            WebUI.delay(1)
        }
        
        if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[4]'))) {
            Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[4]')).click()

            WebUI.delay(1)
        }
        
        if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[5]'))) {
            Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[5]')).click()

            WebUI.delay(1)
        }
        
        WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.HOME))

        WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/button_Move To'))

        WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/select_Move toPAYMENT'))

        WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/process_payment_button'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/button_Release Payment'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Return to Order'))

        WebUI.waitForPageLoad(0)

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Return'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Checkbox Product Return'))

        WebUI.delay(1)

        WebUI.selectOptionByIndex(findTestObject('SOPV3/Order Processing/Order_detail/Select Reason'), 8)

        WebUI.delay(1)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Complete'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Received'))

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Receive The Product'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Return_success_popup_close'))

        WebUI.delay(2)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Refund'))

        WebUI.delay(1)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Radio Product Select For Refund'))

        WebUI.delay(1)

        Amount = WebUI.getText(findTestObject('SOPV3/Order Processing/Order_detail/Total Amount Refund'))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('SOPV3/Order Processing/Order_detail/Input Refund Amount'), Amount)

        WebUI.delay(1)

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Refund Complete'))

        WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/Return to Order'))

        WebUI.verifyTextPresent('RETURNED', false)

        break
    default:
        println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

