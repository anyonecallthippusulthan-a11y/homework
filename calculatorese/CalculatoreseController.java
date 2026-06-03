package calculatorese;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatoreseController {

    @FXML
    private TextField display;

    private double firstNumber;
    private String operator = "";
    private boolean startNewNumber = true;

    @FXML
    private void handleButton(ActionEvent event) {

        String value = ((Button) event.getSource()).getText();

        switch (value) {

            case "C":
                display.clear();
                firstNumber = 0;
                operator = "";
                startNewNumber = true;
                break;

            case "+":
            case "-":
            case "*":
            case "/":
                firstNumber = Double.parseDouble(display.getText());
                operator = value;
                startNewNumber = true;
                break;

            case "=":
                calculateResult();
                break;

            default:
                if (startNewNumber) {
                    display.setText(value);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + value);
                }
        }
    }

    private void calculateResult() {

        try {

            double secondNumber = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {

                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                case "/":
                    if (secondNumber == 0) {
                        display.setText("Error: Divide by 0");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
            }

            display.setText(String.valueOf(result));
            startNewNumber = true;

        } catch (Exception e) {
            display.setText("Error");
        }
    }
}