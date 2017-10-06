package jv17_05.pavliuk.lesson9;

import java.util.Calendar;

public class LibraryMember {
    String fullName;
    int readersTicketNumber;
    String faculty;
    Calendar dateOfBirth;
    long phoneNumber;

    LibraryMember(String fullName, Calendar dateOfBirth, long phoneNumber, String faculty, int readersTicketNumber) {
        this.fullName = fullName;
        this.readersTicketNumber = readersTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String bookName) {
        System.out.println("Читатель " + fullName + " с номером билета " + readersTicketNumber + "получил книгу " + bookName);
    }

    public void returnBook(String bookName) {
        System.out.println("Читатель " + fullName + " с номером билета " + readersTicketNumber + "вернул книгу " + bookName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getReadersTicketNumber() {
        return readersTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}

