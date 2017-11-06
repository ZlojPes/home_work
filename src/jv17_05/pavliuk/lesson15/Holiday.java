package jv17_05.pavliuk.lesson15;

import java.text.*;
import java.util.*;

public class Holiday {
    private Calendar calendar;
    private String name;

    public Holiday(Calendar calendar, String name) {
        this.calendar = calendar;
        this.name = name;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM", customDateFormatSymbols);
        return String.format("%-13s%s", dateFormat.format(calendar.getTime()), name);
    }

    private static DateFormatSymbols customDateFormatSymbols = new DateFormatSymbols() {
        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }
    };

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holiday holiday = (Holiday) o;

        if (calendar != null ? !calendar.equals(holiday.calendar) : holiday.calendar != null) return false;
        return name != null ? name.equals(holiday.name) : holiday.name == null;
    }

    @Override
    public int hashCode() {
        int result = calendar != null ? calendar.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Holiday newYear = new Holiday(new GregorianCalendar(2017, 0, 1), "Новый Год");
        Holiday christmas = new Holiday(new GregorianCalendar(2017, 0, 7), "Рождество Христово");
        Holiday march8th = new Holiday(new GregorianCalendar(2017, 2, 8), "Международный женский день");
        Holiday easter = new Holiday(new GregorianCalendar(2017, 3, 16), "Пасха");
        Holiday may1st = new Holiday(new GregorianCalendar(2017, 4, 1), "праздник Весны и Труда");
        Holiday may2nd = new Holiday(new GregorianCalendar(2017, 4, 2), "праздник Весны и Труда");
        Holiday victoryDay = new Holiday(new GregorianCalendar(2017, 4, 9), "День Победы");
        Holiday trinity = new Holiday(new GregorianCalendar(2017, 5, 4), "Троица");
        Holiday constitutionDay = new Holiday(new GregorianCalendar(2017, 5, 28), "День Конституции");
        Holiday independenceDay = new Holiday(new GregorianCalendar(2017, 7, 24), "День Независимости");
        Holiday defenderDay = new Holiday(new GregorianCalendar(2017, 9, 14), "День Защитника Украины");
        Holiday[] holidays = {newYear, christmas, march8th, easter, may1st, may2nd, victoryDay, trinity, constitutionDay, independenceDay, defenderDay};
        System.out.println("Список государственных праздников Украины в 2017 году");
        System.out.printf("%-13s%s%n", "Дата", "Праздник");
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }
}
