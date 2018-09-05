package ru.geekbrains.JL1HW;

public class Main {

	public static void main(String[] args) {

		System.out.println("Результат выражения (Task3) = " + task3(10, 5, 14, 7));
		System.out.println("Результат выражения (Task4) = " + task4(5,6));
		task5(-50);
		System.out.println("Результат (Task6) = " + task6(-10));
		task7("Вася");
	}

	public static void task2(String[] args){
		byte bt = 1; 									//Создание ​​переменных и инициализация ​​всех ​​пройденных ​т​ипов ​​данных
		short sh = 2;
		int v = 3500000;
		long l = 1500L;
		float f = 13.5f;
		double db = 193841;
		boolean bool = true;
		char ch = 'g';
	}


	static int task3(int a, int b, int c, int d) {			//Метод ​​вычисляющий ​​выражение ​​a​*​​(​b​​+​(​c​/​​​d))
    	return a * (b + (c / d));							//​​и ​​возвращающий ​​результат.
    	}

	static boolean task4(int x1, int x2) {
		 boolean bool;										//Метод принимающий на вход два числа, и проверяющий что их
		 return ((x1 + x2) >= 10 && (x1 + x2) <= 20); 		//​​сумма лежит в пределах от​​ 10 ​​до ​​20(включительно).
		}

	static void task5(int x){								//Метод, которому в качестве параметра передается целое число
		if (x >= 0) {										//на проверку положительное оно или отрицательное.
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
			}
	 	}

	static boolean task6(int k){							//Метод возвращает true, если число отрицательное.
		boolean bool2;
		return (k<=0);
	}

	static void task7 (String name1) {						//Метод выводми в консоль сообщение «Привет, указанное_имя!»
		System.out.println("Привет, " + name1 + "!");
		}
}



