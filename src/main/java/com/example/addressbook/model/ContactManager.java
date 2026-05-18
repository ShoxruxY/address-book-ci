package com.example.addressbook.model;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements IContactDAO {
    private IContactDAO contactDAO;
    public ContactManager(IContactDAO contactDAO){
        this.contactDAO = contactDAO;
    }

    @Override
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Override
    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactDAO.deleteContact(contact);
    }

    @Override
    public Contact getContact(int id) {
        return contactDAO.getAllContacts().get(id);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactDAO.getAllContacts();
    }

    public List<Contact> searchContacts(String query){
        if(query == null || query.isEmpty()){
            return contactDAO.getAllContacts();
        }
        query = query.toLowerCase();
        ArrayList<Contact> results = new ArrayList<>();
        for(Contact contact: contactDAO.getAllContacts()){
            String searchString = contact.getFullName().toLowerCase() +
                    contact.getEmail().toLowerCase() + contact.getPhone().toLowerCase();
            if(searchString.contains(query)){
                results.add(contact);
            }
        }
        return results;
    }
}
