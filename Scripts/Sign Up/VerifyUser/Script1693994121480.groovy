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

WebUI.navigateToUrl('https://assurestack-dev.dxdyhosting.xyz/sign-in')

WebUI.waitForElementPresent(findTestObject('Page_Assure Stack Login/Assure Stack Logo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack Login/Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Assure Stack Login/Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Assure Stack Login/Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Login/Sign Up'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Assure Stack SignUp/Sign Up Text'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack SignUp/Sign Up Text'), 'Sign Up')

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_text'), 'Wathma')

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_text_1'), 'Jayasinghe')

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_email'), 'pradeep+user3@dxdy.tech')

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_text_1_2'), 'Dxdy')

WebUI.click(findTestObject('Object Repository/Page_Assure Stack SignUp/div_sign up                                _8218b6'))

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_sign up_password'), 'Lasa98**')

WebUI.setText(findTestObject('Object Repository/Page_Assure Stack SignUp/input_sign up_password_1'), 'Lasa98**')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Assure Stack SignUp/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack SignUp/input_checkbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack SignUp/a_Accept terms, conditions  privacy policy'), 
    'Accept terms, conditions & privacy policy.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack SignUp/button_Sign Up'), 'Sign Up')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack SignUp/button_Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Assure Stack SignUp/button_Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Assure Stack SignUp/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack SignUp/button_Sign Up'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack SignUp/div_Account is created successfully. We hav_47f634'), 
    'Account is created successfully. We have sent verifcation link to pradeep+user3@dxdy.tech Please verify the account')

WebUI.closeBrowser()

