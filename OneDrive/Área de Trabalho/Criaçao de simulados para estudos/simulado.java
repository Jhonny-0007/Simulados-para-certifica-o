// 1 - Does the code below compile and run?


import java.util.ArrayList;
import java.util.List;

public class simulado {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		List<String> a = new ArrayList<String>();
		
		a.add("baby");
		s.add("love");
		a.add("baby");
		s.add("245");
		a.add("baby");
		s.add("black");
		a.add("baby");
		s.add("block");
		a.add("baby");
		s.add("all");
		a.add("baby");
		
		for(String ss : s) {
			for(String aa : a) {
				System.out.println(aa);
			}
			System.out.println(ss);
		}
		
	}

}

/*
 * a) Does not compile
 * 
 * b) Compiles and prints only the array s
 * 
 * c) Error on line 16
 * 
 * d) Compiles and prints both arrays
 * 
 * e) It is not the correct form of a foreach
 */




// 2 - Which of the following words is not reserved in Java?

/*
 * a) strictfp
 * 
 * b) native
 * 
 * c) volatile
 * 
 * d) transient
 * 
 * e) instanceOf
 */


 // 3 - Consider the following Java code snippet. What will be the output when this code is compiled and executed?


 public class simulado {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
 }

 /*
 * a) 1 2 3 4 5
 * 
 * b)  6 7 8 9 10
 * 
 * c) 5 6 7 8 9
 * 
 * d) 10 9 8 7 6
 * 
 * e) 11 12 13 14 15
 */



 // 4 - What will be the result when this code is compiled and executed?


 class Shape {
    void draw() {
        System.out.print("Drawing a shape. ");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.print("Drawing a circle. ");
    }
}

public class PolymorphismExercise {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Shape();
        shapes[2] = new Circle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


 /*
 * a) Drawing a shape. Drawing a circle. Drawing a shape.
 * 
 * b)  Drawing a circle. Drawing a shape. Drawing a circle.
 * 
 * c) Drawing a circle. Drawing a circle. Drawing a shape.
 * 
 * d) Drawing a shape. Drawing a shape. Drawing a circle.
 * 
 * e) Compilation Error
 */




// 5 - Consider the following Java code snippet that involves exception handling. What will be the output when this code is compiled and executed?

public class ExceptionHandlingExercise {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

/*
 * a) 5
Array index out of bounds.
Finally block executed.
 * 
 * b)  Array index out of bounds.
Finally block executed.
 * 
 * c)  3
Array index out of bounds.
 * 
 * d) Compilation Error
 * 
 * e) Runtime Error
 */


// 6 - What will be the output when this code is compiled and executed?

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExercise {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();
    }
}


/*
 * a) 1 2 3 1 2 3
 * 
 * b) 1 1 2 2 3 3
 * 
 * c) 1 2 3
 * 
 * d) Compilation Error
 * 
 * e) Runtime Error
 */


// 7 - What is the output of the code below?

public class CompilationErrorExercise {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana"};
        for (int i = 0; i <= fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}

/*
 * a) Compiles and ArrayIndexOutOfBoundsException
 * 
 * b) Incompatible types: int cannot be compared to String
 * 
 * c) Syntax Error: Missing semicolon
 * 
 * d) Compilation Error
 * 
 * e) Compile and run
 */



// 8 - What is the output of the program next?

public class CompilationErrorExercise {
    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        System.out.println(result);
    }

    int addNumbers(int a, int b) {
        return a + b;
    }
}

/*
 * a) Does not compile
 * 
 * b) Compile and run
 * 
 * c) Compile runs and prints 3
 * 
 * d) Runtime Error
 */


 // 9 - 