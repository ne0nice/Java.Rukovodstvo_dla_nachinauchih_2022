package lesson_1;

public class DumeMetr {
        public static void main(String[] args) {
            double inch, metrs;
            int counter;
            counter = 0;

            for (inch = 1; inch <= 100; inch++){
                metrs = inch * 39.37;
                System.out.println(metrs + " дюйма соответвует " + inch + " метру");
                counter++;
                if (counter == 12){
                    System.out.println();
                    counter =0
                }
            }
        }
    }
