let currentTime=new Date();
console.log(currentTime);
let local=currentTime.toString();
console.log(local);
let hours=currentTime.getHours();
console.log(hours);
let minutes=currentTime.getDay();
let day=currentTime.getMinutes();
console.log(day);


class Exam{
    constructor(personname){
     this.personname;
     console.log(personname);
    }
}
let result=new Exam("Rishi");


class Bank{
    constructor(initialamount=0){
        this._balance=initialamount;
    }
    get balance(){
    return this._balance;
    }
    set balance(amountdeposit){
       if(amountdeposit>0){
        this._balance+=amountdeposit;
        console.log(balance);
       }
    }
}
let add=new Bank(10);
console.log(add);
add.balance=300;
console.log(add);
console.log(add.balance);

class Addition{
    static Math(a,b){
        return a+b
    }
}
console.log(Addition.Math(4,4))

//import and export modules
//definition
//export allows you to make variables,function or classes available to other files
//import allows you to bring those into another file
//used in modular javascript

export function add(a,b){
    return a+b;
}
export const pi=3.14;