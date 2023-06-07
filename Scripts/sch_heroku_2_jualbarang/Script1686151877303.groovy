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

WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store_Login/input_Email_exampleInputEmail1'), 'dianayuu1234@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store_Login/input_Password_exampleInputPassword1'), 'Jaksel2022')

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store_Login/button_Masuk'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Secondhand Store_Login/profile_icon'), 10)

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/a_Jual'))

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/input_Nama Produk_nm_produk'), 
    'Handuk')

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/input_Harga Produk_harga_produk'), 
    '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), 
    'Pilih Kategori', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/textarea_Handuk Premium'), 
    'Handuk Premium')

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/button_Terbitkan'))

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/button_Ditawar Rp70.000,00_user'))

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store_Login/Page_Secondhand Store/button_Log Out'))

WebUI.closeBrowser()

