//Funções
function addNums(num1 = 1, num2 = 1) {
    return num1 + num2;
}

let x = addNums(4, 5); //Chamada da função addNums
console.log(x);

let z = myFunc(4, 5); //Chamada da função myFunc
console.log(z);

function myFunc(num1, num2) {
    return num1 * num2;
}