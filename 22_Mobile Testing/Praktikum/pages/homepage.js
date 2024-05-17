import BasePage from "./base.js";

export default class Homepage extends BasePage{
  constructor(driver){
    super(driver);
  }

  async getTitleHomepage(){
    const titleComponent = await this.find(
      '//android.widget.TextView[@text="Android NewLine Learning"]'
    );

    const title = await titleComponent.getAttribute("text");
    return title;
  }
}