/** класс реализует калькулятор
*/
public class Calculator {
	/** переменная для результата вычислений
	*/
	private int result; 
	
	/** суммируем аргументы
	@param params аргументы суммирования
	*/
	
	public void add(int... params) {
		for (Integer param : params) {
			result += param;
		}
	}
	
	/** получить результат
	*/
	
	public int getResult() {
		return this.result;
	}
	
	/** очистить результат вычислений 
	*/
	
	public void cleanResult() {
		this.result = 0;
	}
}