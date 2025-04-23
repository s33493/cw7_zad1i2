public class main {
    public static void main(String[] args) {

        car auto = new car(5);


        auto.start();
        auto.stop();


        System.out.println("Liczba miejsc w samochodzie: " + auto.getNumberOfSeats());
    }
}
