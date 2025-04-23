public class car extends Vehicle {

        private int numberOfSeats;

        public car(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }
        @Override
    public void start() {
        System.out.println("Silnik samochodu został uruchomiony");
        System.out.println("Sprawdzam poziom paliwa...");
        System.out.println("Wszystkie systemy są gotowe");
    }

    @Override
    public void stop() {
        System.out.println("Wyłączam silnik samochodu");
        System.out.println("Aktywuję hamulec postojowy");
        System.out.println("Samochód został bezpiecznie zatrzymany");
    }
}



