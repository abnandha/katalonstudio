import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.VerifyMatchKeyword as VerifyMatchKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.xpath.internal.compiler.Keywords as Keywords
import internal.GlobalVariable as GlobalVariable

WebUI.delay(3)

'Click on arrow for changing root business'
WebUI.click(findTestObject('Generate/i_Vijeta Business Solution_fa fa-angle-double-right'))

WebUI.delay(1)

'click on requested busienss'
WebUI.click(findTestObject('Generate/li_Nands Group'))

String changeBusienssMsg = WebUI.getText(findTestObject('Generate/div_Business Changed Successfully'))

WebUI.verifyMatch(changeBusienssMsg, 'Business Changed Successfully.', true)

WebUI.click(findTestObject('Generate/div_Business Changed Successfully'))

WebUI.delay(1)

WebUI.click(findTestObject('Generate/i_Nands Group_fa fa-angle-double-right'))

WebUI.delay(1)

WebUI.click(findTestObject('Generate/li_Nands Business'))

WebUI.delay(1)

WebUI.click(findTestObject('Generate/i_Nands Business_fa fa-angle-double-right'))

WebUI.delay(1)

WebUI.click(findTestObject('Generate/li_Nands_Entity_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Generate/li_Nands Group_1'))

WebUI.click(findTestObject('Generate/Generate Tab'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Generate/Select Transaction Type'), 'number:1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Sub Supply Type'), 'number:1', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Sub-supply type Description'), 'SubSupplyDescription')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Document Type'), 'string:INV', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Document Number'), docNo)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Invoice Type'), 'string:B2B', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Invoice Ref Number'), 'REFINV001')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Supplier address'), 'number:7363', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Recepient address'), 'number:548', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter HSN code'), '88')

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Taxable Value'), '1')

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Quantity'), '1')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select CGST Rate'), 'string:1.50', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select SGST Rate'), 'string:1.50', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Cess Advol'), 'string:3', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Cess Non Advol'), 'number:400', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Distance'), '100')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Trans mode'), 'number:1', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Vehical No'), 'MH02EX3636')

WebUI.delay(1)

WebUI.click(findTestObject('Generate/Sumbit Button'))

WebUI.delay(5)

String MsgGen = WebUI.getText(findTestObject('Generate/Msg Generated Successfully'))

WebUI.verifyMatch(MsgGen, 'Generated Successfully', true)

String ewayBillNo = WebUI.getText(findTestObject('Generate/Eway bill number'))

CustomKeywords.'utility.WriteToExcel.Sd'(ewayBillNo)

