package com.manha.date;

// Crie uma classe Data.
// A classe conterá, além dos construtores que você considera apropriados,
// métodos de acesso e o método toString, conforme explicamos no exercício anterior,
// um método para verificar se a data está correta e outro para adicionar um dia ao valor atual da data.
// A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Date {
    private LocalDate date;

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public Date(String date) {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    boolean isValid() {
        try {
            LocalDate.parse(toString(), DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public void addDay() {
        this.date = date.plusDays(1);
    }

    @Override
    public String toString() {
        List<String> list = Arrays.asList(date.toString().split("-"));
        Collections.reverse(list);
        return String.join("/", list);
    }
}
