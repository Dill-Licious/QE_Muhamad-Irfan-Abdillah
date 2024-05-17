import BasePage from "./base.js";

export default class LoginPage extends BasePage {
  constructor(driver){
    super(driver);
  }

  async getTitle(){
    const titleComponent = await this.find(
      '//android.widget.TextView[@text="VERSION - V4"]'
    );

    const title = await titleComponent.getAttribute("text");
    return title;
  }

  async getEmailField(){
    const emailFieldComponent = await this.find(
      '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]'
    );

    const emailField = await emailFieldComponent.getAttribute("resource-id");
    return emailField;
  }

  async setEmail(email){
    const emailFieldLocator = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]';
    await this.type(emailFieldLocator, email);
  }

  async getPasswordField(){
    const passwordFieldComponent = await this.find(
      '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextPassword"]'
    );
    const passwordField = await passwordFieldComponent.getAttribute("resource-id");
    return passwordField;
  }

  async setPassword(password){
    const passwordFieldLocator = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextPassword"]';
    await this.type(passwordFieldLocator, password);
  }

  async tapLoginButton() {
    await this.click(
      '//android.widget.Button[@resource-id="com.loginmodule.learning:id/appCompatButtonLogin"]'
    );
  }

  async validateErrorMessage(){
    const errorMessageText = await this.find(
      '//android.widget.TextView[@text="Enter Valid Email"]'
    );
    const errorMessage = await errorMessageText.getAttribute("text");
    return errorMessage;
  }
  
  async validateInvalidEmailAndPass(){
    const errorMessageInvalidEmailAndPass = await this.find(
      '//android.widget.TextView[@resource-id="com.loginmodule.learning:id/snackbar_text"]'
    );
    const invalidEmailAndPass = await errorMessageInvalidEmailAndPass.getAttribute("resource-id");
    return invalidEmailAndPass;
  }


  async getCreateAcountText(){
    const createAccountText = await this.find(
      '//android.widget.TextView[@resource-id="com.loginmodule.learning:id/textViewLinkRegister"]'
    );

    const validateCreateAccountText = createAccountText.getAttribute("resource-id");
    return validateCreateAccountText;
  }

  //tap create account
}