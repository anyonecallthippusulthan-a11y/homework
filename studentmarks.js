let marks = 65;

const promise = new Promise((resolve, reject) => {
  if (marks >= 50) {
    resolve("Pass");
  } else {
    reject("Fail");
  }
});

promise
  .then(result => console.log(result))
  .catch(error => console.log(error));