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

WebUI.click(findTestObject('Object Repository/Page_ Town Square - t1 Mattermost/div_Te'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/button_t2ntruong_CENTER_button_cfc1xsrgytn9_d07a6c'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Hellooooo'), 'Helloooo')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Helloooo'), 'Hellooo')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Hellooo'), 'Helloo')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Helloo'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Hello'), 'Hell')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Hell'), 'Hel')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Hel'), 'He')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_He'), 'H')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_H'), '')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Edit the post_edit_textbox'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_t'), 'Te')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_te'), 'Tes')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_tes'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Test'), 'Test ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Test_1'), 'Test e')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Test e'), 'Test ed')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Test ed'), 'Test edi')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/textarea_Test edi'), 'Test edit')

WebUI.click(findTestObject('Object Repository/Page_Town Square - TeamChuDeNC Mattermost/button_Save_1'))

WebUI.closeBrowser()

