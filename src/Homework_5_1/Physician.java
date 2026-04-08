package Homework_5_1;

/*
Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» с полем «План лечения» и полем «Доктор».
Создать объект класса «Пациент» и добавить пациенту план лечения.
У терапевта создать метод, который будет назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить;
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
*/

public class Physician extends Clinic {

    public void appointment(Patient patient) {
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Physician physician = new Physician();
        if (patient.treatmentPlan == 1) {
            System.out.println("Назначаю Вам хирурга");
            surgeon.treat();
            patient.appointedDoctor = "Хирург";
        }
        if (patient.treatmentPlan == 2) {
            System.out.println("Назначаю Вам дантиста");
            dentist.treat();
            patient.appointedDoctor = "Дантист";
        }
        if (patient.treatmentPlan != 1 & patient.treatmentPlan != 2) {
            System.out.println("Назначаю Вам терапевта");
            physician.treat();
            patient.appointedDoctor = "Терапевт";
        }
    }

    @Override
    public void treat() {
        System.out.println("Терапевт диагностирует и лечит широкий спектр заболеваний внутренних органов, не требующих хирургического вмешательства.\nЛечение включает сбор анамнеза, осмотр (прослушивание, пальпацию), назначение анализов (кровь, моча, УЗИ)\nи назначение лекарств или направление к узким специалистам.");
    }
}
