package ex19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Calendario {

    public void exibirCalendario(int ano, int mes) {
        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        System.out.println(primeiroDia.getMonth() + " " + ano);
        for (int i = 1; i <= primeiroDia.lengthOfMonth(); i++) {
            System.out.println(i);
        }
    }

    public boolean verificarFeriado(LocalDate data) {
        // Exemplo de feriados fixos
        LocalDate natal = LocalDate.of(data.getYear(), 12, 25);
        return data.equals(natal);
    }

    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
