package ro.siit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// Concrete class for SamsungGalaxyS6
public class SamsungGalaxyS6 extends PhoneModel {
    private List<Contact> contacts = new ArrayList<>();
    private HashMap<String, ArrayList<Object>> messages = new HashMap<String, ArrayList<Object>>();
    private List<String> callHistory = new ArrayList<>();
    public SamsungGalaxyS6() {
        super("SamsungGalaxyS6", "Black", "Metal", 24, "123456789012345");
    }

    // Implement abstract methods from Phone interface
    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        // Implementation goes here
        contacts.add(new Contact(id, phoneNumber, firstName, lastName));
    }

    @Override
    public String getFirstContact() {
        // Implementation goes here
        return contacts.isEmpty() ? null : contacts.get(0).toString();
    }

    @Override
    public String getLastContact() {
        // Implementation goes here
        return contacts.isEmpty() ? null : contacts.get(contacts.size() - 1).toString();
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        // Implementation goes here
        messages.putIfAbsent(phoneNumber, new ArrayList<>());
        messages.get(phoneNumber).add(message);
    }

    @Override
    public String getFirstMessage(String phoneNumber) {
        // Implementation goes here
        List<Object> msgList = messages.get(phoneNumber);
        return msgList == null || msgList.isEmpty() ? null : (String) msgList.get(0);
    }

    @Override
    public String getSecondMessage(String phoneNumber) {
        // Implementation goes here
        List<Object> msgList = messages.get(phoneNumber);
        return msgList == null || msgList.size() < 2 ? null : msgList.get(1);
    }

    @Override
    public void call(String phoneNumber) {
        // Implementation goes here
        callHistory.add(phoneNumber);
    }

    @Override
    public List<String> viewHistory() {
        // Implementation goes here
        return new ArrayList<>(callHistory);
    }
}
