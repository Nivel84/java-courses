/**
* класс реализует калькулятор
*/
public class Calculator {
	/** 
	*переменная для результата вычислений
	*/
	private int result; 
	
	/** 
	*суммируем аргументы
	*@param params аргументы суммирования
	*/
	
	public void add(int... params) {
		for (Integer param : params) {
			result += param;
		}
	}
	
	/** 
	*вычетаем аргументы
	*@param params аргументы вычетания
	*/
	
	public void deduct(int... params) {
		result = params[0] - params[1];
	}
	
	/** 
	*умножаем аргументы
	*@param params аргументы умножения
	*/
	
	public void multiply(int... params) {
		result = params[0] * params[1];
	}
	
	/** 
	*делим аргументы, остаток отбрасывается
	*@param params аргументы деления
	*/
	
	public void devide(int... params) {
		result = params[0] / params[1];
	}
	
	/** 
	*получить результат
	*/
	
	public int getResult() {
		return this.result;
	}
	
	/** 
	*очистить результат вычислений 
	*/
	
	public void cleanResult() {
		this.result = 0;
	}
}