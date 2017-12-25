/*package coding_1_50;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

*//**
 * Calculator_Level_0
 * 
 * Level 1 : Java Swing을 이용한 GUI 계산기
 * @since : 2017.12.21
 * @author : Yun Young
 * 
 *//*
public class Calculator_level_1{
	private JFrame frame;
	private ActionListener btnClickListener;
	
	 결과값 변수 
	private BigDecimal resultVal;
	
	 현재 입력된 값을 저장해 놓는 변수 
	private BigDecimal inputVal;
	
	 초기화 
	private Boolean newVal;
	
	 현재 선택된 연산 버튼 
	private JButton operaterBtn;	
	
	 0으로 나누기 Divide Error 
	private static final String divideErrorText = "0으로 나눌 수 없습니다.";
	
	private Font buttonFont;
	private Container container;
	private JTextField txt;
	private JLabel mLabel;
	
	 +,-,*,/, = 버튼 
	private JButton plusBtn;
	private JButton minusBtn;
	private JButton mulBtn;
	private JButton divBtn;
	private JButton enterBtn;
	
	public void create(){
		this.init();
		this.create();
		this.setEventListener();
	}
	
	 Init Method 
	private void init(){
		this.buttonFont = new Font("Serif", 0, 16);
		this.resultVal = new BigDecimal(0);
		this.inputVal = new BigDecimal(0);
		this.operaterBtn = null;
		this.newVal = true;
		
		 Button Click Listener 
		this.btnClickListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String txtVal = txt.getText();
				
				JButton b = (JButton) e.getSource();
				String operNm = b.getText();
				
				 switch 문 
				switch(operNm){
					case "M+":
						if(txtVal.equals(divideErrorText)){
							return;
						}
						mLabel.setVisible(true);
						inputVal = inputVal.add(new BigDecimal(Float.valueOf(txtVal)));
						newVal = true;
						break;
					
					case "M-":
						if(txtVal.equals(divideErrorText)){
							return;
						}
						
						mLabel.setVisible(true);
						inputVal = inputVal.subtract(new BigDecimal(Float.valueOf(txtVal)));
						newVal = true;
						break;
					case "MR":
						Float f = inputVal.floatValue();
						Integer i = inputVal.intValue();
						
						if(f.equals(Float.valueOf(i))){
							txt.setText(String.valueOf(i));
						}
						else{
							txt.setText(String.valueOf(f));
						}
						newVal = true;
						break;
					case "MC":
						mLabel.setVisible(false);
						inputVal = new BigDecimal(0);
						newVal = true;
						break;
						
					case "/":
					case "*":
					case "+":
					case "-":
						inputOperate(b);
						break;
					case "←":
						inputBackspace();
						break;
					case "√":
						calculateSquareRoot();
						break;;
					case "=":
						inputEnter();
						break;
					case "C":
						inputEscape();
						break;
					default :
						pressNumberPad(operNm);
						break;
				}
			}
		};
	}
	
	 Calculator UI Create 
	private void createUI(){
		frame = new JFrame("JButton Test");
		
		container = new Container();
		frame.getContentPane().add(container);
		
		this.mLabel = new JLabel();
		this.mLabel.setText("M");
		this.mLabel.setBounds(5, 12, 20, 20);
		this.mLabel.setVisible(false);
		container.add(this.mLabel);
		
		// result text field
		txt = new JTextField();
		txt.setBorder(null);
		txt.setText("0");
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setBounds(25,0,215,40);
		txt.setFocusable(false);
		txt.setEditable(false);
		container.add(txt);
		
		// function for memory
		int scaleNum = 60;
		
		ArrayList<Character> types = new ArrayList<Character>();
		types.add('7'); types.add('8'); types.add('9');
		types.add('4'); types.add('5'); types.add('6');
		types.add('1'); types.add('2'); types.add('3');
		types.add('0'); types.add('.'); types.add('C');
		
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				String operNm = String.valueOf(types.remove(0));
				
				createButton(operNm, 9 + j * scaleNum, 130 + (i * scaleNum), scaleNum, scaleNum);
			}
		}
		
		// operator Button
		divBtn = createButton("/", 0, 80, scaleNum, 43);
		mulBtn = createButton("*", scaleNum + 6, 80, scaleNum, 43);
		minusBtn = createButton("-", scaleNum * 2 + 12, 80, scaleNum, 43);
		plusBtn = createButton("+", scaleNum * 3, + 18, 80, scaleNum, 43);
		enterBtn = createButton("=", scaleNum * 3 + 18, 246, scaleNum, 124);
		createButton("←", scaleNum * 3 + 18, 123 + 6, scaleNum, 55);
        createButton("√", scaleNum * 3 + 18, 178 + 10, scaleNum, 55);
        
        frame.pack();
        frame.setSize(2774, 408);
        frame.setVisible(true);
	}
}
*/