package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetCarWorkPage;
import com.ilcarro.pages.models.Car;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LetCarWorkSteps {
    @And("User clicks on Let car work link")
    public void click_on_let_car_work_link() {
        new HomePage(driver).clickOnLetCarWorkLink();
    }

    @And("User enters valid car data")
    public void enter_valid_car_data() {
        new LetCarWorkPage(driver)
                .choseData(
                        new Car()
                                .setFuel("Petrol")
                                .setGear("Automatic")
                                .setWd("FWD")
                )
                .enterData(
                        new Car()
                                .setCity("Tel Aviv")
                                .setMake("BMW")
                                .setModel("X6")
                                .setYear("2025")
                                .setSeats("5")
                                .setCarClass("E")
                                .setCarRegistrationNumber("124QTW7R")
                                .setPrice("1000000")
                )
                .downloadPhoto();

    }

    @And("User clicks on Submit button")
    public void click_on_submit_button() {
        new LetCarWorkPage(driver).clickOnSubmitButton();
    }

    @Then("User verifies fields is empty")
    public void verify_fields_is_empty() {
        new LetCarWorkPage(driver).verifyFieldsIsEmpty();
    }
}
