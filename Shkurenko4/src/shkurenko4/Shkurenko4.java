/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shkurenko4;

import java.util.Scanner;

/**
 *
 * @author Mebius
 */
public class Shkurenko4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Марафонец прошел S километров со скоростью V метров в секунду
		// (расстояние и скорость вводятся с клавиатуры). Определить, сколько
		// времени он был в пути (часов, минут, секунд)?
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите растояние которое прошел марафонец");
		double S = sc.nextDouble();
		System.out.println("Введите скорость марафонца");
		double V = sc.nextDouble();
		if (S > 0 && V > 0) {
			double T = S / V;
			double T1 = (int) T;//часов
			T1 = T1 * 10;
                        T1 = T1 + 2;
			
			System.out.println("Марафонец был в пути " + T1 );
			

		}
        
    }
    
}
