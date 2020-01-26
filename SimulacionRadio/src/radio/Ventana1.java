package radio;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ventana1 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	
	//se crean objetos para cambio de estacion
	static
	CambioE1 c1 = new CambioE1();
	static
	CambioE2 c2 = new CambioE2();
	//botones
	JButton btnSave;
	static 
	JButton btnAnterior;
	static 
	JButton btnSiguiente;
	JButton btnFMAM;
	JRadioButton est1, est2, est3, est4, est5, est6, est7, est8, est9, est10, est11, est12;
 	ButtonGroup totalEst;
	
 	
 	
	

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(385, 300);
		getContentPane().setLayout(null);
		
		inciarComponentes();
		
		getContentPane().add(c1);
		c1.setVisible(true);
		c2.setVisible(false);
		
		cambioEstacion(); 
	}
	
	
	
	private void inciarComponentes() {
		
		ButtonGroup totalEst = new ButtonGroup();
		
		//se crea los botones para cada una de las estaciones de radio
		
		est1 = new JRadioButton();
		est1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est1.setText("1");
		est1.setBounds(115, 116, 40, 30);
		
		est2 = new JRadioButton();
		est2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est2.setText("2");
		est2.setBounds(155, 116, 40, 30);
		
		est3 = new JRadioButton();
		est3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est3.setText("3");
		est3.setBounds(195, 116, 40, 30);
		
		est4 = new JRadioButton();
		est4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est4.setText("4");
		est4.setBounds(235, 116, 40, 30);
		
		est5 = new JRadioButton();
		est5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est5.setText("5");
		est5.setBounds(275, 116, 40, 30);
		
		est6 = new JRadioButton();
		est6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est6.setText("6");
		est6.setBounds(315, 116, 40, 30);
		
		est7 = new JRadioButton();
		est7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est7.setText("7");
		est7.setBounds(115, 158, 40, 30);
		
		est8 = new JRadioButton();
		est8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est8.setText("8");
		est8.setBounds(155, 158, 40, 30);
		
		est9 = new JRadioButton();
		est9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est9.setText("9");
		est9.setBounds(195, 158, 40, 30);
		
		est10 = new JRadioButton();
		est10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est10.setText("10");
		est10.setBounds(235, 158, 48, 30);
		
		est11 = new JRadioButton();
		est11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est11.setText("11");
		est11.setBounds(275, 158, 48, 30);
		
		est12 = new JRadioButton();
		est12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		est12.setText("12");
		est12.setBounds(315, 158, 48, 30);
		
		//se agregan todas las estaciones al radio, de esta forma solo uno se selecciona
		totalEst.add(est1);
		totalEst.add(est2);
		totalEst.add(est3);
		totalEst.add(est4);
		totalEst.add(est5);
		totalEst.add(est6);
		totalEst.add(est7);
		totalEst.add(est8);
		totalEst.add(est9);
		totalEst.add(est10);
		totalEst.add(est11);
		totalEst.add(est12);
		
		//boton para guaestar 
		btnSave = new JButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(255, 208, 120, 40);
		//boton para escuchar la estacion anterior
		btnAnterior = new JButton();
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setText("<");
		btnAnterior.setBounds(251, 58, 65, 35);
		//boton para escuchar la estacion siguiente
		btnSiguiente = new JButton();
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setText(">");
		btnSiguiente.setBounds(314, 58, 65, 35);
		//boton para cambiar frecuencia
		btnFMAM = new JButton();
		btnFMAM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFMAM.setText("FM / AM");
		btnFMAM.setBounds(6, 123, 97, 40);
		
		getContentPane().add(est1);
		getContentPane().add(est2);
		getContentPane().add(est3);
		getContentPane().add(est4);
		getContentPane().add(est5);
		getContentPane().add(est6);
		getContentPane().add(est7);
		getContentPane().add(est8);
		getContentPane().add(est9);
		getContentPane().add(est10);
		getContentPane().add(est11);
		getContentPane().add(est12);
		getContentPane().add(btnSave);
		getContentPane().add(btnAnterior);
		getContentPane().add(btnSiguiente);
		getContentPane().add(btnFMAM);
		
		//boton para apagar o encender
		JToggleButton toggleButton = new JToggleButton("On / Off");
		//metodo
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		toggleButton.setBounds(6, 6, 97, 29);
		getContentPane().add(toggleButton);
		
		//crear variable para el numero de estacion
		
		JTextField numEst = new JTextField();
		numEst.setText("800");
		
		numEst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana1.cambioEstacion();
				
				
			}
		});
		numEst.setHorizontalAlignment(SwingConstants.CENTER);
		numEst.setBounds(28, 61, 203, 32);
		getContentPane().add(numEst);
		
		
		
		
	}


	@Override
	
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj.equals(btnAnterior)) {
			c1.setVisible(true);
			c2.setVisible(false);
			
			getContentPane().add(c1);
			getContentPane().validate();
			cambioEstacion();
		}
		
		else if(obj.equals(btnSiguiente)) {
			
			c1.setVisible(false);
			c2.setVisible(true);
			
			getContentPane().add(c2);
			getContentPane().validate();
			cambioEstacion();
		}
	}
	//metodo para cambiar la frecuencia 
	private static void cambioEstacion() {
		if(c1.isVisible()) {
			btnAnterior.setEnabled(false);
			btnSiguiente.setEnabled(true);
		}
		else if(c2.isVisible()) {
			btnAnterior.setEnabled(true);
			btnSiguiente.setEnabled(false);
		}
	}
		// TODO Auto-generated method stub
		

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
}
