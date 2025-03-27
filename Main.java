public class Main {
    public static void main(String[] args) throws Exception {
        Warrior warrior = new Warrior("Воїн", 100);
        warrior.speccialAttac();
        warrior.attac();
        warrior.attac("автоматом, ", "гранатою, ", "міною");
        System.out.println("");

        Robber robber = new Robber("Грабіжник", 85);
        robber.speccialAttac();
        robber.protect();
        robber.protect("рукавички, ", "маска, ", "пістолет");
        System.out.println("");

        Priest priest = new Priest("Жрець", 56);
        priest.speccialAttac();
        priest.attac();
        priest.attac("чари1, ", "чари2, ", "чари3");
        priest.protect();
        priest.protect("чари1, ", "чари2, ", "чари3");
    }
}
