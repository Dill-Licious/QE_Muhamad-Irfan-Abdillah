import { Given, Then, Before, After, When } from "@cucumber/cucumber";
import assert from "assert";

import initDriver from "../../configs/driver.js";
import LoginPage from "../../pages/loginPage.js";
import RegisterPage from "../../pages/registerPage.js";

let driver;
let loginPage;
let registerPage;

Before({ timeout: 6000 * 10000 }, async() =>{
  try{
    driver = await initDriver();
    loginPage = new LoginPage(driver);
    registerPage = new RegisterPage(driver); 
  } catch (error) {
    console.error(error);
  }
});

// Login With Valid Email
Given("I am on the login page", async() => {
  const loginTitle = await loginPage.getTitle();
  assert.equal(loginTitle,"VERSION - V4");
});

When("I input email field with valid credentials", async () => {
  const inputValidEmail = "Dil456@mail.com"
  await loginPage.setEmail(inputValidEmail);
});

Then("I input password field with valid credentials" , async() => {
  const inputValidPass = "123cobatebak";
  await loginPage.setPassword(inputValidPass);
});

Then("I click login button", async () => {
  await loginPage.tapLoginButton();
});

Then("I am on the homepage", { timeout: 10000 }, async() => {
  const homePageTitle = await homepage.getTitleHomepage();
  assert.equal(homePageTitle, "Android NewLine Learning");
});

// LOGIN WITH NEGATIVE SCENARIO
// Login with all fields empty
Then("I should see an error message indicate enter valid email", async() => {
  const errorMessage = await loginPage.validateErrorMessage();
  assert.equal(errorMessage, "Enter Valid Email");
});

// Login with invalid email and password
When("I input email field with invalid data", async () => {
  const inputInValidEmail = "Dil@mail.alta"
  await loginPage.setEmail(inputInValidEmail);
});

Then("I input password field with invalid data" , async() => {
  const inputInValidPass = "capstoneproject";
  await loginPage.setPassword(inputInValidPass);
});

Then("I should see an error message indicate wrong email or password", async() => {
  const invalidEmailAndPass = await loginPage.validateInvalidEmailAndPass();
  assert.equal(invalidEmailAndPass, "Wrong Email or Password");
});


// Register Valid Data
When("I see create account text", async() => {
  const seeCreateAccountText = await loginPage.getCreateAcountText();
  assert.ok(seeCreateAccountText, "Create Account text is visible on the page");
});

Then("I click create account", async() =>{
  await loginPage.tapCreateAccountText();
});

Then("I am on the register page", async() => {
  const createAccountText = await registerPage.getRegisterPageButton();
  assert.ok(createAccountText, "Register button is visible on the page");
});

Then("I input my name with valid credentials", async() => {
  const inputName = "Irfan Abdillah";
  await registerPage.insertName(inputName);
});

Then("I input my email with valid credentials", async() => {
  const inputEmail = "irfan@mail.com";
  await registerPage.insertEmail(inputEmail);
});

Then("I input my password with valid credentials", async() => {
  const inputPassword = "123cobatebak";
  await registerPage.insertPassword(inputPassword);
});

Then("I confirm my password with valid credentials", async() => {
  const inputConfirmPassword = "123cobatebak";
  await registerPage.insertConfirmPassword(inputConfirmPassword);
});

Then("I click register button", async() => {
  await registerPage.tapRegisterButton();
});

Then("I see a pop-up message indicating register success", async () => {
  const successNotificationResourceId = await registerPage.getRegisterSuccessNotification();
  assert.ok(successNotificationResourceId, "Register success notification is visible.");
});


// Register All Fields Empty
Then("I see an error message indicate enter full name first", async() => {
  const errorMessageEmptyFields = await registerPage.validateErrorMessageAllFieldEmpty();
  assert.equal(errorMessageEmptyFields, "Enter Full Name");
});

// Register with wrong format email
Then("I input my email with invalid format", async() => {
  const inputWrongEmail = "irfan%$mail.co.1d";
  await registerPage.insertEmail(inputWrongEmail);
});

Then("I see an error message indicate please enter valid email", async() => {
  const errorMessageInvalidEmail = await registerPage.validateErrorMessageInvalidFormatEmail();
  assert.equal(errorMessageInvalidEmail, "Enter Valid Email")
});

After(async () => {
  await driver.deleteSession();
});