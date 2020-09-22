package reservations;

public class ReservationDemo {

	private static final String[] TRAVEL_CLASS = new String[] {"first-class", "business", "economy"};
	private static final String[] GENDER = new String[] {"male", "female", "trans"};
	private static int confirmationNumber = 0;
	private static Passenger[] passengers = new Passenger[] {
			new Passenger("john", "smith", 30, GENDER[0], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sally", "smith", 28, GENDER[1], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("fred", "jones", 32, GENDER[0], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sue", "jones", 33, GENDER[1], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("richard", "lopez", 24, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("francis", "harris", 47, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("john", "smith", 30, GENDER[0], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sally", "smith", 28, GENDER[1], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("fred", "jones", 32, GENDER[0], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sue", "jones", 33, GENDER[1], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("richard", "lopez", 24, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("francis", "harris", 47, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("john", "smith", 30, GENDER[0], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sally", "smith", 28, GENDER[1], TRAVEL_CLASS[1], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("fred", "jones", 32, GENDER[0], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("sue", "jones", 33, GENDER[1], TRAVEL_CLASS[0], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("richard", "lopez", 24, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++))),
			new Passenger("francis", "harris", 47, GENDER[2], TRAVEL_CLASS[2], String.valueOf(Integer.valueOf(confirmationNumber++)))
			};

	public static void main(String[] args) {
		

		System.out.println("Reserving tickets...");
		for (Passenger passenger : passengers) {
			if (Math.random() < .9) {
				TicketReservation.bookFlight(passenger.getFirstName(), passenger.getLastName(), passenger.getAge(), passenger.getGender(),
						passenger.getTravelClass(), passenger.getConfirmationNumber());
				System.out.println(passenger.getFirstName() + " added reservation.");
			} else {
				TicketReservation.cancel(passenger.getConfirmationNumber());
				System.out.println(passenger.getFirstName() + " canceled reservation.");
			}
		}
	}
}
