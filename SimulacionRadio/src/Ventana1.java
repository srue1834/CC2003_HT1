import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.*;

public class Ventana1 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	JButton btnON, btnSave, btnAnterior, btnSiguiente, btnFMAM;
	JRadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7, rd8, rd9, rd10, rd11, rd12;
 	ButtonGroup estaciones;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(385, 300);
		getContentPane().setLayout(null);
		inciarComponentes();
	}
	
	private void inciarComponentes() {
		
		estaciones = new ButtonGroup();
		
		//se crea los botones para cada una de las estaciones de radio
		
		rd1 = new JRadioButton();
		rd1.setText("1");
		rd1.setBounds(20, 30, 40, 30);
		
		rd1 = new JRadioButton();
		rd1.setText("1");
		rd1.setBounds(115, 87, 40, 30);
		
		rd2 = new JRadioButton();
		rd2.setText("2");
		rd2.setBounds(155, 87, 40, 30);
		
		rd3 = new JRadioButton();
		rd3.setText("3");
		rd3.setBounds(195, 87, 40, 30);
		
		rd4 = new JRadioButton();
		rd4.setText("4");
		rd4.setBounds(235, 87, 40, 30);
		
		rd5 = new JRadioButton();
		rd5.setText("5");
		rd5.setBounds(275, 87, 40, 30);
		
		rd6 = new JRadioButton();
		rd6.setText("6");
		rd6.setBounds(315, 87, 40, 30);
		
		rd7 = new JRadioButton();
		rd7.setText("7");
		rd7.setBounds(115, 129, 40, 30);
		
		rd8 = new JRadioButton();
		rd8.setText("8");
		rd8.setBounds(155, 129, 40, 30);
		
		rd9 = new JRadioButton();
		rd9.setText("9");
		rd9.setBounds(195, 129, 40, 30);
		
		rd10 = new JRadioButton();
		rd10.setText("10");
		rd10.setBounds(235, 129, 48, 30);
		
		rd11 = new JRadioButton();
		rd11.setText("11");
		rd11.setBounds(275, 129, 48, 30);
		
		rd12 = new JRadioButton();
		rd12.setText("12");
		rd12.setBounds(315, 129, 48, 30);
		
		//se agregan todas las estaciones al radio, de esta forma solo uno se selecciona
		estaciones.add(rd1);
		estaciones.add(rd2);
		estaciones.add(rd3);
		estaciones.add(rd4);
		estaciones.add(rd5);
		estaciones.add(rd6);
		estaciones.add(rd7);
		estaciones.add(rd8);
		estaciones.add(rd9);
		estaciones.add(rd10);
		estaciones.add(rd11);
		estaciones.add(rd12);

	
		//boton de encendido o apagado
		btnON = new JButton();
		btnON.setText("ON");
		btnON.setBounds(6, 6, 60, 30);
		//boton para guardar 
		btnSave = new JButton();
		btnSave.setText("Save");
		btnSave.setBounds(255, 179, 120, 40);
		//boton para escuchar la estacion anterior
		btnAnterior = new JButton();
		btnAnterior.setText("<");
		btnAnterior.setBounds(235, 6, 65, 35);
		//boton para escuchar la estacion siguiente
		btnSiguiente = new JButton();
		btnSiguiente.setText(">");
		btnSiguiente.setBounds(298, 6, 65, 35);
		//boton para cambiar frecuencia
		btnFMAM = new JButton();
		btnFMAM.setText("FM / AM");
		btnFMAM.setBounds(6, 94, 97, 40);
		
		getContentPane().add(rd1);
		getContentPane().add(rd2);
		getContentPane().add(rd3);
		getContentPane().add(rd4);
		getContentPane().add(rd5);
		getContentPane().add(rd6);
		getContentPane().add(rd7);
		getContentPane().add(rd8);
		getContentPane().add(rd9);
		getContentPane().add(rd10);
		getContentPane().add(rd11);
		getContentPane().add(rd12);
		
		getContentPane().add(btnON);
		getContentPane().add(btnSave);
		getContentPane().add(btnAnterior);
		getContentPane().add(btnSiguiente);
		getContentPane().add(btnFMAM);
	}


	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnON) {
			valideRadios();
		}
		
		// TODO Auto-generated method stub
		
	}
	private void valideRadios() {
		
		if (rd1.isSelected() && btnSave.isSelected()) {
			
			
		}
	}
}
