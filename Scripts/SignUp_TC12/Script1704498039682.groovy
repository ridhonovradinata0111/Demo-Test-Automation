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

WebUI.navigateToUrl('https://www.jotform.com/')

WebUI.click(findTestObject('Object Repository/Page_Free Online Form Builder  Form Creator_1350da/a_Sign Up for Free'))

WebUI.click(findTestObject('Object Repository/Page_Free Online Form Builder  Form Creator_1350da/button_Sign up with Email'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Free Online Form Builder  Form Creator_1350da/a_Terms of Service'))

WebUI.click(findTestObject('Object Repository/Page_Free Online Form Builder  Form Creator_1350da/a_Terms of Service'))

WebUI.switchToWindowTitle('Jotform Terms of Use')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jotform Terms of Use/h1_Terms of Use'), 0)

WebUI.closeBrowser()

