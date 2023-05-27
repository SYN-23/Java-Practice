package com.company;

public class contact {
    public static void main(String[] args) {
       contactList contactList1=new contactList("Sayan",8230001125L,"sayandas12375@gmail.com","Baguiati");
       contactList contactList2=new contactList("Anindita",23560442,"sarkarAnindita55@gmail.com","Ichapur");
        contactList1.allDetails();
        System.out.println(" ");
        contactList2.allDetails();

    }

    public static class contactList{
      String Name;
      long phoneNumber;
      String gmailID;
      String Address;

      contactList(String name,long phoneNumber,String gmailID,String Address){
          this.Name=name;
          this.phoneNumber=phoneNumber;
          this.gmailID=gmailID;
          this.Address=Address;
      }

        public String getName() {
            return Name;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public String getGmailID() {
            return gmailID;
        }

        public String getAddress() {
            return Address;
        }

        public void allDetails(){
            System.out.println("Name: "+getName());
            System.out.println("Phone No: "+getPhoneNumber());
            System.out.println("Email Address : "+getGmailID());
            System.out.println("Address : "+getAddress());
        }
    }
}

