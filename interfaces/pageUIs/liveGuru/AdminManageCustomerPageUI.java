package pageUIs.liveGuru;

public class AdminManageCustomerPageUI {
	public static final String COLLUMN_NAME_POSITION = "//span[text()='%s']/ancestor::th/preceding-sibling::th";
	public static final String TEXTBOX_BYCOLUMN_POSITION = "//tr[@class='filter']/th[%s]//input";
	public static final String SEARCH_BUTTON = "//button[@title='Search']";
	public static final String LOADING_ICON = "//p[@id='loading_mask_loader']";
	public static final String POPUP_WINDOW_CLOSE_BUTTON = "//div[@id='message-popup-window']//a[@title='close']";
	public static final String FULLNAME_AND_EMAIL_IN_TABLE = "//td[contains(text(),'%s')]/following-sibling::td[contains(text(),'%s')]";
	                                              //td[contains(text(), 'Automation FC')]/following-sibling::td[contains(text(),'afc403954305@gmail.net')]
	
}
