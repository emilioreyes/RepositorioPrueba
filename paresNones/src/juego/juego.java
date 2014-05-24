package juego;

import java.util.Random;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;



public class juego extends GenericForwardComposer<Component>{
	private static final long serialVersionUID = 1L;
	@Wire
	private Textbox txtNumero;
	private Label lblResultado;
	private Button btn_jugar;
	private Checkbox chkpares;
	private int num;
	public void onClick$btn_jugar(){
		
		if(chkpares.isChecked()){
			alert("pares");	
		}
		else
		{
			alert("nones");
		}
		Random r=new Random();
		int numAleatorio=r.nextInt(6);
		alert(""+numAleatorio);
		num= Integer.parseInt(txtNumero.getValue()) +numAleatorio;
		alert(""+num);
		if (num%2==0 ){
			if(chkpares.isChecked()){
				alert("gano");	
			}
			else{
				alert("perdio");
			}
		}
		else{
			if(chkpares.isChecked()){
				alert("perdio");	
			}
			else{
				alert("gano");
			}
		}
	}

}
