public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);


        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + ", " + cat + ", " + paper);



        double dog1;
        dog1 = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1 + ", " + cat + ", " + paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес: " + totalWeight);
        var difference = boxerTwo - boxerOne;
        System.out.println(difference);

        var boxer1 = 60;
        var boxer2 = 83;
        var total = boxer2 - boxer1;
        System.out.println(total);
        var remains = boxer2 % boxer1;
        System.out.println(remains);

        var operatingTime = 640;
        var workTime = 8;
        var employees = operatingTime/workTime;
        System.out.println("Всего работников в компании - " + employees + " человек.");


        employees = employees + 94;
        operatingTime = employees * workTime;
        System.out.println("Если в компании работает - "  + employees + " человек, то всего  " + operatingTime + " часов работы может быть поделено между сотрудниками.");
    }
}
