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

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Service Parts'))

WebUI.verifyTextPresent('Regular Service', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Major Service', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Brakes'))

WebUI.verifyTextPresent('Brake Friction', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Brake Hydraulics', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Engine Parts'))

WebUI.verifyTextPresent('Engine Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Belts Chains & Tensioners', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Filters', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Ignition', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Fuel & Engine Management', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Turbos', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Suspension  Steering'))

WebUI.verifyTextPresent('Suspension', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Steering', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Transmission'))

WebUI.verifyTextPresent('Clutch & Associated Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Transmission Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Cooling  Heating'))

WebUI.verifyTextPresent('Cooling', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Air Conditioning', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Heating', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Electrical  Lighting'))

WebUI.verifyTextPresent('Electrical', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Lighting', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Ignition', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Body  Exhaust'))

WebUI.verifyTextPresent('Body Shop', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Wheel and Tyre Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Interior', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Exhausts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cables', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Wipers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Car_parts_tier_2/a_Lubricants  Fluids'))

WebUI.verifyTextPresent('Lubricants & Fluids', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Car Parts'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_In-Car Tech'))

WebUI.verifyTextPresent('Satellite Navigation & GPS', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('In Car Entertainment', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Mobile Phone & Bluetooth Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Parking Aids', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Alarms Immobilisers & Trackers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Cleaning'))

WebUI.verifyTextPresent('Exterior Cleaning', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Interior Cleaners', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Wash Cloths & Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Pressure Washers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cleaning', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Professional Finishing Products', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Accessories  Car Care'))

WebUI.verifyTextPresent('Emergency & Breakdown', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Lighting Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('In Car Power Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Baby & Child', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Interior Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Exterior Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Car Maintenance'))

WebUI.verifyTextPresent('Air Conditioning Maintenance', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Universal Wiper Blades', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Battery Maintenance', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Body Repair', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Paints & Primers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Bulbs', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Lubricants  Fluids'))

WebUI.verifyTextPresent('Additives', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Fluid Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Engine Oil', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Antifreeze & Screenwash', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Screen Care', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Transmission Oils', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Components'))

WebUI.verifyTextPresent('Electrical Connectors & Cables', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Fuses & Relays', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Hose Pipes, Parts & Pumps', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Nuts, Bolts, Clips and Ties', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Safety  Security'))

WebUI.verifyTextPresent('Security Locks', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Personal Protective Equipment', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Winter Essentials'))

WebUI.verifyTextPresent('Anti Freeze', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Screenwash & Frost Protection', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Tyre', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Winter Safety', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Winter Maintenance', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Accessories  Car Care'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Accessories_tier_2/a_Summer Essentials'))

WebUI.verifyTextPresent('Car Cleaning', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Car Accessories & Car Care', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Traveling Abroad Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Travel, Touring & Leisure', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('On The Move', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(25)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Air Tools  Compressors'))

WebUI.verifyTextPresent('Compressors', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Air Power Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Body Shop  Welding'))

WebUI.verifyTextPresent('Welding & Cutting', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Body Shop', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Chassis Alignment', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Hand Tools'))

WebUI.verifyTextPresent('General Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Workshop Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Engineering Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Construction & Craft', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Lifting  Recovery'))

WebUI.verifyTextPresent('Jacking & Lifting', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Recovery & Towing', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Material Handling', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Machine Shop'))

WebUI.verifyTextPresent('Bench Grinders & Sanders', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Machine Shop', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Power Saws', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Vices', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Mechanics Tools'))

WebUI.verifyTextPresent('Socketry', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Wrenches', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Torque Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('General Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Electrical', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Body Shop & Sheet Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Power Tools'))

WebUI.verifyTextPresent('Cordless Power Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Electric Power Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Power Tool Accessories', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Soldering', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Vehicle Service'))

WebUI.verifyTextPresent('Brake Service Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cooling System Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Diagnostic Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('General Engine Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Hub & Suspension Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Oil Service Tools', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Tools'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Tools_Tier_2/a_Workshop'))

WebUI.verifyTextPresent('Car Care', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cleaning', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Consumables', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Garage & Workshop', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Lighting & Power', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Lubrication', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Homepage_objects/Home_only/a_Performance'))

WebUI.mouseOver(findTestObject('Homepage_objects/Tier_2_links/Performance_tier_2/a_Performance  Styling'))

WebUI.verifyTextPresent('Performance Filtration', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Performance Braking', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Performance Suspension', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Performance Steering', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Performance Exhaust Systems & Parts', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Performance Car Lighting', false, FailureHandling.CONTINUE_ON_FAILURE)

