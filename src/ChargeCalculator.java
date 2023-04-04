import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ChargeCalculator extends JFrame{
	
	
	private JPanel panel; //���������� ��� �����
	private JButton button; //���������� ��� ��������
	private JTextField textField; //���������� ��� ������
	
	private Ship ship; //������� �� �����
	
	public ChargeCalculator(Ship s) {
		ship=s; //���� ������������ �� �����
		
		panel = new JPanel(); //���������� ��� �����
		button=new JButton("Calculate Charge");
		textField= new JTextField("Total charge for all containers");
		
//�������� �� ������� ��� �����
		panel.add(button);
		panel.add(textField);
		
//���� �� ����� ���� ��� ��������	
		this.setContentPane(panel);
//��� �� ������		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
//STANDARD- ��� �� �������� ��� �����������
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Carge Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//��������� ����� ��� ��� ��������� ��� �������� :
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String sum= String.valueOf(ship.calcTotalCharge()); //��������� ��� ���� �� string
			textField.setText(sum); //������ �� string ��� textField
		}
		
		
	}
}
