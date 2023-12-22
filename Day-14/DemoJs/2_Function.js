function hello() {
    console.log("In Hello!")
}
hello(); // call to function

function add(num1, num2) {
    return num1+num2;
}
let result = add(2,4);
console.log(result);

// following arrow function in introduced in ES6
let sub = (a,b) => a-b;
console.log(sub(10,5));