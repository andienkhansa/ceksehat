/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek_sehat;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Andien
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton radiobuttonL;
    @FXML
    private RadioButton radiobuttonP;
    @FXML
    private Button buttonProses;
    @FXML
    private Button buttonReset;
    @FXML
    private TextField analisa1;
    
    @FXML
    private TextField analisa2;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField berat;
    @FXML
    private TextField ideal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        
        int Berat, Ideal, Tinggi;
        String Nama,  JenisKelamin, Analisa, Saran;
        
        Nama = nama.getText();
        Analisa = analisa1.getText();
        Saran = analisa2.getText();
        Berat = Integer.parseInt(berat.getText());
        Tinggi = Integer.parseInt(tinggi.getText());
        
        if (radiobuttonL.isSelected()) {
            Ideal = Tinggi-105;
            ideal.setText(""+Ideal);
            
            if(Berat<Ideal){
                analisa1.setText("Nama : "+Nama+", Anda Underweight");
                analisa2.setText("Tambah porsi makan anda !!!");
            }
            else if(Berat==Ideal) {
                analisa1.setText("Nama : "+Nama+", Anda Ideal");
                analisa2.setText("Jagalah porsi makan anda !!!");
            }
            else {
                analisa1.setText("Nama : "+Nama+", Anda Overweight");
                analisa2.setText("Kurangi porsi makan anda !!!");
            }
        }
        else if (radiobuttonP.isSelected()) {
            Ideal = Tinggi-110;
            ideal.setText(""+Ideal);
            
            if(Berat<Ideal){
                analisa1.setText("Nama : "+Nama+", Anda Underweight");
                analisa2.setText("Tambah porsi makan anda !!!");
            }
            else if(Berat==Ideal) {
                analisa1.setText("Nama : "+Nama+", Anda Ideal");
                analisa2.setText("Jagalah porsi makan anda !!!");
            }
            else {
                analisa1.setText("Nama : "+Nama+", Anda Overweight");
                analisa2.setText("Kurangi porsi makan anda !!!");
            }
        }
        else {
            analisa1.setText("Mohon Pilih Jenis Kelamin Anda");
        }
    }

    @FXML
    private void Hapus(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        radiobuttonL.setSelected(false);
        radiobuttonP.setSelected(false);
        analisa1.setText("");
        analisa2.setText("");
        ideal.setText("");
    }
    
}
