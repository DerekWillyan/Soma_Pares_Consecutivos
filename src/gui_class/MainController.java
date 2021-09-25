package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField num;
	@FXML
	private TextField aux;
	@FXML
	private Button gerar;
	@FXML
	private Label lab;
	
	@FXML
	public void onbtnGerar() {
		
		int num = Integer.parseInt(this.num.getText());
		int aux = Integer.parseInt(this.aux.getText());
		int soma = 0;
		
		while (aux != 0) {
			
			if(num %2 == 0) {

				soma += num;
				num++;
				aux--;
				
			} else {
				
				num++;
				
			}
			
		}
		
		this.lab.setText(String.format("%d", soma));
		
	}

}
