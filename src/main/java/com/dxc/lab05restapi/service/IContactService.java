package com.dxc.lab05restapi.service;

import com.dxc.lab05restapi.model.Contact;

import java.util.List;

public interface IContactService {
    void addContact(String name, String phone);
    List<com.dxc.lab05restapi.model.Contact> getAll();
}
