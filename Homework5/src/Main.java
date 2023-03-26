import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double marsGravity = 3.721;
                double earthGravity = 9.80665;
                double fuelRatio = 100;
        
                System.out.print("Введите вес груза в кг: ");

                double cargoWeight = input.nextDouble();

                double fuelWeight = cargoWeight * (marsGravity/earthGravity) * fuelRatio;

                System.out.println("Что бы доставить " + cargoWeight + " кг на марс " + fuelWeight + " кг" +
                        " топлива необходимо");
            }
        }

