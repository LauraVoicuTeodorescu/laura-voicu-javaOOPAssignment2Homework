package ro.siit;

import java.util.List;

// Interface for Phone
public interface Phone {
    void addContact(String id, String phoneNumber, String firstName, String lastName);
    String getFirstContact();
    String getLastContact();
    void sendMessage(String phoneNumber, String message);
    String getFirstMessage(String phoneNumber);
    String getSecondMessage(String phoneNumber);
    void call(String phoneNumber);
    List<String> viewHistory();
}
