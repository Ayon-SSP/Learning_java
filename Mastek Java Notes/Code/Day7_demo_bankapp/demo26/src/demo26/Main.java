package demo26;

import com.training.demo.model.Line;
import com.training.demo.model.Shape;

public class Main {

	public static void main(String[] args) {
		// Below line gives an error as Shape is an abstract class

//		Shape shape = new Shape("Some shape");
		Shape shape=new Line("Line",10,20);
		System.out.println(shape.draw());

	}

}
