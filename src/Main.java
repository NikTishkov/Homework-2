public class Main {
    public static void main(String[] args) {
            var time = 640;
            var productivity = 8;
            var employees = time / productivity;
                System.out.println("Всего работников в компании - "+ employees + " человек.");
            employees = employees + 94;
            time = employees * 8;
                System.out.println("Если в компании работает "+employees+" человека, то всего "+time+" часов работы может быть поделено между сотрудниками.");
    }
}