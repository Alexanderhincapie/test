package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    private int Hora;
    private String Hour;

    @Given("Hora {int}")
    public void hora(Integer Hora) {
        Hora = 4;

    }
    @When("verificamos que sea Night")
    public void verificamos_que_sea_night() {
        Assertions.assertEquals("Night", Utils.getTimeOfDay(Hora));
    }
    @Then("Obtenemos Night")
    public void obtenemos_night() {

    }
}
