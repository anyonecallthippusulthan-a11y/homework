let num = 8;

const promise = new Promise((resolve, reject) => {
  if (num % 2 === 0) {
    resolve("Even Number");
  } else {
    reject("Odd Number");
  }
});

promise
  .then(result => console.log(result))
  .catch(error => console.log(error));