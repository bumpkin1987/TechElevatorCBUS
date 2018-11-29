/// <reference path="../jquery-3.1.1.js" />
//1.Locate all <div> elements and add the 'president' class.
function presentialDivs() {
	  $('#presidents div').addClass('president');
}

//2.Locate George Washington and add the 'founding-father' class
function georgeWashington() {
	$('#george-washington').addClass('founding-father');
}

//3.Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {
	$('.Republican').addClass('red');
}

//4.Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {
	$('.Democratic').addClass('blue');
}

//5.Locate all Federalist presidents and add the 'gold' class.
function otherPresidents() {
	$("div#presidents > div").not(".Democratic").not(".Republican").addClass("gold");
}

//6.Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {
	$('[id^="james"]').addClass('james');
}

//7.Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {
	$('h2').next('div').addClass('beginningOfCentury');
}

//8.Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
	$('div').prev('h2').addClass('endOfCentury');
}

//9.Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {
	$("h2:contains('1900s')").nextAll('.currency').addClass('appearOnCurrency');}


