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

WebUI.callTestCase(findTestCase('Base_Class_LIVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.waitForElementVisible(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Service Parts'), 0)

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Service Parts'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Service Parts & Kits', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Brakes'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Brakes', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Engine Parts'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Engine Parts', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Suspension  Steering'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Suspension & Steering', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Transmission'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Transmission Parts', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Cooling  Heating'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Cooling and Heating', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Electrical  Lighting'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Electrics and Car Lighting', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Body  Exhaust'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Body & Exhaust', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Lubricants  Fluids'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Lubricants and Fluids', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_In-Car Tech'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('In-Car Tech', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Cleaning'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Cleaning Products', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Accessories  Car Care'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Accessories', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Maintenance'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Maintenance', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Lubricants  Fluids'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Transmission oils', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Components'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Components', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Safety  Security'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Safety & Security', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Winter Essentials'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Summer Essentials'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Summer Essentials', false)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Air Tools  Compressors'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Air Tools and Compressors', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Body Shop  Welding'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Body Shop & Welding', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Hand Tools'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Hand Tools', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Lifting  Recovery'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Lifting & Recovery Kits', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Machine Shop'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Machine Shop Tools', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Mechanics Tools'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Car Mechanic Tools', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Power Tools'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Power Tools', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Vehicle Service'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Service Tools', false)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Workshop'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Workshop Tools', false)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Performance'))

WebUI.click(findTestObject('Homepage_objects/Tier_2_links/Performance_tier_2/a_Performance  Styling'))

WebUI.delay(1)

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('Performance Car Parts & Styling', false)

