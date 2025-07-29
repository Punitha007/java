//number pattern
let number = 9123456780;
let value=/^[1-9]\d{9}$/;
if(value.test(number.toString())){
    console.log("correct");
}else{
    console.log("incorrect");
}
//string pattern
let text="hai hello";
let match=/\by\w+e\b/gi;
console.log(match ? text : 0);
console.log(text.length);

