package com.example.skillboxthirdtask.listner;

import com.example.skillboxthirdtask.model.Contact;
import com.example.skillboxthirdtask.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DatabaseContactCreator {

    private final ContactService contactService;

    // будет вызван после старта приложения и настройки контекста для предсоздания списка контактов
    // (если закоммитить - не будут создаваться))
    @EventListener(ApplicationStartedEvent.class)
    public void createContactData() {
        log.debug("Calling DatabaseContactCreator -> createContactData ...");
        List<Contact> contacts = new ArrayList<>();
        // создаем автоматом список из 10 контактов
        for (int i = 0; i < 10; i++) {
            int value = i + 1;
            Contact contact = new Contact();
            contact.setId((long) value);
            contact.setFirstName("FirstName " + value);
            contact.setLastName("LastName " + value);
            contact.setEmail("Email " + value);
            contact.setPhone("Phone " + value);
            contacts.add(contact);
        }
        // создаем контакты в БД
        contactService.bathInsert(contacts);
    }
}
