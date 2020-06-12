package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SongsBySinatraParent {

    static WebDriver driver;

    public static void navegar(String url) {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kzgk290/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(url);;
    }



    public static void realizarLoginCorrecto(String usuario, String password) {
        WebElement linkLogin = driver.findElement(By.linkText("log in"));
        linkLogin.click();
        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt = driver.findElement(By.id("password"));
        usernameTxt.sendKeys(usuario);
        passwordTxt.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.cssSelector("[value='Log In']"));
        loginBtn.click();
    }



    public static void validarHomePage() {
        WebElement imgSinatra = driver.findElement(By.cssSelector("[src='/images/sinatra.jpg']"));
        WebElement linkLogin = driver.findElement(By.linkText("log in"));
        if(imgSinatra.isDisplayed() && linkLogin.isDisplayed()){
            System.out.println("Se cargó la página principal");
        }else{
            System.err.println("No se cargó");
            System.exit(-1);
        }
    }



    public static void validarMensajeBienvenida(String mensajeBienvenida) {
        WebElement mensajeBienvenidaElement = driver.findElement(By.id("flash"));
        WebElement linkLogout = driver.findElement(By.cssSelector("[href='/logout']"));
        // HomePage:
        // mensajeBienvenida: id="flash"
        // linkLogout: href="/logout"
        if(mensajeBienvenidaElement.getText().equals(mensajeBienvenida) && linkLogout.isDisplayed()){
            System.out.println("Pasó");
        }else{
            System.err.println("No pasó");
        }
    }

    public static void validateSongsPage() {
        WebElement songsTitle = driver.findElement(By.cssSelector("section h1"));
        String currentUrl = driver.getCurrentUrl();
        WebElement songsLink = driver.findElement(By.cssSelector("[href='/songs']"));
        String currentClass = songsLink.getAttribute("class");
        List<WebElement> listaCanciones = driver.findElements(By.cssSelector("#songs li"));

        if(songsTitle.isDisplayed()  &&
                currentUrl.endsWith("songs") &&
                currentClass.equals("current") &&
                listaCanciones.size() > 0) {
            System.out.println("Si estoy en la pagina de songs");
        }
        else {
            System.out.println("No estoy en la pagina de songs.");
            cerrarBrowser();

            System.exit(-1);
        }
    }

    public static void cerrarBrowser() {
        driver.quit();
    }
}
