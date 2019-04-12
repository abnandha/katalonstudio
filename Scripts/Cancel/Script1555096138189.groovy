import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.refresh()

WebUI.delay(2)

WebUI.navigateToUrl('https://dev.esp.irisgst.com/#/viewEway')

WebUI.delay(1)

String Eway = CustomKeywords.'utility.ReadFromExcel.Read'(0, 3, 1)

KeywordUtil.logInfo('EwayBill: ' + Eway)

WebUI.click(findTestObject('Cancel/Ewb no filter'))

WebUI.delay(2)

WebUI.setText(findTestObject('Cancel/Ewb no filter'), Eway)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Cancel/Ewb no filter'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Cancel/Checkbox'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Cancel/Cancel button on view'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Cancel/Select Reason'), 'number:4', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Cancel/Enter Cancel Remark'), 'Internal Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Cancel/Cancel button'))

WebUI.delay(1)

String ewaybill = WebUI.getText(findTestObject('Cancel/Ewb No'))

KeywordUtil.logInfo('ewaybill: ' + ewaybill)

WebUI.delay(1)

String ewaybillCanceldate = WebUI.getText(findTestObject('Cancel/Cancel Date'))

KeywordUtil.logInfo('ewaybillCanceldate: ' + ewaybillCanceldate)

CustomKeywords.'utility.WriteToExcel.Sd'(ewaybillCanceldate, 0, 3, 3)

WebUI.delay(1)

WebUI.click(findTestObject('Cancel/button_Ok'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Cancel/Back'))

WebUI.delay(2)

WebUI.click(findTestObject('Cancel/ACTIVE NOT YET VALID'))

WebUI.delay(1)

WebUI.click(findTestObject('Cancel/ACTIVE'))

WebUI.delay(2)

WebUI.click(findTestObject('Cancel/Ewb no filter'))

WebUI.delay(2)

WebUI.setText(findTestObject('Cancel/Ewb no filter'), Eway)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Cancel/Ewb no filter'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

String EwaybillStatus = WebUI.getText(findTestObject('Cancel/Cancel Status'))

KeywordUtil.logInfo('EwaybillStatus: ' + EwaybillStatus)

CustomKeywords.'utility.WriteToExcel.Sd'(EwaybillStatus, 0, 3, 4)



