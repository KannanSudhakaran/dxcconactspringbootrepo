package com.dxc.lab05restapi.service;

import com.dxc.lab05restapi.model.Contact;
import com.dxc.lab05restapi.repository.IContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements  IContactService {

    private IContactRepository contactRepository;

    public  ContactServiceImpl(IContactRepository repository)
    {
        this.contactRepository=repository;
    }

    @Override
    public void addContact(String name, String phone) {

        if(name==null || name.isEmpty()){
            throw  new IllegalArgumentException("Name cannot be null or empty");
        }
        if(phone==null || phone.isEmpty()){
            throw  new IllegalArgumentException("Phone cannot be null or empty");
        }
        if(!phone.matches("\\d{10}")){
            throw  new IllegalArgumentException("Phone number must be 10 digits");
        }

      boolean duplicatePhoneEntry=  contactRepository.getAll()
                .stream()
                .anyMatch(contact ->  contact.getPhone().equals(phone));


        if(duplicatePhoneEntry)
            throw new IllegalArgumentException("Duplicate phone entry is not allowed");


        contactRepository.addContact(name,phone);
        //email...
        //flow..business...

    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.getAll();
    }
}
