package jv17_05.pavliuk.lesson9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryMember {
    String fullName;
    int readersTicketNumber;
    String faculty;
    Calendar dateOfBirth;
    long phoneNumber;
    String bookName;

    LibraryMember(String fullName, Calendar dateOfBirth, long phoneNumber, String faculty, int readersTicketNumber) {
        this.fullName = fullName;
        this.readersTicketNumber = readersTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        bookName = null;
    }


    public void takeBook(String bookName) {
        if (this.bookName == null) {
            System.out.println("Reader " + fullName + " with ticket # " + readersTicketNumber + " got the book \"" + bookName + "\".");
            this.bookName = bookName;
        } else {
            System.out.println("You cannot take a book while you're holding another one!" + bookName);
        }
    }

    public void returnBook() {
        if (this.bookName != null) {
            System.out.println("Reader " + fullName + " with ticket # " + readersTicketNumber + " returned the book \"" + bookName + "\".");
            bookName = null;
        } else {
            System.out.println("There's no book to return!");
        }
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
                + "\\" + dateOfBirth.get(Calendar.MONTH) + "\\" + dateOfBirth.get(Calendar.DATE) + "\nPhone: " + phoneNumber;
    }

    public static void main(String[] args) {
        LibraryMember alex = new LibraryMember("Pavliuk Alexander", new GregorianCalendar(1982, 01, 05), 380979553005L, "Java", 1);
        LibraryMember other = new LibraryMember("Somebody Else", new GregorianCalendar(1988, 05, 01), 380957894562L, "Java", 5);
        LibraryMember[] registerBook = {alex, other};
        alex.takeBook("\"Thinking in Java\", Bruce Eckel");
        other.returnBook();
        other.takeBook("\"How to become a Java developer in 3 month and spend less than 200$\", dr. Poly Morphism (utopia)");
        alex.returnBook();
        System.out.println();
        for (LibraryMember current : registerBook) {
            System.out.println(current);
            System.out.println();
        }
    }
}

