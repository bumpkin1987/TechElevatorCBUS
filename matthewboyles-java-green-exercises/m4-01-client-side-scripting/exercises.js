﻿//1
function sumDouble(x,y) {
    if(x === y) {
       return (x + y) * 2;
    }
        return x + y;
        
}
//2
function hasTeen(x,y,z) {
    if(x >= 13 && x <= 19) {
        return true;
    }
    else if(y >= 13 && y <= 19) {
        return true;
    }       
    else if(z >= 13 && z <= 19) {
        return true;
    }     
    return false;
}
//3
function lastDigit(a,b) {
    var lastDigitA = a.toString().split('').pop();
    var lastDigitB = b.toString().split('').pop();
    if( lastDigitA == lastDigitB){
        return true;
    } else {
        return false;
    } 
}
//4
function seeColor(test) {
    if(test.indexOf('red') == 0) {
        return "red";
    } else if (test.indexOf('blue') == 0)  {
        return "blue";
    } else {
        return "";
    }
}
//5
function middleThree(test) {
    var length = 3;
    var position = test.length/2 -1;
    return test = test.slice(position,position + length);
    return test; 
}
//6
function frontAgain(test){
    var length = 2;
    var positionBeg = test.slice(0,2);
    var positionEnd = test.slice(test.length -2,test.length);
    if ( positionBeg == positionEnd) {
        return true
    } else {
        return false; 
    }
}
//7
function alarmClock(day,vaca) {
   
    if (( day == 1 || day == 2 || day == 3 || day == 4 || day == 5) && ( vaca == false)) {
        return "7:00"
    } else if (( day == 6 || day == 0 ) && (vaca == false)) {
        return "10:00"
    } else if (( day == 6 || day == 0 ) && (vaca == true)) {
        return "off"
    } else {
        return "10:00"
    }
}
//8
function makeMiddle(array1) {
    var array2;
    var a;
    var b;
    if ((array1.length % 2 == 1) || (array1.length < 2)) {
        return [];
    } else {
        a = array1[array1.length / 2 - 1]
        b = array1[(array1.length / 2) ]
        
        return [a,b];
    }
}
//9
function oddOnly(array1) {
    var array2 = [];
    for (var i = 0; i < array1.length ; i++) {
        if (array1[i] % 2 == 1){
            array2.push(array1[i]);
        } 
    }
    return array2;
}
//10
function weave(array1, array2) {
    var weaveArray = [];
    var extra;
    if (array1.length >= array2.length) {
        for (var i = 0; i < array1.length; i++) {
            weaveArray.push(array1[i]);
            if (array2[i] != undefined) {
                weaveArray.push(array2[i]);
            }
        }


    } else if (array2.length > array1.length) {
        for (var i = 0; i < array2.length; i++) {
            if (array1[i] != undefined) { 
            weaveArray.push(array1[i]);
        }
        weaveArray.push(array2[i]);

    }
}
return weaveArray;   
}
//11
function cigarParty(number, weekend) {
    if ((number > 39 && number < 61 && weekend == false) || (number > 39 && weekend == true)) {
        return true;
    } else {
        return false;
    }
}
//12
function stringSplosion(string) {
    var splosion = '';
    for (var i=1; i < string.length +1 ; i++){
        splosion = splosion + string.substring(0,i)
    }
return splosion;
}
//13
function fizzBuzz(a) {
    if (a % 15 == 0) {
        return "FizzBuzz";
    } else if (a % 5 == 0){
        return "Buzz";
    } else if (a % 3 == 0){
        return "Fizz";
    } else {
        return a;
    }
}
//14
function countValues(array) {
    result = {};
    var x;
    for (x of array) {
        if (result[x] !== undefined) {
            result[x] = result[x] + 1;
        } else {
            result[x] = 1;
        }
    } return result;
}
//15
function reverseArray(r) {
    return r.reverse(); // take that!
}
//16
function blackJack(a,b){
    if (( a > 21) && (b > 21)){
        return 0;
    } else if (( a > b ) && (a < 22)){
        return a;
    } else if (( b > a) && (b < 22)){
        return b;
    } else if (( a > b) && (a > 22)){
        return b;
    } else {
        return a;
    }
}