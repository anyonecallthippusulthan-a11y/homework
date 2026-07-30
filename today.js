const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    const success = true;

    if (success) {
      resolve("Success");
    } else {
      reject("Fail");
    }
  }, 2000);
});

promise
  .then(result => console.log(result))
  .catch(error => console.log(error));