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
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.DesiredCapabilities
import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


String apk_path = RunConfiguration.getProjectDir() + "/Data Files/sauce-labs.2.7.1.apk"
DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability("platformName", GlobalVariable.platform_name)
capabilities.setCapability("appium:automationName", GlobalVariable.automation_name)
capabilities.setCapability("appium:deviceName", GlobalVariable.device_name)
capabilities.setCapability("appium:app", apk_path)
capabilities.setCapability("appium:appPackage", GlobalVariable.app_package)
capabilities.setCapability("appium:appActivity", GlobalVariable.app_activity)
capabilities.setCapability("appium:noReset", true)
capabilities.setCapability("appium:adbExecTimeout", 60000)

def tap_standard_user = findTestObject('Object Repository/Page_Login/Tap_standard_user')
def btn_login = findTestObject('Object Repository/Page_Login/Page_login_Btn_Login')
def label_products = findTestObject('Object Repository/Product_page/Label PRODUCTS')


int delay_time = 30

URL url = new URL(GlobalVariable.appium_url_server)
AndroidDriver driver = new AndroidDriver(url, capabilities)
MobileDriverFactory.setDriver(driver)


Mobile.waitForElementPresent(tap_standard_user, delay_time)
Mobile.tap(tap_standard_user,delay_time)
Mobile.tap(btn_login, delay_time)
Mobile.waitForElementPresent(label_products, delay_time)
Mobile.verifyElementExist(label_products, delay_time)
Mobile.verifyElementText(label_products, "PRODUCTS")
// add product
def label_product_backpack = findTestObject('Object Repository/Product_page/Label Product Backpack')
def label_product_bike_light = findTestObject('Object Repository/Product_page/Label Product Bike Light')
def btn_add_to_card_backpak = findTestObject('Object Repository/Product_page/Btn ADD TO CART backpak')
def btn_add_to_card_Bike_Light=findTestObject('Object Repository/Product_page/Btn ADD TO CART Bike Light')

Mobile.verifyElementText(label_product_backpack, 'Sauce Labs Backpack')
Mobile.verifyElementText(label_product_bike_light, 'Sauce Labs Bike Light')
Mobile.tap(btn_add_to_card_backpak,delay_time)
Mobile.tap(btn_add_to_card_Bike_Light,delay_time)
def keranjang = findTestObject('Object Repository/Product_page/View Cart Product')
Mobile.tap(keranjang,delay_time)
Mobile.verifyElementExist(keranjang, delay_time, FailureHandling.STOP_ON_FAILURE)
Mobile.closeApplication()
