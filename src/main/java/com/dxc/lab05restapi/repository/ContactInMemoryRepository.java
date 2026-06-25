package com.dxc.lab05restapi.repository;

import com.dxc.lab05restapi.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactInMemoryRepository implements  IContactRepository{

    private  List<Contact> contacts = new ArrayList<>();


    public  ContactInMemoryRepository(){

        contacts.add(new Contact("Nikhil","12344567890"));
        contacts.add(new Contact("Rithaj","12444567890"));
    }
    @Override
    public void addContact(String name, String phone) {

        contacts.add(new Contact(name, phone));
    }

    @Override
    public List<Contact> getAll() {

        return  contacts;
    }




}
