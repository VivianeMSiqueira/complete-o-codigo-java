package br.com.felixgilioli.exercicios.facil;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalDatesTest {

    @Test
    void getQuantidadeDeDiasEntreDatas_test01() {
        LocalDate inicio = LocalDate.of(2020, 5, 1);
        LocalDate fim = LocalDate.of(2020, 5, 12);
        long quantidadeDeDiasEntreDatas = LocalDates.getQuantidadeDeDiasEntreDatas(inicio, fim);
        assertEquals(11, quantidadeDeDiasEntreDatas);
    }

    @Test
    void getQuantidadeDeDiasEntreDatas_test02() {
        LocalDate inicio = LocalDate.of(1980, 1, 10);
        LocalDate fim = LocalDate.of(2020, 5, 30);
        long quantidadeDeDiasEntreDatas = LocalDates.getQuantidadeDeDiasEntreDatas(inicio, fim);
        assertEquals(14751, quantidadeDeDiasEntreDatas);
    }

    @Test
    void getQuantidadeDeDiasEntreDatas_test03() {
        LocalDate inicio = LocalDate.of(2021, 5, 12);
        LocalDate fim = LocalDate.of(2021, 12, 31);
        long quantidadeDeDiasEntreDatas = LocalDates.getQuantidadeDeDiasEntreDatas(inicio, fim);
        assertEquals(233, quantidadeDeDiasEntreDatas);
    }

    @Test
    void getQuantidadeDeDiasEntreDatas_test04() {
        LocalDate inicio = LocalDate.of(2021, 5, 12);
        LocalDate fim = LocalDate.of(2021, 1, 1);
        long quantidadeDeDiasEntreDatas = LocalDates.getQuantidadeDeDiasEntreDatas(inicio, fim);
        assertEquals(131, quantidadeDeDiasEntreDatas);
    }

    @Test
    void getQuantidadeDeDiasEntreDatas_test05() {
        LocalDate inicio = LocalDate.of(2021, 5, 12);
        LocalDate fim = LocalDate.of(2021, 5, 12);
        long quantidadeDeDiasEntreDatas = LocalDates.getQuantidadeDeDiasEntreDatas(inicio, fim);
        assertEquals(0, quantidadeDeDiasEntreDatas);
    }
}