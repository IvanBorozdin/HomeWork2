public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    private static void task2() {
        System.out.println("Задача 4-5");
        var friend = 19;
        System.out.println(friend);
        friend=friend * 2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
    private static void task3() {
        System.out.println("Задача 6-7");
        var boxerOne= 78.2;
        System.out.println("Масса первого бойца" + boxerOne);
        var boxerTwo= 82.7;
        System.out.println("Масса второга бойца" + boxerTwo);
        var totalWeight= boxerTwo + boxerOne;
        System.out.println("Общий вес" + totalWeight);
        var weightDifference= boxerOne - boxerTwo;
        System.out.println("Разница в весе" + weightDifference);
        var weightDifference1= boxerTwo - boxerOne;
        System.out.println(weightDifference1);
        var weightDifference2= boxerTwo % boxerOne;
        System.out.println(weightDifference2);

    }
    private static void task4() {
        System.out.println("Задача 8");
        var workingHours = 640;
        System.out.println("Всего рабочих часов " + workingHours);
        var workingHoursPerPerson = 8;
        System.out.println("Рабочее время одного сотрудника " + workingHoursPerPerson);
        var numberOfPeople = workingHours / workingHoursPerPerson;
        System.out.println("Людей работает в компании " + numberOfPeople);
        var numberofpeople = 94;
        System.out.println("Если в компании будет работать " + numberofpeople + " человека");
        var workinghoursperperson = workingHours / numberofpeople;
        System.out.println("то всего " + workinghoursperperson + " часов работы может быть поделено между сотрудниками");
    }

}

