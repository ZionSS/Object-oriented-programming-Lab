/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Ailas
 */
public class LoanCalculator {
    @FXML private Button calculateBtn;
    @FXML private TextField monthlyPayment;
    @FXML private TextField totalPayment;
    @FXML private TextField annualInterestRate;
    @FXML private TextField numberOfYears;
    @FXML private TextField loanAmount;
    Loan loan = new Loan();
    @FXML
    private Button loadBtn;
    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    String file = "loan.dat";
/*
    public void calculateSelect (){
         calculateBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
            }
        });
     }
*/
    @FXML
    private void calculateAction(ActionEvent event) {
        double temp1,temp2;
                int temp;
                temp1 =Double.valueOf(annualInterestRate.getText());
                temp2 = Double.valueOf(loanAmount.getText());
                temp = Integer.valueOf(numberOfYears.getText());
                loan.setAnnualInterestRate(temp1);
                loan.setLoanAmount(temp2);
                loan.setNumberOfYears(temp);
                monthlyPayment.setText(String.valueOf(loan.getTotalPayment()));
                totalPayment.setText(String.valueOf(loan.getTotalPayment()));
    }
    

    @FXML
    private void handle(KeyEvent event) {
    }

    @FXML
    private void loadAction(ActionEvent event) throws FileNotFoundException, IOException {
        annualInterestRate.setText("");
        numberOfYears.setText("");
        loanAmount.setText("");
        monthlyPayment.setText("");
        totalPayment.setText("");
        
        int y = 0;
         double a = 0,lo = 0;
        FileInputStream fis = new FileInputStream(file);
        DataInputStream input = new DataInputStream(fis);
        while(input.available()!=0){
            y =input.readInt();
            a =input.readDouble();
            lo =input.readDouble();
        }
        input.close();
        numberOfYears.setText(y+"");
            annualInterestRate.setText(a+"");
            loanAmount.setText(lo+"");
    }

    @FXML
    private void saveAction(ActionEvent event) throws FileNotFoundException, IOException{
        double a = parseDouble(annualInterestRate.getText());
        double lo = (parseDouble(loanAmount.getText()));
        int y = parseInt(numberOfYears.getText());
        if(!annualInterestRate.getText().isEmpty())
        System.out.println(a);
        if(!loanAmount.getText().isEmpty())
        System.out.println(lo);
        if(!numberOfYears.getText().isEmpty())
        System.out.println(y);
        DataOutputStream output = null;
        
        output = new DataOutputStream(new FileOutputStream(file));
        if(!numberOfYears.getText().isEmpty())
        output.writeInt(y);
        if(!annualInterestRate.getText().isEmpty())
        output.writeDouble(a);
        if(!loanAmount.getText().isEmpty())
        output.writeDouble(lo);
        output.close();
        
        
    }

    @FXML
    private void clearAction(ActionEvent event) {
    monthlyPayment.setText("");
    totalPayment.setText("");
    annualInterestRate.setText("");
    numberOfYears.setText("");
    loanAmount.setText("");
    }
    

}
