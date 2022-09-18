package lesson_1;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litters;
        int counter;
        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854;
            System.out.println(gallons + " галлона соответвует " + litters + " литру");
            counter++;
            if (counter == 10){
                System.out.println();
                counter =0;
            }
            }
        }
    }

