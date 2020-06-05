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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1612745/1612745 - Sign in default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Town Square - abc Mattermost/button_t2ntruong_style--none sidebar-header_25c4cb'))

WebUI.click(findTestObject('Page_Town Square - abc Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Display'))

for(int i = 0; i < 2; i++){
	switch(i) {
		case 0:
			WebUI.click(findTestObject('Page_Town Square - abc Mattermost/span_Edit'))
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/label_Fixed width centered'))
			
			WebUI.click(findTestObject('Page_Town Square - abc Mattermost/span_Save'))
			break
		case 1:
			WebUI.click(findTestObject('Page_Town Square - abc Mattermost/span_Edit'))
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/label_Full width'))
			
			WebUI.click(findTestObject('Page_Town Square - abc Mattermost/span_Save'))
			break
	}
}



