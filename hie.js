function pen()
{
    console.log("sulthan");
}
pen();
 function sulthan ()
 {
    a=10
    b=20
    d=a+b;
    return d;
    
 }
 console.log (sulthan());

 let add = () =>a=10;b=24
 d=a+b;

 add()
 const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let numbers = [];
let sum = 0;
let i = 0;

function getNumber() {
    if (i < 10) {
        rl.question(`Enter number ${i + 1}: `, (answer) => {
            numbers.push(Number(answer));
            sum += Number(answer);
            i++;
            getNumber();
        });
    } else {
        let max = Math.max(...numbers);
        let min = Math.min(...numbers);
        let average = sum / numbers.length;

        console.log("Numbers:", numbers);
        console.log("Sum =", sum);
        console.log("Average =", average);
        console.log("Maximum =", max);
        console.log("Minimum =", min);

        rl.close();
    }
}

getNumber();