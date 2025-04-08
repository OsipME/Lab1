import java.util.ArrayList;
import java.util.List;

public class AirportDemo {
    public static void main(String[] args) {
        // Создаем список самолетов
        List<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.add(new PassengerAircraft(150, 5000, "Flight A"));
        aircrafts.add(new CargoAircraft(10, 3000, "Flight B"));
        aircrafts.add(new PrivateJet(5, 1000, "Flight C"));

        // Задание 1.5: Вывод всех самолетов с количеством пассажиров меньше заданного
        int passengerLimit = 100; // Задаем лимит
        System.out.println("Самолеты с количеством пассажиров меньше " + passengerLimit + ":");
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getPassengerCount() < passengerLimit) {
                System.out.println(aircraft.getFlightName() + " - " + aircraft.getPassengerCount() + " пассажиров");
            }
        }

        // Задание 1.6: Вывод всех самолетов, название которых начинается с заданной буквы
        char startingLetter = 'F'; // Задаем букву
        System.out.println("\nСамолеты, название которых начинается с буквы " + startingLetter + ":");
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getFlightName().toUpperCase().charAt(0) == startingLetter) {
                System.out.println(aircraft.getFlightName());
            }
        }
    }
}
