import { add, sub, mul } from "./calculator.js";

const num1 = document.getElementById("num1");
const num2 = document.getElementById("num2");
const result = document.getElementById("result");

document.getElementById("addBtn").addEventListener("click", () => {
    result.textContent = add(Number(num1.value), Number(num2.value));
});

document.getElementById("subBtn").addEventListener("click", () => {
    result.textContent = sub(Number(num1.value), Number(num2.value));
});

document.getElementById("mulBtn").addEventListener("click", () => {
    result.textContent = mul(Number(num1.value), Number(num2.value));
});