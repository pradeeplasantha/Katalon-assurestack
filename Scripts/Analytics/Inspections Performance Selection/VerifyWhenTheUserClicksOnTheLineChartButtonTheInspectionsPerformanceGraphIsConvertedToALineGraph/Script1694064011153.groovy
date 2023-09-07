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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Common Testcases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Testcases/VerifyAnalyticsButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack Analytics/Date Text'), 'Date')

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/Calender'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/span_5'))

WebUI.verifyElementText(findTestObject('Page_Assure Stack Analytics/Search Button'), 'Search')

WebUI.verifyElementVisible(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.verifyElementClickable(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.verifyGreaterThan(WebUI.getText(findTestObject('Page_Assure Stack Analytics/label_1')), 0)

WebUI.verifyElementText(findTestObject('Page_Assure Stack Analytics/Inspections Performance Text'), 'INSPECTIONS PERFORMANCE')

WebUI.click(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart Button'))

WebUI.verifyElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart Button'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart Button'))

WebUI.verifyElementClickable(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart Button'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart Button'))

WebUI.waitForElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart'), 0)

WebUI.scrollToElement(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Line Chart'), 0)

def length = 10

def Screenshot = RandomStringUtils.randomAlphanumeric(length)

String relativePath = RunConfiguration.getProjectDir()

WebUI.takeScreenshot(((relativePath + '\\Test Cases Screenshots\\Inspections Performance Section\\Line Chart\\') + Screenshot) + '.png')

WebUI.closeBrowser()

