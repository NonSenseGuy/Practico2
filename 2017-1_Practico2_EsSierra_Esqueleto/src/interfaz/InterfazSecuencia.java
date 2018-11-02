package interfaz;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import mundo.Secuencia;

@SuppressWarnings("serial")
public class InterfazSecuencia extends JFrame{
	private PanelVerificacion panelVerificacion;
	public InterfazSecuencia(){
		setTitle("Secuencia :: Verificar Sierra");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelVerificacion = new PanelVerificacion(this);
		
		add(new JLabel(new ImageIcon("imgs/banner.png")),BorderLayout.NORTH);
		add(panelVerificacion, BorderLayout.CENTER);
		pack();
	}
	
	public void verificar() {
		try{
			int[] secuencia = panelVerificacion.darSecuencia();
			boolean ordenado = Secuencia.esSierra(secuencia);
			panelVerificacion.refrescarResultado(ordenado);
		}catch(NumberFormatException nfexc){
			JOptionPane.showMessageDialog(this, "La secuencia se debe digitar como valores\nenteros separados entre si por un espacio.");
			nfexc.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		InterfazSecuencia ventana;
		ventana = new InterfazSecuencia();
		ventana.setVisible(true);
	}
}
