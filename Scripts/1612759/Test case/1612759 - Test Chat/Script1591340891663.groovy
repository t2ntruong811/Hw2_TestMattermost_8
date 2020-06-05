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

for (int i = 0; i < 5; i++)
{
	WebUI.click(findTestObject('Page_Town Square - t1 Mattermost/div_Te'))

	if(i == 0){
		WebUI.setText(findTestObject('Page_Town Square - TeamChuDeNC Mattermost/textarea_Write to Town Square_post_textbox'), 'Trần Nguyễn Ngọc Trường')
	}else if(i == 1){
		WebUI.setText(findTestObject('Page_Town Square - TeamChuDeNC Mattermost/textarea_Write to Town Square_post_textbox'), 'Hà Quang Trọng')
	}else if(i == 2){
		WebUI.setText(findTestObject('Page_Town Square - TeamChuDeNC Mattermost/textarea_Write to Town Square_post_textbox'), 'Lê Hồ Hữu Trí')
	}else if(i == 3){
		WebUI.setText(findTestObject('Page_Town Square - TeamChuDeNC Mattermost/textarea_Write to Town Square_post_textbox'), 'Nguyễn Đức Trà')
	}else if(i == 4){
		WebUI.setText(findTestObject('Page_Town Square - TeamChuDeNC Mattermost/textarea_Write to Town Square_post_textbox'), 'Chủ Đề Nâng Cao')
	}
}

WebUI.closeBrowser()

