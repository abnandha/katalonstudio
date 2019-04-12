import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Update/View Tab'))

WebUI.delay(2)

String EwayBillNo = CustomKeywords.'utility.ReadFromExcel.Read'(0, 2, 1)

KeywordUtil.logInfo('EwayBillNo:' + EwayBillNo)

WebUI.delay(1)

WebUI.click(findTestObject('Update/Enter EwayBill No. in Filter'))

WebUI.delay(2)

WebUI.setText(findTestObject('Update/Enter EwayBill No. in Filter'), EwayBillNo)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Update/Enter EwayBill No. in Filter'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Update/Checkbox againts eway bill'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)
WebUI.click(findTestObject('Update/Update Part B button'))

WebUI.delay(1)

WebUI.click(findTestObject('Update/Select Mode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Update/Enter From Place'), 'Mumbai')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Update/Select From State'), 'string:27', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Update/Enter Vehical No'), 'MH04EX1020')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Update/Select Reason'), 'number:1', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Update/Enter Remarks'), 'Internal Testing')

WebUI.delay(2)

WebUI.click(findTestObject('Update/Update Button'))

WebUI.delay(1)

String EwayBill = WebUI.getText(findTestObject('Update/EwayBill No'))
KeywordUtil.logInfo('Ewaybill : '+EwayBill)
WebUI.delay(1)

String EwayBillValiDate = WebUI.getText(findTestObject('Update/EwayBill Validity Date'))

KeywordUtil.logInfo('EwaybillDate: '+EwayBillValiDate)

CustomKeywords.'utility.WriteToExcel.Sd'(EwayBillValiDate, 0, 2, 3)

WebUI.delay(1)

WebUI.click(findTestObject('Update/Ok Button'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Update/BACK Button'))


WebUI.delay(2)
WebUI.click(findTestObject('Update/Enter EwayBill No. in Filter'))
WebUI.delay(1)

WebUI.setText(findTestObject('Update/Enter EwayBill No. in Filter'), EwayBill)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Update/Enter EwayBill No. in Filter'), Keys.chord(Keys.ENTER))

WebUI.delay(1)
WebUI.scrollToPosition(0, 0)
WebUI.delay(1)


String status = WebUI.getText(findTestObject('Update/Check Status Active'))

WebUI.verifyMatch(status, 'ACTIVE', true)

KeywordUtil.logInfo('Ewaybill Status: '+status)

CustomKeywords.'utility.WriteToExcel.Sd'(status, 0, 2, 4)

WebUI.delay(1)





