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

WebUI.selectOptionByValue(findTestObject('Generate/Select Supplier address'), 'number:7363', 
    true)

WebUI.selectOptionByValue(findTestObject('Generate/Select Recepient address'), 
    'number:548', true)

WebUI.setText(findTestObject('Generate/Enter HSN code'), '88')

WebUI.setText(findTestObject('Generate/Enter Taxable Value'), '1')

WebUI.setText(findTestObject('Generate/Enter Quantity'), '1')

WebUI.selectOptionByValue(findTestObject('Generate/Select CGST Rate'), 
    'string:1.50', true)

WebUI.selectOptionByValue(findTestObject('Generate/Select SGST Rate'), 
    'string:1.50', true)

WebUI.selectOptionByValue(findTestObject('Generate/Select Cess Advol'), 
    'string:3', true)

WebUI.selectOptionByValue(findTestObject('Generate/Select Cess Non Advol'), 
    'number:400', true)

WebUI.setText(findTestObject('Generate/Enter Distance'), '100')

WebUI.selectOptionByValue(findTestObject('Generate/Select Trans mode'), 
    'number:1', true)

WebUI.setText(findTestObject('Generate/Enter Vehical No'), 'MH02EX3636')

WebUI.click(findTestObject('Generate/Sumbit Button'))

WebUI.click(findTestObject('Generate/Msg Generated Successfully'))

WebUI.click(findTestObject('Generate/Msg Generated Successfully'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/td_ACTIVE'))

WebUI.click(findTestObject('Object Repository/Generate/Page_IRIS-TOPAZ/button_'))

WebUI.closeBrowser()

