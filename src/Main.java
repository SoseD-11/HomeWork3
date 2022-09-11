public class Main {
    public static void main(String[] args) {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов - " + totalWeight + " кг");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов - " + weightDifference + " кг!");
        var substractionMethod = boxerWeight2 - boxerWeight1;
        System.out.println("Метод вычитания выдал разницу в " + substractionMethod + " кг");
        var divisionByremainder = boxerWeight2 % boxerWeight1;
        System.out.println("Метод остатка от деления выдал разницу в " + divisionByremainder + " кг");

        var generalOpeninghours = 640;
        var openingHours1person = 8;
        var totalEmployees = generalOpeninghours / openingHours1person;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var additionalWorkers = 94;
        var totalNumber = totalEmployees + additionalWorkers;
        var openingHours = totalNumber * openingHours1person;
        System.out.println("Если в компании работает " + totalNumber + " человека, то всего " + openingHours + " часов работы может быть поделено между сотрудниками");

    }
}