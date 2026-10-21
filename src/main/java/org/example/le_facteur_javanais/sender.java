package org.example.le_facteur_javanais;

public class sender {
    Address sender_address;
    String name;

    public void setSender_address(Address sender_address) {
        this.sender_address = sender_address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getSender_address() {
        return sender_address;
    }

    public String getName() {
        return name;
    }
}
