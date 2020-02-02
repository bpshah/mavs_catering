package masv_catering.model;

public class UserErrorMsgs {

	private String errorMsg;
	private String usernameError;
	private String passwordError;
	private String firstNameError;
	private String lastNameError;
	private String utaIdError;
	private String phoneError;
	private String emailError;
	private String addressError;

	
	public UserErrorMsgs () {
		this.errorMsg="";
		this.usernameError="";
		this.passwordError="";
		this.firstNameError="";
		this.lastNameError="";
		this.utaIdError="";
		this.phoneError="";
		this.emailError="";
		this.addressError="";

	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg() {
		if (!usernameError.equals("") || !passwordError.equals("") || !firstNameError.equals("") || 
		    !lastNameError.equals("") || !utaIdError.equals("") ||!phoneError.equals("") || !emailError.equals("") || !addressError.equals(""))
		  errorMsg="Please correct the following errors";
	}
	
	
	public String getUsernameError() {
		return usernameError;
	}

	public void setUsernameError(String usernameError) {
		this.usernameError = usernameError;
	}

	public String getPasswordError() {
		return passwordError;
	}

	public void setPasswordError(String passwordError) {
		this.passwordError = passwordError;
	}

	public String getFirstNameError() {
		return firstNameError;
	}

	public void setFirstNameError(String firstNameError) {
		this.firstNameError = firstNameError;
	}

	public String getLastNameError() {
		return lastNameError;
	}

	public void setLastNameError(String lastNameError) {
		this.lastNameError = lastNameError;
	}

	public String getUtaIdError() {
		return utaIdError;
	}

	public void setUtaIdError(String utaIdError) {
		this.utaIdError = utaIdError;
	}

	public String getPhoneError() {
		return phoneError;
	}

	public void setPhoneError(String phoneError) {
		this.phoneError = phoneError;
	}

	public String getEmailError() {
		return emailError;
	}

	public void setEmailError(String emailError) {
		this.emailError = emailError;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAddressError() {
		return addressError;
	}

	public void setAddressError(String addressError) {
		this.addressError = addressError;
	}

}