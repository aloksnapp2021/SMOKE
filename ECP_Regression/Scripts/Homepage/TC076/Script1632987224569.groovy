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

def list = ['Air Filter', 'Spark Plugs', 'Brake Shoes', 'Brake Drums', 'Drive Belts', 'Ignition Coils', 'Fuel Hoses', 'Suspension Arms & Joints'
    , 'Clutch kits', 'Headlights', 'Exhaust Parts', 'Anti Freeze', 'Speakers', 'Shampoo', 'Tyre Foam', 'Paints', 'Automatic Transmission Fluids'
    , 'Blade Fuses', 'Steering Locks', 'Emergency Lighting', 'Swimming Pools', 'Compressor Oil', 'Arc Welders', 'Tool Kits'
    , 'Drum Trolleys', 'Grinders', 'Riveters', 'Impact Wrenches', 'Hose Clamps', 'Barrel Bunds', 'Induction Kits']

WebUI.callTestCase(findTestCase('Base_Class_LIVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Service Parts'))

'Air Filter'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[0]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Air Filters', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Service Parts'))

'Spark Plug'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[1]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Spark Plugs', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Brakes'))

'Brake Shoes'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[2]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Brake Shoes', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Brakes'))

'Brake Drums'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[3]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Brake Drums', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Engine Parts'))

'Car Drive Belt'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[4]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Car Drive Belt', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Engine Parts'))

'Ignition Coil Packs'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[5]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Ignition Coil Packs', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Engine Parts'))

'Fuel Hoses'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[6]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Fuel Hoses', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Suspension  Steering'))

'Suspension Arms & Joints'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[7]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Suspension Arms & Joints', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Transmission'))

'Clutch Kits & Clutch Replacements'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[8]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Clutch Kits & Clutch Replacements', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Electrical  Lighting'))

'Headlights'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[9]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Headlights', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('HeaderS_objects/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Body  Exhaust'))

'Exhaust Parts'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[10]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Exhaust Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('HeaderS_objects/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Lubricants  Fluids'))

'Anti Freeze'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[11]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Anti Freeze', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_In-Car Tech'))

'Speakers'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[12]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Car Speakers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Cleaning'))

'Shampoo'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[13]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Car Shampoo', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Accessories  Car Care'))

'Tyre Foam'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[14]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Tyre Foam', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Maintenance'))

'High Temperature Paint'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[15]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('High Temperature Paint', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Lubricants  Fluids'))

'Automatic Transmission Fluids'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[16]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Automatic Transmission Fluids', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Components'))

'Blade Fuses'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[17]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Car Blade Fuses', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Safety  Security'))

'Steering Locks'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[18]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Steering Wheel Locks', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Winter Essentials'))

'Emergency Lighting'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[19]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Emergency Lighting', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Summer Essentials'))

'Swimming Pools'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[20]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Inflatable Outdoor Garden Swimming Pools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Air Tools  Compressors'))

'Compressor Oil'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[21]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Compressor Oil', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Body Shop  Welding'))

'Arc Welders'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[22]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Arc Welders', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Hand Tools'))

'Tool Kits'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[23]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Tool Kits', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Lifting  Recovery'))

'Drum Trolleys'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[24]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Drum Trolleys', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Machine Shop'))

'Grinders'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[25]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Grinders', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Mechanics Tools'))

'Riveters'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[26]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Riveters', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Power Tools'))

'Impact Wrenches'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[27]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Impact Wrenches', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Vehicle Service'))

'Hose Clamps'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[28]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Hose Clamps', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Workshop'))

'Barrel Bunds'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[29]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Barrel Bunds', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Performance'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Performance_tier_2/a_Performance  Styling'))

'Induction Kits'
WebUI.click(findTestObject('Homepage_objects/Home_only/Menu Links', [('category') : list[30]]), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(1)

WebUI.verifyTextPresent('Performance and Filtration', false, FailureHandling.CONTINUE_ON_FAILURE)

