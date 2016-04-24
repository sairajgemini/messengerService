package org.koushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	static{
		if (messages.size() == 0) {
			messages.put(1L, new Message(1L, "Hello World!!!", "Koushik"));
			messages.put(2L, new Message(2L, "Hello Jersey!!!", "Saikat"));
		}
	}

	static{
		if (profiles.size() == 0) {
			profiles.put("koushik", new Profile(1L, "koushik", "Hello Koushik!!!", "Koushik"));
			profiles.put("saikat", new Profile(2L, "saikat", "Hello Saikat!!!", "Saikat"));
		}
	}
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
