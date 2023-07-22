package Shitta.dto.Response;

import Shitta.data.models.Event;
import Shitta.data.models.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@RequiredArgsConstructor
public class PackageResponse {
	private double packageWeightInGrammes;
	private User senderDetails;
	private User receiverDetails;
	private LocalDateTime timeCreated;
	private List<Event> status;
	private boolean payOnDelivery;
}
