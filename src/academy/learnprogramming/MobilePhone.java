package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        myContacts=new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact) != -1) {
            return false;
        }
        return myContacts.add(contact);
    }

    public boolean updateContact(Contact contactOld, Contact contactNew){
        if (findContact(contactOld) >= 0) {
            myContacts.set(findContact(contactOld), contactNew);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        return myContacts.remove(contact);
    }

    private int findContact(String name){
        for (int i=0;i<myContacts.size();i++) {
            if (name.equals(myContacts.get(i).getName()))
                return i;
        }
        return -1;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    public Contact queryContact(String name){
        for (int i=0;i<myContacts.size();i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i=0;i<myContacts.size();i++) {
            System.out.println(i+1+". "+myContacts.get(i).getName() + "  " + myContacts.get(i).getPhoneNumber());
        }
    }

}
