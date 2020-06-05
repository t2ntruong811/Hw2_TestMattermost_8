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

for (int i = 0; i < 5; i++){
	switch(i) {
		case 0: 
			WebUI.click(findTestObject('Page_Town Square - t1 Mattermost/div_Te'))
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/svg'))
			
			WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Add a comment_reply_textbox'),
			   'Trường reply chat')
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/input_Help_addCommentButton'))
			break
			s
		case 1:
			WebUI.click(findTestObject('Page_Town Square - t1 Mattermost/div_Te'))
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/svg'))
			
			WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Add a comment_reply_textbox'),
			   'Trà reply chat')
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/input_Help_addCommentButton'))
			break
			
		case 100:
			WebUI.click(findTestObject('Page_Town Square - t1 Mattermost/div_Te'))
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/svg'))
			
			WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Add a comment_reply_textbox'),
			   'Reply chat fail')
			
			WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/input_Help_addCommentButton'))
			break
	}
}

WebUI.closeBrowser()

