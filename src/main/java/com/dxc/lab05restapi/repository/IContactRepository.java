package com.dxc.lab05restapi.repository;


import com.dxc.lab05restapi.model.Contact;

import java.util.List;

public interface IContactRepository {
    void addContact(String name, String phone);
     List<Contact> getAll();
}
