/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shkurenko2;

import java.util.Scanner;

/**
 *
 * @author Mebius
 */
public class Shkurenko2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Zadanie 1
        
        int n1 = 23;
        int n2 = 120;
        int n3 = 11;
        double r = (n1 + n2 + n3)/3    ;
        System.out.println(r);
        */
        //Zadanie 2
        /*
        System.out.println("Корень линейного уравнения ax + b = 0");
        System.out.println("Если a=b=0, то уравнение имеет бесконечное множество решений");
        System.out.println("Если a=0, b не = 0, то уравнение не имеет решений");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        double c;
        c = -( b / a );
        System.out.println("Корень линейного уравнения x = " + c);
        */
        //Zadanie 3 не сделал
        /*
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int stepen = scanner.nextInt();
        System.out.println("Число которое следует возвести в степень = " + number);
        System.out.println("Число которое будет возводить в степень = " + stepen);
        int rez = (stepen)^ number;
        System.out.println("Результат работы программы = " + rez);
        */
        //Zadanie 4
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста радиус окружности");
        double radius = scanner.nextDouble();
        double p = 3.14;
        double P = p * 2 * radius;
        double S = p * (radius * radius);
        System.out.println("Длина окружности = " + P + ",а площадь круга = " + S + ".");
        */
        //Zadanie 5
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество гривен у Вас");
        double grivna = scanner.nextDouble();            
        System.out.println("Введите курс Евро к Гривне");
        double kurse = scanner.nextDouble();
        System.out.println("Введите курс Доллара к Гривне");
        double kursd = scanner.nextDouble();
        System.out.println("Введите курс Рубля к Гривне");
        double kursr = scanner.nextDouble();
        double re = grivna / kurse;
        double rd = grivna / kursd;
        double rr = grivna / kursr;
        System.out.println("Итого у Вас получится = " + re + " Евро," + " или " + rd + " Долларов, " + "или " + rr + " рублей.");
        */
        //Zadanie 6
        /*
        Написать программу, которая переводит километры в сухопутные и морские мили. 
        */
        /*
        double km = 1;// Километры
        double sm = km/1.609;// Сухопутная миля
        double mm = km/1.852;//Морская миля 
        //Zadanie 7
        /*
        Написать программу, которая находит процент P от суммы S. 
        */
        /*
        double a = 3;
        double b = 4;
        double S = (a + b);
        double P = 5;
        P = (S/100)*P;
        System.out.println("Процент = " + P);
        */
        //Zadanie 8
        /*
        8.	Написать программу для определения диаметра окружности, 
        которую можно получить из отрезка проволоки длиной Х (X задает пользователь с клавиатуры).
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество проволоки");
        double X = scanner.nextDouble();
        double P = 3.14;
        double otvet = X/P;
        System.out.println("Диаметр окружности из " + X + " проволоки = " + otvet);
        
        //Zadanie 9
        /*
        Написать программу, которая переводит указанное 
        количество градусов по Цельсию в градусы по шкале Фаренгейта, Кельвина, Реомюра и Делиля. 
        Затем реализовать перевод из градусов по Фаренгейту в градусы по Цельсию.
        */
        /*
        double gc = 12;//градусы по Цельсию
        double gf = 0;//градусы по Фаренгейту
        double gk = 0;//градусы по Кельвину
        double gp = 0;//градусы по Реомюру
        double gd = 0;//градусы по Делилу
        gf = (gc * 1.8) + 32;
        System.out.println(gf + "'");
        gk = gc + 273.15;
        System.out.println(gk + "'");
        gp = gc * 4 /5;
        System.out.println(gp + "'");
        gd = (100 - gc) * 3 / 2;
        System.out.println(gd + "'");
        gc = 0;//градусы по Цельсию
        gf = 0;//градусы по Фаренгейту
        gc = (gf - 32) / 1.8;
        System.out.println(gc + "'");
        //Zadanie 10
        /*
        Поменять местами значения переменных a и b, 
        сначала с использованием дополнительной третьей переменной, а затем – без.
        */
        /*
        double a = 12;
        double b = 13;
        double c = 0;
        System.out.println( "Число a = " + a + " Число b = " + b );
        //System.out.println("Меняем число a и b местами");
        c=a;
        a=b;
        b=c;
        System.out.println( "Число a = " + a + " Число b = " + b );
        a = 20;
        b = 15;
        System.out.println( "Число новое a = " + a + " Число новое b = " + b );
        System.out.println("Меняем число a и b местами без c");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println( "Число a = " + a + " Число b = " + b );
        
    }
    
}
