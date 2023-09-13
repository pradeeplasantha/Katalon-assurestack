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
import java.nio.file.*
import java.io.File as File

WebUI.callTestCase(findTestCase('Common Testcases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Testcases/VerifyAnalyticsButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assure Stack Analytics/Date Text'), 'Date')

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/Calender'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/span_1'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Next Month Button'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/span_30'))

WebUI.verifyElementText(findTestObject('Page_Assure Stack Analytics/Prepared By Text'), 'Prepared By')

WebUI.click(findTestObject('Filter Selection/Prepared By Selection'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Prepared By Pradeep Lasantha'))

WebUI.verifyElementText(findTestObject('Page_Assure Stack Analytics/Search Button'), 'Search')

WebUI.verifyElementVisible(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.verifyElementClickable(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Search Button'))

WebUI.verifyGreaterThan(WebUI.getText(findTestObject('Page_Assure Stack Analytics/TOTAL AUDITS CONDUCTED')), 0)

String relativePath = RunConfiguration.getProjectDir()

String folderPath = relativePath + '\\Test Cases Screenshots\\Prepared By Filter'

File folder = new File(folderPath)

if (folder.exists() && folder.isDirectory()) {
    File[] files = folder.listFiles()

    for (File file : files) {
        if (file.isFile() && file.getName().toLowerCase().endsWith('.png')) {
            file.delete()

            println("Deleted PNG file: $file.name")
        }
    }
} else {
    println('Folder does not exist or is not a directory.')
}

WebUI.takeScreenshot(relativePath + '\\Test Cases Screenshots\\Prepared By Filter\\Prepared_By_Filter.png')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart Button'), 
    GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart Button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart Button'))

WebUI.click(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart'), 
    GlobalVariable.TimeOut)

WebUI.scrollToElement(findTestObject('Page_Assure Stack Analytics/Audits Conducted Bar Chart'), GlobalVariable.TimeOut)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assure Stack Analytics/Audits Conducted Bar Chart'), GlobalVariable.TimeOut)

WebUI.takeScreenshot(relativePath + '\\Test Cases Screenshots\\Prepared By Filter\\Audits_Conducted_Bar_Chart.png')

WebUI.verifyElementText(findTestObject('Page_Assure Stack Analytics/Inspections Performance Text'), 'INSPECTIONS PERFORMANCE')

WebUI.verifyElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart Button'), GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart Button'))

WebUI.verifyElementClickable(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart Button'))

WebUI.click(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart Button'))

WebUI.waitForElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart'), GlobalVariable.TimeOut)

WebUI.scrollToElement(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart'), GlobalVariable.TimeOut)

WebUI.verifyElementPresent(findTestObject('Page_Assure Stack Analytics/Inspections Performance Bar Chart'), GlobalVariable.TimeOut)

WebUI.takeScreenshot(relativePath + '\\Test Cases Screenshots\\Prepared By Filter\\Inspections_Performance_Bar_Chart.png')

WebUI.callTestCase(findTestCase('Common Testcases/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

