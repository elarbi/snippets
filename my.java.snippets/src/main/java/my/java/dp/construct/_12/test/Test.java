package my.java.dp.construct._12.test;

import java.util.HashMap;

import my.java.dp.construct._12.LinuxButton;
import my.java.dp.construct._12.LinuxWidgetFactory;
import my.java.dp.construct._12.WindowsButton;
import my.java.dp.construct._12.WindowsWidgetFactory;



public class Test {
	public static void main(String[] args) {
		
		LinuxButton bw1 = new LinuxWidgetFactory().createButton();
		
		WindowsButton wB1 = new WindowsWidgetFactory().createButton();
		
		
	}

}
