package com.company.tasks7;


import java.util.Calendar;

public class Task_13_11 {
    public static void main(String[] args) {
        Worker[] workers = new Worker[20];
        workers[0] = new Worker("Ivanov", "Ivan", "Ivanovich", "Naberegnay d.15", 5, 2014);
        workers[1] = new Worker("Ivanov", "Ivan", "Ivanovich", "Naberegnay d.15", 5, 2013);
        workers[2] = new Worker("Petrov", "Petr", "Ivanovich", "Ilinskay d.4", 4, 2012);
        workers[3] = new Worker("Sidorov", "Ily", "Zaharovich", "Naberegnay d.13", 2, 2011);
        workers[4] = new Worker("Lukachin", "Aleksandr", "Valentinovich", "Komsomolskay d.3", 3, 2010);
        workers[5] = new Worker("Ivanov", "Vasiliy", "Aleksandrovich", "Petrovskay d.11", 4, 2009);
        workers[6] = new Worker("Lykshin", "Vladimir", "Aleksandrovich", "Zlotskay d.3", 6, 2008);
        workers[7] = new Worker("Nesterenko","Maxim", "Sergeevich", "Derginskogo d.5", 6, 2007);
        workers[8] = new Worker("Tygko", "Anastasy", "Petrova", "Gagarina d.5", 6, 2006);
        workers[9] = new Worker("Rudin", "Leonid", "Troynovich", "Naberegnay d.11", 2, 2006);
        workers[10] = new Worker("Ivanov", "Rinat", "Olegovich", "Preobragenskay d.3", 6, 2007);
        workers[11] = new Worker("Govrikjd", "Stepan", "Ivanovich", "Ujnay d.3", 1, 2008);
        workers[12] = new Worker("Sidoruk", "Ivan", "Maximovich", "Uezdnay d.4", 3, 2009);
        workers[13] = new Worker("Lysikova", "Polina", "Sergeevna", "Chehova d.2", 4, 2010);
        workers[14] = new Worker("Mashnin", "Uliana", "Vladimirovna", "Vostaniy d.4", 8, 2011);
        workers[15] = new Worker("Musin", "Anton", "Valintinovich", "Naberegnay d.5", 6, 2012);
        workers[16] = new Worker("Ivanov", "Ivan", "Ivanovich", "Naberegnay d.15", 5, 2013);
        workers[17] = new Worker("Gubin", "Valera", "Ivanovich", "Petrovskay d.5", 11, 2008);
        workers[18] = new Worker("Ivanov", "Ivan", "Ivanovich", "Naberegnay d.15", 5, 2014);
        workers[19] = new Worker("Makeev", "Aleksandr", "Ivanovich", "Vladicha d.5", 4, 2013);

//        Searcher.experienceSearch(workers, 4);
        Searcher.stringSearch(workers, "Ee");
    }

    public static class Searcher{
        public static void experienceSearch(Worker[] workers, int n){
            for(Worker curWorker : workers){
                if(curWorker.getExperience() >= n){
                    System.out.println(curWorker);
                }
            }
        }

        public static void stringSearch(Worker[] workers, String string){
            for(Worker curWorker : workers){
                String curWorkerLine = curWorker.firstName + curWorker.lastName;
                if(curWorker.middleName != null){
                    curWorkerLine += curWorker.middleName;
                }
                String regexp = "(?iu).*" + string + ".*";
                if(curWorkerLine.matches(regexp)){
                    System.out.println(curWorker);
                }
            }
        }
    }

    public static class Worker{
        private String firstName;
        private String lastName;
        private String middleName;
        private String address;
        private int month;
        private int year;

        public Worker(String firstName, String lastName, String middleName, String address, int month, int year) {
            this(firstName, lastName, address, month, year);
            this.middleName = middleName;
        }

        public Worker(String firstName, String lastName, String address, int month, int year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.month = month;
            this.year = year;
        }

        public int getExperience(){
            int nowYear = Calendar.getInstance().get(Calendar.YEAR);
            int nowMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int result = nowYear - this.year;
            if(this.month > nowMonth){
                result--;
            }

            return result;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", address='" + address + '\'' +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }
    }

}
