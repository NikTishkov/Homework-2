//Task 1
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        //Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        //Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var total_weight = boxer1 + boxer2;
        var weight_difference = boxer2 - boxer1;
        System.out.println(total_weight);
        System.out.println(weight_difference);
        System.out.println();

        //Task 7
        var remainder = boxer2 % boxer1;
        System.out.println(remainder);
        System.out.println();

        //Task 8
        var time = 640;
        var productivity = 8;
        var employees = time / productivity;
        System.out.println("Всего работников в компании - "+employees+" человек.");
        employees = employees + 94;
        time = employees * 8;
        System.out.println("Если в компании работает "+employees+" человека, то всего "+time+" часов работы может быть поделено между сотрудниками.");
    }
}