package reservations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class TicketReservation {

	private static final int CONFIRMEDLIST_LIMIT = 10;
	private static final int WAITINGLIST_LIMIT = 3;

	private static List<Passenger> confirmedList = new ArrayList<>();
	private static Deque<Passenger> waitingList = new ArrayDeque<>();

	public List<Passenger> getConfirmedList() {
		return confirmedList;
	}

	public static boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass,
			String confirmationNumber) {
		if (confirmedList.size() < CONFIRMEDLIST_LIMIT) {
			confirmedList.add(new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber));
			return true;
		} else if (waitingList.size() < WAITINGLIST_LIMIT) {
			waitingList.add(new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber));
			return true;
		}
		return false;
	}

	public static boolean cancel(String confirmationNumber) {
		for (Passenger passenger : confirmedList) {
			if (passenger.getConfirmationNumber() == confirmationNumber) {
				removePassenger(confirmedList.iterator(), passenger.getConfirmationNumber());
				if (!waitingList.isEmpty()) {
					confirmedList.add(waitingList.poll());
					removePassenger(waitingList.iterator(), confirmationNumber);
				}
				return true;
			}
		}
		return false;
	}

	public static boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {
		while (iterator.hasNext()) {
			if (iterator.next().getConfirmationNumber() == confirmationNumber) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
}