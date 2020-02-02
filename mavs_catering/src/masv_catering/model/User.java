package masv_catering.model;

import java.io.Serializable;

import mavs_catering.data.UserDAO;

public class User implements Serializable {
	
	private static final long serialVersionUID = 2L;

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String role;
	private String utaId;
	private String phone;
	private String email;
	private String address;

	public void setUser(String username,String password, String role,String utaId,String firstName,String lastName,String phone,
			String email,String address) 
	{	
		System.out.println(username+" : "+role+": "+firstName);
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.utaId = utaId;
		this.phone = phone;
		this.email = email;
		this.address = address;

	}
	
	public void setUserIR(String username) 
	{	
		this.username = username;

	}
	
	
	public void updateUser(String password,String utaId,String firstName,String lastName,String phone,
			String email,String address) 
	{	
		System.out.println("first name:edit user "+firstName);
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.utaId = utaId;
		this.phone = phone;
		this.email = email;
		this.address = address;

	}


	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public String getUtaId() {
		return utaId;
	}




	public void setUtaId(String utaId) {
		this.utaId = utaId;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	/************ VALIDATIONS *************/
//	
//	public void validateUser (User user, UserErrorMsgs errorMsgs) {
//		//if (action.equals("register")) {
//		errorMsgs.setUsernameError(validateUsername(user.getUsername()));
//		errorMsgs.setPasswordError(validatePassword(user.getPassword()));
//		errorMsgs.setFirstNameError(validateFirstName(user.getFirstName()));
//		errorMsgs.setLastNameError(validateLastName(user.getLastName()));
//		errorMsgs.setUtaIdError(validateUtaId(user.getUtaId()));
//		errorMsgs.setPhoneError(validatePhone(user.getPhone()));
//		errorMsgs.setEmailError(validateEmail(user.getEmail()));
//		errorMsgs.setAddressError(validateAddress(user.getAddress()));
//		errorMsgs.setErrorMsg();
//		
//	}
//	
//	public void validateSpecificUser(String profile, UserErrorMsgs errorMsgs) {
//		// TODO Auto-generated method stub
//		System.out.println("In validate specific user method");
//		errorMsgs.setUsernameError(validateUsername(profile));
//		System.out.println("error mesg1"+errorMsgs.getUsernameError());
//		errorMsgs.setUsernameError(errorMsgs.getUsernameError());
//
//
//	}
	
//	public void validateUserIR (User user, UserErrorMsgs errorMsgs) {
//		errorMsgs.setUsernameError(validateUsernameInsertRepair(user.getUsername()));
//		errorMsgs.setErrorMsg();
//		
//	}
	
//	private String validatePhone(String phone) {
//		phone = phone.trim();
//		String result="";
//		if (phone.length()!=10)
//			result= "Your Phone must be exactly 10 digits long";
//		else
//			if (!isTextAnInteger(utaId))
//				result="Your Phone must be a number";
//		return result;
//	}
//	
//	private String validateAddress(String address) {
//		address = address.trim();
//		String result="";
//		if (!stringSize(address,3,50))
//			result= "Your Address must between 3 and 50 characters";
//		else
//			if (!address.matches("^[A-Za-z0-9'\\.\\-\\s\\,]+$"))
//				result="Your Address is invalid";
//		
//		return result;
//	}
//
//
//
//	private String validateFirstName (String firstName) {
//		String result="";
//		firstName = firstName.trim(); //trim out trailing and leading spaces
//		
//		if (!stringSize(firstName,2,50))
//			result= "Your First Name must between 2 and 50 characters";
//		else
//			if (!firstName.matches("^[a-zA-Z]+$"))
//				result="Your First Name must only contain alphabets";
//		
//		return result;
//	}
//	
//	private String validateLastName (String lastName) {
//		String result="";
//		lastName = lastName.trim(); //trim out trailing and leading spaces
//		
//		if (!stringSize(lastName,2,50))
//			result= "Your Last Name must between 2 and 50 characters";
//		else
//			if (!lastName.matches("^[a-zA-Z]+$"))
//				result="Your Last Name must only contain alphabets";
//		
//		return result;
//	}
//	
//
////	private String validateUsername(String username) {
////		username = username.trim();
////		String result="";
////		if (!stringSize(username,2,16))
////			result= "Your username must between 2 and 16 digits";
////		else
////			if (!username.matches("^[a-zA-Z0-9]+$"))
////				result="Your username must only contain alphabets and numbers";
////			else
////				if (!UserDAO.uniqueUsername(username))
////					result="Username already in database";
////		return result;				
////	}
////	
//	private String validateUsernameInsertRepair(String username) {
//		username = username.trim();
//		String result="";
//		if (!stringSize(username,2,16))
//			result= "Your username must between 2 and 16 digits";
//		else
//			if (!username.matches("^[a-zA-Z0-9]+$"))
//				result="Your username must only contain alphabets and numbers";
//		return result;				
//	}
//
//	private String validatePassword(String password) {
//		password = password.trim();
//		String result="";
//		if (!stringSize(password,8,16))
//			result= "Your password must between 8 and 16 characters";
//		else 
//			if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@._#$%^&+=]).{8,}$"))
//				result= "Your password must contain at least 1 upper case letter, at least 1 lower case letter and at least 1 special character(@#$%^&+=._)";
//		return result;
//	}
//	
//	private String validateEmail(String email) {
//		email = email.trim();
//		String result="";
//		if (!stringSize(email,7,45))
//			result= "Your email must between 7 and 45 characters";
//		else 
//		   if(!email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(.com|.gov|.net|.org|.edu|.mil)$"))
//			 result= "Your email must contain @ and any one of the following extensions {.com,.gov,.net,.org,.edu,.mil}"; 
//			  
//		return result;
//	}
//	
//	private String validateUtaId(String utaId) {
//		utaId = utaId.trim();
//		String result="";
//		System.out.println("UTA id is : "+utaId);
//		if (utaId.length()!=10)
//			result= "Your UTA ID must be exactly 10 digits long";
//		else
//			if (!isTextAnInteger(utaId))
//				result="Your UTA ID must be a number";
//		return result;
//	}
	

//	/************* VERIFY PASSWORD-USERNAME MATCH FOR LOG-IN ****************/
	public void verifyUser (User user, UserErrorMsgs errorMsgs) {		
		errorMsgs.setUsernameError(verifyUsername(user.getUsername()));
		errorMsgs.setPasswordError(verifyPassword(user.getPassword(),user.getUsername()));	
		errorMsgs.setErrorMsg();
	}
	private String verifyUsername(String username) {
		String result="";
		username = username.trim();
		if (username.isEmpty())
			result = "Username cannot be blank";
		else
			if (UserDAO.uniqueUsername(username))
				result="This username is not registered yet";
		return result;				
	}
//
	private String verifyPassword(String password, String username) {
		String result="";
		if (password.isEmpty())
			result = "Password cannot be blank";
		else
			if (!UserDAO.uniqueUsername(username))//if user exists, get password from DB & check for match
				if (! (UserDAO.getUser(username).getPassword().equals(password)) )
					result="Incorrect password";
		return result;	
	}
//	
//	
//	/************* AUXILIARY FUNCTIONS *************/
//	
//	private boolean stringSize(String string, int min, int max) {
//		return string.length()>=min && string.length()<=max;
//	}
//	private boolean isTextAnInteger (String string) {
//        boolean result;
//		try
//        {
//            Long.parseLong(string);
//            result=true;
//        } 
//        catch (NumberFormatException e) 
//        {
//            result=false;
//        }
//		return result;
//	}	
//	
}
