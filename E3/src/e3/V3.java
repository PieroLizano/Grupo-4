package e3;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class V3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JTextField txtNom;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblIngreseSueldo;
	private JTextField txtSue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V3 frame = new V3();
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
	public V3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			label = new JLabel("Ingrese nombre: ");
			label.setBounds(27, 30, 125, 14);
			contentPane.add(label);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(128, 27, 86, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(247, 43, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 130, 313, 143);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblIngreseSueldo = new JLabel("Ingrese sueldo:");
			lblIngreseSueldo.setBounds(24, 72, 86, 14);
			contentPane.add(lblIngreseSueldo);
		}
		{
			txtSue = new JTextField();
			txtSue.setBounds(128, 66, 86, 20);
			contentPane.add(txtSue);
			txtSue.setColumns(10);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		if(txtNom.getText().trim().isEmpty())
			JOptionPane.showMessageDialog(this,"Ingrese nombre");
		else {
			String nom = txtNom.getText();
			double sueldo = Double.parseDouble(txtSue.getText());
			Contador c = new Contador(nom, sueldo);
			txtS.setText("");
			txtS.append("Ingresó " + c.cantidad() + " nombres\n");
			txtS.append("La suma de sueldos es: " + c.sueldo());
		}
		
	}
}
