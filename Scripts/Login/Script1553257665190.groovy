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

'Open Browser'
WebUI.openBrowser('')

'Hit URL to Browser'
WebUI.navigateToUrl('https://dev.esp.irisgst.com/')

'Maximize the browser tab'
WebUI.maximizeWindow()

'Enter input to user name'
WebUI.setText(findTestObject('Login/input_SIGN UP_name'), 'amit.nandha@irisindia.net')

'Enter input to Password'
WebUI.setEncryptedText(findTestObject('Login/input_Invalid Email_email'), 'RfES2L809yyqtWvN0P2gPg==')

'Click on sumbit button'
WebUI.click(findTestObject('Login/button_SIGN IN'))

'Get toaster message after getting login'
LoginTitle = WebUI.getText(findTestObject('Login/div_Login Successful'))

'Verify the login success message and cofirm login '
WebUI.verifyMatch('LoginTitle', 'Login Successful!', false)

'Close the browser '
WebUI.closeBrowser()

