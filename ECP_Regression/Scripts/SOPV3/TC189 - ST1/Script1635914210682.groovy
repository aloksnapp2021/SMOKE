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
import java.lang.String as String
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Base_Class_SOPV3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

switch (GlobalVariable.SOPv3_Instance) {
	
	case 'ST1':
	case 'ST2':
	case 'ST3':
	case 'ST4':
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/Website_dropdown'))
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Dashboard/ECP_UK_website'))
	
	WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/Order_sort_latest_ontop'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/Order_sort_latest_ontop'))
	
	WebUI.click(findTestObject('SOPV3/Order Processing/ECP_UK_Orders_page/order_view_icon'))
	
	WebUI.delay(3)
	
	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Order_detail/a_Detail_tab'))
	
	WebUI.delay(3)
	
	WebDriver Driver = DriverFactory.getWebDriver()
	
	if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[2]'))) {
		WebUI.scrollToElement(findTestObject('SOPV3/Order Processing/Order_detail/Item_check_1'), 5)
	
		Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[2]')).click()
	
		WebUI.delay(1)
	}
	
	if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[4]'))) {
		Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[4]')).click()
	
		WebUI.delay(1)
	}
	
	if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[6]'))) {
		Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[6]')).click()
	
		WebUI.delay(1)
	}
	
	if (Driver.findElements(By.xpath('(//a[@class="lineconfirm"])[8]'))) {
		Driver.findElement(By.xpath('(//a[@class="lineconfirm"])[8]')).click()
	
		WebUI.delay(1)
	}
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('SOPV3/Order Processing/Payment_Processing/button_Move To'), Keys.chord(Keys.PAGE_UP))
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/button_Move To'))
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/select_Move toPAYMENT'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/process_payment_button'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('SOPV3/Order Processing/Payment_Processing/button_Release Payment'))
	
	break
	
	default:
	println('Sorry this test case is of lower environments and cannot be executed on LIVE & DR.')}

