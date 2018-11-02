package interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelVerificacion extends JPanel implements ActionListener{
	private JLabel labExplicacion;
	private JTextField txtResultado;
	private JTextField txtSecuencia;
	private JButton butVerificar;
	
	private static final String VERIFICAR = "VERIFICAR";
	
	private InterfazSecuencia principal;
	
	public PanelVerificacion(InterfazSecuencia ventana){
		principal = ventana;
		
		setBorder(new TitledBorder("Verificación"));
		setLayout(new BorderLayout());
		
		labExplicacion =  new JLabel("Digite una secuencia de enteros separados por un espacio entre cada valor:");
		butVerificar = new JButton("Verificar");
		txtSecuencia = new JTextField();
		txtResultado = new JTextField("                   ");
		txtResultado.setEditable(false);
		
		butVerificar.setActionCommand(VERIFICAR);
		butVerificar.addActionListener(this);
		
		add(labExplicacion, BorderLayout.NORTH);
		add(butVerificar, BorderLayout.WEST);
		add(txtSecuencia, BorderLayout.CENTER);
		add(txtResultado, BorderLayout.EAST);
	}
	
	public int[] darSecuencia() throws NumberFormatException{
		String[] secuenciaStr = txtSecuencia.getText().split(" ");
		int[] secuencia = new int[secuenciaStr.length];
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia[i] = Integer.parseInt(secuenciaStr[i]);
		}
		
		return secuencia;
	}
	
	public void refrescarResultado(boolean ordenado){
		txtResultado.setText(ordenado+"");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals(VERIFICAR)){
			principal.verificar();
		}
	}
}
