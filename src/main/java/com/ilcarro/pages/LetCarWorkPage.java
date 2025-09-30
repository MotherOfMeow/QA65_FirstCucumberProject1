package com.ilcarro.pages;

import com.ilcarro.pages.models.Car;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCarWorkPage extends BasePage {
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "city")
    WebElement cityField;

    @FindBy(name = "manufacture")
    WebElement makeField;

    @FindBy(name = "model")
    WebElement modelField;

    @FindBy(name = "year")
    WebElement yearField;

    @FindBy(name = "seats")
    WebElement seatsField;

    @FindBy(name = "carClass")
    WebElement carClassField;

    @FindBy(name = "serialNumber")
    WebElement carRegistrationNumberField;

    @FindBy(name = "pricePerDay")
    WebElement priceField;

    public LetCarWorkPage enterData(Car car) {
        type(cityField, car.getCity());
        type(makeField, car.getMake());
        type(modelField, car.getModel());
        type(yearField, car.getYear());
        type(seatsField, car.getSeats());
        type(carClassField, car.getCarClass());
        type(carRegistrationNumberField, car.getCarRegistrationNumber());
        type(priceField, car.getPrice());

        return this;
    }

    @FindBy(name = "fuel")
    WebElement fuelSelector;

    @FindBy(name = "gear")
    WebElement gearSelector;

    @FindBy(name = "wheelsDrive")
    WebElement wdSelector;

    public LetCarWorkPage choseData(Car car) {
        select(fuelSelector, car.getFuel());
        select(gearSelector, car.getGear());
        select(wdSelector, car.getWd());
        return this;
    }

    @FindBy(id = "photo-file")
    WebElement selectPhotoButton;

    public LetCarWorkPage downloadPhoto() {
        moveWithJS(0, 500);
        String filePath = System.getProperty("user.dir") + "/src/test/resources/img/photo_2025-09-30_18-29-45.jpg";
        selectPhotoButton.sendKeys(filePath);

        return this;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/form/button")
    WebElement submitButton;

    public LetCarWorkPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }

    public LetCarWorkPage verifyFieldsIsEmpty() {
        pause(1000);
        String priceValue = priceField.getAttribute("value");
        System.out.println(priceValue);

        Assert.assertTrue(priceValue == null || priceValue.isEmpty());

        return this;
    }
}
