const user = {
    firstName: "Thippu",
    lastName: "Sulthan",
    email: "thippu@gmail.com"
};

const fullName =
(user.firstName + " " + user.lastName).toUpperCase();

const domain =
user.email.split("@")[1];

console.log("Full Name :", fullName);
console.log("Email :", user.email);
console.log("Domain :", domain);
const sentence =
"JavaScript is Easy to Learn";

const result = {
    characters: sentence.length,
    words: sentence.trim().split(" ").length,
    lowercase: sentence.toLowerCase()
};

console.log(result);
const name = "Thippu";
const phone = "9876543210";

const username =
name.slice(0,3).toLowerCase() +
phone.slice(-2);

console.log(username);