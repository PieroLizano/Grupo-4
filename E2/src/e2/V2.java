package e2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNum;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese número: ");
			lblNewLabel.setBounds(30, 38, 109, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtNum = new JTextField();
			txtNum.setBounds(220, 35, 86, 20);
			contentPane.add(txtNum);
			txtNum.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celsius a Fahrenheit");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(78, 96, 213, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Kilómetros a millas");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(78, 130, 213, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Segundos a minutos y segundos");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(77, 164, 214, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(53, 227, 316, 176);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double celsius = Double.parseDouble(txtNum.getText());
		Conversor c = new Conversor(celsius);
		txtS.append(celsius + " celsius son " + c.Convertir(celsius) + " fahrenheit ");
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		int km = Integer.parseInt(txtNum.getText());
		Conversor k = new Conversor(km);
		txtS.append(km + " kilómetros son " + k.Convertir(km) + " millas");
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		int seg = Integer.parseInt(txtNum.getText());
		Conversor s = new Conversor(seg);
		txtS.append(s.Convertir(seg, true));
	}
}
