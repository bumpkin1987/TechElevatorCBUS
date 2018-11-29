///<reference path="../jquery-3.1.1.js" />
 //<reference path="../jquery.validate.js" />

$(document).ready(function () {

    // Email address - required
    // Email address - .gov only (BONUS)
    // Password - required, length 8 or more
    // ConfirmPassword
	
////////////////////////////////////////////////////////////////////////////////////////
	//  login/register page validation
///////////////////////////////////////////////////////////////////////////////////////
	$("#form0").validate({
//		errorContainer: "#errorSummary",
//		errorLabelContainer: "errorSummary ul",
//		wrapper: "li",
		//debug: true, // end of debug
		rules: {
			email: {
				required: true,
			},
			password: {
				required: true,
				minlength: 2,
			},
			confirmPassword: {
				required: true,
				equalTo: "#password"
			}
		},// end of rules
		
		messages: {
			email: {
				required: "*"
			},
			password: {
				required: "*" 
			},
			confirmPassword: {
				required: "*"
			},
			errorClass: "error"
		}// end of messages
	})
////////////////////////////////////////////////////////////////////////////////////////
	//  check out page validation
///////////////////////////////////////////////////////////////////////////////////////
	
	$("#checkout").validate({
//		errorContainer: "#errorSummary",
//		errorLabelContainer: "errorSummary ul",
//		wrapper: "li",
		debug: false, // end of debug
		rules: {
			BillingAddress1: {
				required: true,
			},
			BillingCity: {
				required: true,
			},
			BillingState: {
				required: true,
			},
			BillingPostalCode: {
				required: true,
				minlength: 5,
			},
			//shipping
			ShippingAddress1: {
				required: true,
			},
			ShippingCity: {
				required: true,
			},
			ShippingState: {
				required: true,
			},
			ShippingPostalCode: {
				required: true,
				minlength: 5,
			},
			//payment
			NameOnCard: {
				required: true,
			},
			CreditCardNumber: {
				required: true,
				minlength: 16,
			},
			ExpirationDate: {
				required: true,
			},
			//shipping method
			ShippingType: {
				required: true,
			},
		},// end of rules
		
		messages: {
			BillingAddress1: {
				required: "*"
			},
			BillingCity: {
				required: "*" 
			},
			BillingState: { 
				required: "*"
			},
			BillingPostalCode: { 
				required: "*"
			},
			//shipping
			ShippingAddress1: {
				required: "*"
			},
			ShippingCity: {
				required: "*"
			},
			ShippingState: {
				required: "*"
			},
			ShippingPostalCode: {
				required: "*"
			},
			//payment
			NameOnCard: {
				required: "*"
			},
			CreditCardNumber: {
				required: "*"
			},
			ExpirationDate: {
				required: "*"
			},
			//shipping method
			ShippingType: {
				required: "Please select shipping method."
			},
			
			errorClass: "error"
		}// end of messages
	})
});