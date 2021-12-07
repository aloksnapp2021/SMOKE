import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Sign In/Login_Base_Class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Login_object/input__email'), GlobalVariable.Login_email)

WebUI.sendKeys(findTestObject('Login_object/input__password'), GlobalVariable.Login_password_LIVE)

WebUI.click(findTestObject('Login_object/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Login_object/span_My Account'))

WebUI.delay(1)

URL_1 = WebUI.getUrl()

WebUI.closeBrowser()

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Sign In/Login_Base_Class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

URL_2 = WebUI.getUrl()

WebUI.delay(1)

WebUI.verifyNotMatch(URL_1, URL_2, false)

