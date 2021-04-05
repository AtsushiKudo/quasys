package tool;

import java.util.ArrayList;
import java.util.List;

public class Validation {

	public static String textValidation(int maxNum, String inputText) {


		if(inputText.isEmpty()) {
			return "空白の項目が含まれています。";
		}

		if(inputText.length() > maxNum) {
			return maxNum + "文字以上入力されています。";
		}
		return null;
	}
}
