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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'Login Url'
WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Assure Stack Login/Assure Stack Text'), GlobalVariable.TimeOut)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Assure Stack Login/Assure Stack Logo'), GlobalVariable.TimeOut)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack Login/Sign In Text'), GlobalVariable.TimeOut)

'Email'
WebUI.setText(findTestObject('Object Repository/Page_Assure Stack Login/Input Email'), '')

'Password'
WebUI.setText(findTestObject('Object Repository/Page_Assure Stack Login/Input Password'), '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack Login/Remember Me Checkbox'), GlobalVariable.TimeOut)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack Login/Remember Me Text'), 'Remember me')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack Login/Login Text'), 'Login')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Assure Stack Login/Login Button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Assure Stack Login/Login Button'))

'Click Login Button'
WebUI.click(findTestObject('Object Repository/Page_Assure Stack Login/Login Button'))

WebUI.verifyElementText(findTestObject('Page_Assure Stack Login/Email Is Required Text'), 'Email is required')

WebUI.verifyElementText(findTestObject('Page_Assure Stack Login/Password Is Required Text'), 'Password is required')

WebUI.closeBrowser()

