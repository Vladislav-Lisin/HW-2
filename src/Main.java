public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4
        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // task 6
        var massOfFirstFight = 78.2;
        var massOfSecondFight = 82.7;
        System.out.println(massOfFirstFight + massOfSecondFight);
        System.out.println(massOfSecondFight - massOfFirstFight);

        // task 7
        System.out.println(massOfSecondFight % massOfFirstFight);

        // task 8.1
        var allTime = 640;
        var workTime = 8;
        var countWorker = allTime / workTime;
        System.out.println("Всего работников в компании — " + countWorker + " человек");

        // task 8.2
        countWorker += 94;
        allTime = countWorker * workTime;
        System.out.println("Если в компании работает " + countWorker + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");


    }

}