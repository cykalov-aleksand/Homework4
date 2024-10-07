import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------Задание №1-----------------");
        byte standartAge = 18;
        byte agePerson = 15;
        if (agePerson >= standartAge) {
            System.out.println("Если возраст человека равен " + agePerson + " годам, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + " годам, то он не достиг совершеннолетия, нужно немного подождать.");
        }
        agePerson = 18;
        if (agePerson >= standartAge) {
            System.out.println("Если возраст человека равен " + agePerson + " годам, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + " годам, то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("---------------Задание №2-----------------");
        byte standartTemperature = 5;
        byte inputTemperature = -5;
        if (inputTemperature <= standartTemperature) {
            System.out.println("На улице " + inputTemperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + inputTemperature + " градусов, можно идти без шапки.");
        }
        inputTemperature = 7;
        if (inputTemperature <= standartTemperature) {
            System.out.println("На улице " + inputTemperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + inputTemperature + " градусов, можно идти без шапки.");
        }

        System.out.println("------------Задание №3--------------------");
        byte standartSpeed = 60;
        byte speedCars = 60;
        if (speedCars > standartSpeed) {
            System.out.println("если скорость " + speedCars + " км/час, придется заплатить штраф.");
        } else {
            System.out.println("если скорость " + speedCars + " км/час, то можно ездить спокойно.");
        }
        speedCars = 61;
        if (speedCars > standartSpeed) {
            System.out.println("если скорость " + speedCars + " км/час, придется заплатить штраф.");
        } else {
            System.out.println("если скорость " + speedCars + " км/час, то можно ездить спокойно.");
        }

        System.out.println("---------Задание №4----------------------");
        byte agePersona = 3;
        if (agePersona >= 2 && agePersona <= 6) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в детский сад.");
        }
        if (agePersona >= 7 && agePersona <= 17) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в школу.");
        }
        if (agePersona >= 18 && agePersona <= 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в университет.");
        }
        if (agePersona > 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему пора ходить на работу.");
        }
        agePersona = 7;
        if (agePersona >= 2 && agePersona <= 6) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в детский сад.");
        }
        if (agePersona >= 7 && agePersona <= 17) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в школу.");
        }
        if (agePersona >= 18 && agePersona <= 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в университет.");
        }
        if (agePersona > 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему пора ходить на работу.");
        }
        agePersona = 19;
        if (agePersona >= 2 && agePersona <= 6) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в детский сад.");
        }
        if (agePersona >= 7 && agePersona <= 17) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в школу.");
        }
        if (agePersona >= 18 && agePersona <= 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в университет.");
        }
        if (agePersona > 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему пора ходить на работу.");
        }
        agePersona = 25;
        if (agePersona >= 2 && agePersona <= 6) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в детский сад.");
        }
        if (agePersona >= 7 && agePersona <= 17) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в школу.");
        }
        if (agePersona >= 18 && agePersona <= 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему нужно ходить в университет.");
        }
        if (agePersona > 24) {
            System.out.println("Если возраст человека равен " + agePersona + " годам, то ему пора ходить на работу.");
        }

        System.out.println("------------------Задание №5-------------------");
        byte ageChild = 4;
        if (ageChild < 5) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он не может кататься на атракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься только " +
                    "в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageChild >= 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься без сопровождения взрослого.");
        }
        ageChild = 6;
        if (ageChild < 5) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он не может кататься на атракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься только " +
                    "в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageChild >= 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься без сопровождения взрослого.");
        }
        ageChild = 14;
        if (ageChild < 5) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он не может кататься на атракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься только " +
                    "в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");

        }
        if (ageChild >= 14) {
            System.out.println("если возраст ребёнка равен " + ageChild + " годам, то он может кататься без сопровождения взрослого.");
        }

        System.out.println("------------------Задание №6-------------------");
        byte numberPerson = 105;
        System.out.println("Число людей в вагоне - " + numberPerson);
        if (numberPerson >= 102) {
            System.out.println("Вагон полон мест нет.");
        } else {
            if (numberPerson > 60 && numberPerson < 102) {
                System.out.println("В вагоне свободных сидячих мест нет, есть только стоячие в количестве " + (102 - numberPerson) + " стоячих мест при условии что все сидячие места заняты.");
            } else {
                System.out.println("В вагоне есть свободные сидячие и стоячие места в количестве:" + (102 - 60) + " стоячих места, при условии что все люди заняли сидячии места, и " + (60 - numberPerson) + " свободных мест.");
            }
        }
        numberPerson = 82;
        System.out.println("Число людей в вагоне - " + numberPerson);
        if (numberPerson >= 102) {
            System.out.println("Вагон полон мест нет.");
        } else {
            if (numberPerson > 60 && numberPerson < 102) {
                System.out.println("В вагоне свободных сидячих мест нет, есть только стоячие в количестве " + (102 - numberPerson) + " стоячих мест при условии что все сидячие места заняты.");
            } else {
                System.out.println("В вагоне есть свободные сидячие и стоячие места в количестве:" + (102 - 60) + " стоячих места, при условии что все люди заняли сидячии места, и " + (60 - numberPerson) + " свободных мест.");
            }
        }
        numberPerson = 20;
        System.out.println("Число людей в вагоне - " + numberPerson);
        if (numberPerson >= 102) {
            System.out.println("Вагон полон мест нет.");
        } else {
            if (numberPerson > 60 && numberPerson < 102) {
                System.out.println("В вагоне свободных сидячих мест нет, есть только стоячие в количестве " + (102 - numberPerson) + " стоячих мест при условии что все сидячие места заняты.");
            } else {
                System.out.println("В вагоне есть свободные сидячие и стоячие места в количестве:" + (102 - 60) + " стоячих места, при условии что все люди заняли сидячии места, и " + (60 - numberPerson) + " свободных мест.");
            }
        }

        System.out.println("------------------Задание №7-------------------");
        int one = 10;
        int two = 15;
        int three = 20;
        System.out.println("Число one=" + one);
        System.out.println("Число two=" + two);
        System.out.println("Число three=" + three);
        if (one > two && one > three) {
            System.out.println("Число one больше всех");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше всех");
            } else {
                System.out.println("Число three больше всех");
            }
        }
        System.out.println("");
        one = 100;
        two = 15;
        three = 20;
        System.out.println("Число one=" + one);
        System.out.println("Число two=" + two);
        System.out.println("Число three=" + three);
        if (one > two && one > three) {
            System.out.println("Число one больше всех");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше всех");
            } else {
                System.out.println("Число three больше всех");
            }
        }
        System.out.println("");
        one = 10;
        two = 150;
        three = 20;
        System.out.println("Число one=" + one);
        System.out.println("Число two=" + two);
        System.out.println("Число three=" + three);
        if (one > two && one > three) {
            System.out.println("Число one больше всех");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше всех");
            } else {
                System.out.println("Число three больше всех");
            }
        }
    }
}

