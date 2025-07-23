//let globalVar="i am global";
//function Say(){
//   console.log(globalVar);
//}
//Say();
//console.log(globalVar);
//et a=5;
///function Say(){
//    console.log("Global scope");
//    console.log("within the function" +a);
///}
///Say()
//console.log("outside " +a);
/*function Voting(age){
    if(age>=18){
        const iscloudy=true;
        var israining=true;
        console.log("eligible for voting");
        console.log(iscloudy);
}
console.log(israining);
//console.log(iscloudy);
}
Voting(18)*/
/*function text(){
    console.log("msg");
} 
text();
function text2(callback){
    console.log("msg2");
    setInterval(callback,3000); 
} 
text2(text);*/
let count=0;
let interval=()=>{
    count++;
    console.log(count);
    if(count<5){
        interval();
    }
}
interval();