/*let number=[1,2,"three",true];
let names=new Array("punitha","karishma");
console.log(number[2]);
console.log(number.length);
console.log(names.length);
let result=number.filter(number => number[1]);
console.log(result);
//slice-delete element based on index value
//splice-delete the 1st index and the value given by us will replace to the 2nd index,
the values before are deleted and the values after replaced are printed
let number2=[1,2,3,4,5];
let r=number2.slice(1,3);/console.log(r);
number2.splice(1,2,"hello");
console.log(number2);
let details={
    name:"90",
    totalmarks:"90",
    subject:{
        dbms:"100",
        java:"100"
    },
    avg:function(){
        let sum=parseInt(this.subject.dbms) + parseInt(this.subject.java);
        return sum;
    }
}
console.log(details.totalmarks)
console.log(details.name)
console.log(details.subject["dbms"])
console.log(details.subject.java)
console.log(details.avg());*/
// const person={
//     name:"rishiga",
//     age:18,
//     city:"kovai"
// };
// const{name,age,city}=person;
// console.log(name)
// console.log(age)
// console.log(city)
const person=["rishiga",18,"kovai"];
const[name,age,city]=person;
console.log(name+" "+age+" "+city)