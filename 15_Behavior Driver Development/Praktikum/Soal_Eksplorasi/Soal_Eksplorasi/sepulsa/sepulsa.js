import { Given, When, Then } from "cypress-cucumber-preprocessor/steps";

// Langkah-langkah login
Given("I am on the dashboard page", () => {
  cy.visit("https://sepulsa.com/");
});

When("I click the {string} button", (button) => {
  cy.contains(button).click();
});

Then("I should be on the login page", () => {
  cy.url().should("include", "/login");
});

And("I fill in the email and password fields with valid credentials", () => {
  cy.get("input[name='email']").type("irfanabdillah06@gmail.com");
  cy.get("input[name='password']").type("Keluarga12345");
});

And("I click the {string} button again", (button) => {
  cy.contains(button).click();
});

Then("I should see a confirmation pop-up for successful login", () => {
  cy.get(".confirmation-popup").should("be.visible");
});

// Langkah-langkah pilihan produk
Given("I am on the product selection page", () => {
  cy.visit("https://sepulsa.com/products");
});

When("I select the {string} product", (product) => {
  cy.contains(product).click();
});

Then("I should see options for different {string} denominations", (productType) => {
  if (productType === "pulsa") {
    cy.get(".pulsa-denominations").should("be.visible");
  } else if (productType === "voucher game") {
    cy.get(".voucher-game-denominations").should("be.visible");
  } else if (productType === "e-money") {
    cy.get(".e-money-services").should("be.visible");
  } else {
    cy.get(".all-products").should("be.visible");
  }
});

// Langkah-langkah metode pembayaran
Given("I am on the payment method selection page", () => {
  cy.visit("https://sepulsa.com/payment");
});

When("I enter my phone number", () => {
  cy.get("input[name='phone']").type("081234567890");
});

Then("I should see the available pulsa packages", () => {
  cy.get(".pulsa-packages").should("be.visible");
});

And("I choose a specific pulsa denomination", () => {
  cy.get(".pulsa-denomination").first().click();
});

And("I proceed to the payment page", () => {
  cy.get(".proceed-button").click();
});

Then("I should see options to select a payment method", () => {
  cy.get(".payment-options").should("be.visible");
});

And("I choose {string} as the payment method", (paymentMethod) => {
  cy.contains(paymentMethod).click();
});
