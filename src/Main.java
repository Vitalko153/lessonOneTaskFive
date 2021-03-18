public class Main {


    public static void main(String arg[]){
        getWorkingHours(DayOfWeek.Monday);
    }

    public static void getWorkingHours(DayOfWeek today){
        int timeWork = 0;
        switch (today){
            case Monday: timeWork += 8;
            case Tuesday: timeWork += 8;
            case Wednesday: timeWork += 8;
            case Thursday: timeWork += 8;
            case Friday: timeWork += 8;
            break;
            default: timeWork = 0;
        }

        if (timeWork == 0) {
            System.out.println("Ура! Сегодня выходной.");
        } else {
            System.out.println("До выходных осталось проработать " + timeWork + " часов.");
        }

    }
}

