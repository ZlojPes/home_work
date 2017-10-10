package jv17_05.pavliuk.lesson9;

import jv17_05.pavliuk.lesson10.library.Book;

import java.util.*;

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

    public void takeBook() {
        System.out.println("Reader " + fullName + " with ticket # " + readersTicketNumber + " took the book");
    }

    public void takeBook(String... names) {
        System.out.print("Reader " + fullName + " with ticket # " + readersTicketNumber + " took next books: " + Arrays.toString(names) + "\n");
    }

    public void takeBook(Book... books) {
        System.out.print("Reader " + fullName + " with ticket # " + readersTicketNumber + " took next books:");
        for (Book book : books) {
            System.out.print(book + "; ");
        }
        System.out.println();
    }

    public void returnBook() {
        System.out.println("Reader " + fullName + " with ticket # " + readersTicketNumber + " returned the book");
    }

    public void returnBook(String... names) {
        System.out.print("Reader " + fullName + " with ticket # " + readersTicketNumber + " returned next books: " + Arrays.toString(names) + "\n");
    }

    public void returnBook(Book... books) {
        System.out.print("Reader " + fullName + " with ticket # " + readersTicketNumber + " returned next books:");
        for (Book book : books) {
            System.out.print(book + "; ");
        }
        System.out.println();
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

    @Override
    public String toString() {
        return "Reader: " + fullName + "\nTicket #" + readersTicketNumber + "\nFaculty: " + faculty + "\nDate of Birth: " + dateOfBirth.get(Calendar.YEAR)
                + "/" + dateOfBirth.get(Calendar.MONTH) + "/" + dateOfBirth.get(Calendar.DATE) + "\nPhone: " + phoneNumber;
    }

    public static void main(String[] args) {
        LibraryMember user1 = new LibraryMember("Pavliuk Alexander", new GregorianCalendar(1982, 01, 05),
                380979553005L, "Java", 1);
        LibraryMember user2 = new LibraryMember("Ivanov Ivan", new GregorianCalendar(1988, 05, 01),
                380957894562L, "Java", 5);
        LibraryMember user3 = new LibraryMember("Petrov Petr", new GregorianCalendar(1977, 06, 17),
                380968766543L, "PHP", 7);

        LibraryMember[] registerBook = {user1, user2, user3};

        Book b1 = new Book("\"Thinking in Java\", Bruce Eckel");
        Book b2 = new Book("\"Head First Java\", K.Sierra, B.Bates");
        Book b3 = new Book("\"Head First Design Patterns\", E.Freeman, E.Robson");

        for (LibraryMember current : registerBook) {
            System.out.println(current);
            System.out.println();
        }
        user3.takeBook();
        user2.takeBook("Thinking in Java", "Head First Java");
        user1.takeBook(b1, b2, b3);
        user3.returnBook();
        user2.returnBook("Thinking in Java", "Head First Java");
        user1.returnBook(b1, b2, b3);
    }
}