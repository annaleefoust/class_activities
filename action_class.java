package bubble_pkg;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class action_class {

		
		public void doBubbleSort(JTextField textField, JTextArea resultArea) {
		String input = textField.getText().trim();
		if (input.isEmpty()) {
		resultArea.setText("Please enter some numbers!");
		return;
		}
		
		try {
			resultArea.setText("");
			String[] tokens = input.split(",");
			int[] num = new int[tokens.length];
			for (int i = 0; i < tokens.length; i++) {
			num[i] = Integer.parseInt(tokens[i].trim());
			}
			resultArea.append("Before Bubble sort:\n");
			for (int i=0; i<tokens.length; i++) {
			resultArea.append(num[i] + " ");
			}
			resultArea.append("\n");

			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				}
				}
				}
				resultArea.append("After Bubble Sort:\n");
				for (int i=0; i<tokens.length; i++) {
				resultArea.append(num[i] + " ");
				}
				} catch (NumberFormatException ex) {
				resultArea.setText("Invalid input! Please enter integers separated by commas.");
				}}}

