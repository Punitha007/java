let employees=[];
function addEmp(id,name,salary=true){
    employees.push({id,name,salary});
    console.log("Employee added",employees);
}
addEmp(1,"dhivya",50000)
addEmp(2,"kayva",40000)
addEmp(3,"priya",30000)
//to update employee
function updateEmp(id,newDetail){
    const emp=employees.find(e=>e.id === id)
    if(emp){
        Object.assign(emp,newDetail);
        console.log("updated",employees)
    }else{
        console.log("employee not found")
    }
}
updateEmp(3,{name:"prithika"});
//delete employee
function removeEmp(id){
    const index=employees.findIndex((e)=>e.id === id);
    if(index !== -1){
        employees.splice(index,id)
        console.log("employee removed",employees)
    }else{
        console.log("employee not found");
    }
}
removeEmp(1)
//calculate total salary
function totalsalary(){
    const total=employees.reduce((sum,emp)=>sum+emp.salary,0);
    console.log("total salary is:",total);
}
totalsalary()
