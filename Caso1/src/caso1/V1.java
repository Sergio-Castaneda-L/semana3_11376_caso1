package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumarTresEnteros;
	private JButton btnSumarDosReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(10, 23, 108, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número");
			lblSegundoNmero.setBounds(10, 51, 108, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("Tercer número");
			lblTercerNmero.setBounds(10, 76, 108, 14);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(128, 20, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(128, 48, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(128, 73, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Sumar dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(224, 19, 177, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumarTresEnteros = new JButton("Sumar tres enteros");
			btnSumarTresEnteros.addActionListener(this);
			btnSumarTresEnteros.setBounds(224, 47, 177, 23);
			contentPane.add(btnSumarTresEnteros);
		}
		{
			btnSumarDosReales = new JButton("Sumar dos reales");
			btnSumarDosReales.addActionListener(this);
			btnSumarDosReales.setBounds(224, 76, 177, 23);
			contentPane.add(btnSumarDosReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 115, 391, 135);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumarDosReales) {
			do_btnSumarDosReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumarTresEnteros) {
			do_btnSumarTresEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1=Integer.parseInt(txtN1.getText());
		int n2=Integer.parseInt(txtN2.getText());
		Calculadora c=new Calculadora(n1, n2);
		txtS.append("La suma es: "+c.Sumar(n1, n2));
	} catch (Exception e2) {
		MostrarError();
	}
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this,"Ingrese número(s) válido(s)");
	}
	protected void do_btnSumarTresEnteros_actionPerformed(ActionEvent e) {
	   try {
		   int n1 = Integer.parseInt(txtN1.getText());
			  int n2 = Integer.parseInt(txtN2.getText());
			  int n3 = Integer.parseInt(txtN3.getText());
		   Calculadora c = new Calculadora(n1,n2,n3);
		   txtS.append("La suma de tres enteros es: " + c.Sumar(n1, n2,n3));
		
	} catch (Exception e2) {
	   MostrarError();
	} 	
	}
	protected void do_btnSumarDosReales_actionPerformed(ActionEvent e) {
		double num1=Double.parseDouble(txtN1.getText());
		double num2=Double.parseDouble(txtN2.getText());
		Calculadora c=new Calculadora(num1, num2);
		txtS.append("La suma de dos reales es: "+c.Sumar(num1, num2));
	}
}








