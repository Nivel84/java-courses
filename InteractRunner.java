import java.util.Scanner;

/** класс для запуска аклькулятора. поддреживает ввод ользователя
*/

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Select opetation: <add, deduct, multiply, devide>");
				String select = reader.next();
				System.out.println("Enter first arg:");
				String first = reader.next();
				System.out.println("Enter second arg:");
				String second = reader.next();
				switch(select) {
					case "add":
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "deduct":
						calc.deduct(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "multiply":
						calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "devide":
						calc.devide(Integer.valueOf(first), Integer.valueOf(second));
						break;
				}
				
				System.out.println("Result: " + calc.getResult());
				System.out.println("Clean result or use: <yes/no>");
				String choose = reader.next();
				if (choose.equals("yes")) {
					calc.cleanResult();
				}
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally{
			reader.close();
		}
	}
}