package racingcar.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.utils.ConstantNum.*;

public class Validation {
	public static void LESS_MORE_NAME_ERROR(List<String> carsList) {
		for (int i = 0; i < carsList.size(); i++) {
			if (carsList.get(i).length() < CAR_NAME_LENGTH_MIN || carsList.get(i).length() > CAR_NAME_LENGTH_MAX) {
				throw new IllegalArgumentException(Message.LESS_MORE_NAME_ERROR);
			}
		}
	}

	public static void CONTAIN_SAME_NAME_ERROR(List<String> carsList) {
		Set<String> carsSet = new HashSet<String>();
		for (int i = 0; i < carsList.size(); i++) {
			carsSet.add(carsList.get(i));
		}

		if (carsSet.size() < carsList.size()) {
			throw new IllegalArgumentException(Message.CONTAIN_SAME_NAME_ERROR);
		}
	}

	public static void WHITE_SPACE_NAME_ERROR(List<String> carsList) {
		for (int i = 0; i < carsList.size(); i++) {
			if (carsList.get(i).trim().isEmpty()) {
				throw new IllegalArgumentException(Message.WHITE_SPACE_NAME_ERROR);
			}
		}
	}

	public static void NON_NUMERIC_GAME_COUNT_ERROR(String stringGameCount) {
		for (int i = 0; i < stringGameCount.length(); i++) {
			if (stringGameCount.charAt(i) < STRING_GAME_COUNT_MIN || STRING_GAME_COUNT_MAX < stringGameCount.charAt(
					i)) {
				throw new IllegalArgumentException(Message.NON_NUMERIC_GAME_COUNT_ERROR);
			}
		}
	}

	public static void ZERO_GAME_COUNT_ERROR(String stringGameCount) {
		if (stringGameCount.equals(ZERO_GAME_COUNT)) {
			throw new IllegalArgumentException(Message.ZERO_GAME_COUNT_ERROR);
		}
	}
}
