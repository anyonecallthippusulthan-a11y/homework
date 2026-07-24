function sumEven(arr) {
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 === 0) {
            sum += arr[i];
        }
    }

    return sum;
}

let numbers = [10, 15, 20, 25, 30];
console.log(sumEven(numbers));



function largest(arr) {
    let max = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    return max;
}

console.log(largest([5, 10, 50, 22, 8]));


function sumOdd(arr, callback) {
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 !== 0) {
            sum += arr[i];
        }
    }

    callback(sum);
}

function display(result) {
    console.log("Sum of Odd Numbers:", result);
}

sumOdd([1, 2, 3, 4, 5, 6, 7], display);



function sumArray(arr) {
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    return sum;
}

console.log(sumArray([10, 20, 30, 40]));



function countEvenOdd(arr) {
    let even = 0;
    let odd = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 === 0) {
            even++;
        } else {
            odd++;
        }
    }

    console.log("Even:", even);
    console.log("Odd:", odd);
}

countEvenOdd([1,2,3,4,5,6,7,8]);



function reverseArray(arr) {
    let reverse = [];

    for (let i = arr.length - 1; i >= 0; i--) {
        reverse.push(arr[i]);
    }

    return reverse;
}

console.log(reverseArray([1,2,3,4,5]));