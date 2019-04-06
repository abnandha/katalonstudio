import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.esp.irisgst.com/#/generate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_Nands_Entity_1_248001'), 'number:7363', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_Vijeta Filing solution - 05AAAAT2562R1Z3  LARSEN  TOUBRO LIMITED - 33AAACL0140P2ZP  ABC Both - 33ABCDE1234R1ZE'), 
    'number:548', true)

WebUI.setText(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/input__itemHSN1'), '88')

WebUI.setText(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/input__itemTaxableVal1'), '1')

WebUI.setText(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/input_Quantity_itemQuantity1'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_0  005  0125  025  150  250  600  900  1400'), 
    'string:1.50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_0  005  0125  025  150  250  600  900  1400_1'), 
    'string:1.50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_013511121251517202122364960616571728996142160204290'), 
    'string:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_040020762747366840064170'), 
    'number:400', true)

WebUI.setText(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/input__transDistance'), '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/select_--Select--  Road  Rail  Air  Ship'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/input_Vehicle No_vehicleNo'), 'MH02EX3636')

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/button_Submit'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/h4_Generated Successfully'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/h4_Generated Successfully'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/td_ACTIVE'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/button_'))

WebUI.closeBrowser()

