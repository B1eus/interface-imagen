package imagen;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class taller23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					taller23 frame = new taller23();
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
	public taller23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setVisible(true);
		contentPane.add(lblNewLabel_1);
		ImageIcon img_hombre =new ImageIcon(getClass().getResource("imagen\\ilustraciones\\hombre.png"));
		ImageIcon img_mujer =new ImageIcon(getClass().getResource("imagen\\ilustraciones\\mujer.png"));
		JLabel lblNewLabel = new JLabel("Seleccione una opcion");
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer indice = comboBox.getSelectedIndex();
				if (indice.equals(0))
				{
					lblNewLabel_1.setIcon(img_hombre);
				}
				else if (indice.equals(1))
				{
					lblNewLabel_1.setIcon(img_mujer);
				}
				else lblNewLabel_1.setIcon(null);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"hombre", "mujer"}));
		comboBox.setToolTipText("");
		contentPane.add(comboBox);
	}

}
