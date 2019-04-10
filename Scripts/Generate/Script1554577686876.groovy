import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger log = new KeywordLogger()

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

String docNo = CustomKeywords.'utility.randomNumber.rendomNo'(8)

WebUI.setText(findTestObject('Generate/Enter Document Number'), docNo)

WebUI.delay(1)

CustomKeywords.'utility.WriteToExcel.Sd'(docNo, 1, 0)

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

CustomKeywords.'utility.WriteToExcel.Sd'(ewayBillNo, 1, 1)

String EwayBillDate = WebUI.getText(findTestObject('Generate/Eway Bill date'))

CustomKeywords.'utility.WriteToExcel.Sd'(EwayBillDate, 1, 2)

String EwayValidityDate = WebUI.getText(findTestObject('Generate/Eway bill Validity date'))

CustomKeywords.'utility.WriteToExcel.Sd'(EwayValidityDate, 1, 3)

String EwayBillStatus = WebUI.getText(findTestObject('Generate/Eway Bill Status'))

WebUI.verifyMatch(EwayBillStatus, 'ACTIVE', true)

CustomKeywords.'utility.WriteToExcel.Sd'(EwayBillStatus, 1, 4)

WebUI.click(findTestObject('Generate/Generate Another button'))

//----------------------------------------Active Invalid------------------------------------
WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Generate/Select Transaction Type'), 'number:1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Sub Supply Type'), 'number:1', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Generate/Enter Sub-supply type Description'), 'SubSupplyDescription')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Generate/Select Document Type'), 'string:INV', true)

WebUI.delay(1)

String docnoo = CustomKeywords.'utility.randomNumber.rendomNo'(8)

WebUI.setText(findTestObject('Generate/Enter Document Number'), docnoo)

WebUI.delay(1)

CustomKeywords.'utility.WriteToExcel.Sd'(docnoo, 2, 0)

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

WebUI.setText(findTestObject('Generate/Enter Transporter ID'), '05AAAAU1183B1Z0')

WebUI.delay(1)

WebUI.click(findTestObject('Generate/Sumbit Button'))

WebUI.delay(5)

String MsgGenn = WebUI.getText(findTestObject('Generate/Message for not active'))

WebUI.verifyMatch(MsgGenn, 'Generated Successfully', true)

WebUI.delay(1)

WebUI.click(findTestObject('Generate/Msg_GSTIN is valid'))
WebUI.delay(1)

String ewayBillNoo = WebUI.getText(findTestObject('Generate/EwayBill number - Active Invalid'))
log.logInfo('ewayBillNoo:'+ewayBillNoo)


CustomKeywords.'utility.WriteToExcel.Sd'(ewayBillNoo, 2, 1)

WebUI.delay(1)

String EwayBillDatee = WebUI.getText(findTestObject('Generate/EWB Date - Active Invalid'))

CustomKeywords.'utility.WriteToExcel.Sd'(EwayBillDatee, 2, 2)

WebUI.delay(1)

String EwayBillStatuss = WebUI.getText(findTestObject('Generate/Status - Active not yet valid'))

WebUI.verifyMatch(EwayBillStatuss, 'ACTIVE NOT YET VALID', true)

CustomKeywords.'utility.WriteToExcel.Sd'(EwayBillStatuss, 2, 4)

