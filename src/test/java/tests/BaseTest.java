package tests;


import factorydriver.DriverFactory;
import factorydriver.DriverManager;
import factorydriver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;

    @BeforeClass
    public void setUp() {
        DriverFactory factory = new DriverFactory();
        driverManager = factory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        System.out.println("Start Driver");
        driverManager.maximize();
        driverManager.setTimeout();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}