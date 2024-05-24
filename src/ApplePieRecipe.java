public class ApplePieRecipe {


Ingredients unsaltedButter = new Ingredients(200, "gram", "ongezouten boter");
Ingredients whiteBastardSugar = new Ingredients(200, "gram", "witte basterd suiker");
Ingredients flour = new Ingredients(400, "gram", "zelfrijzend bakmeel");
Ingredients egg = new Ingredients(1, "stuk(s)", "ei");
Ingredients vanillaSugar = new Ingredients(8, "gram", "vanille suiker");
Ingredients salt = new Ingredients(1, "snuf", "zout");
Ingredients apple = new Ingredients(1.5, "kilo", "zoetzure appels");
Ingredients granulatedSugar = new Ingredients(75, "gram", "kristal suiker");
Ingredients cinnamon = new Ingredients(3, "theelepels", "kaneel");
Ingredients breadCrumbs = new Ingredients(15, "gram", "paneermeel");

public void step1HeatOven() {
    System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void step2WiskEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void step3MixIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void step4PrepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void step5PrepareBakingTray() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void step6DoughInBakingTray() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void step7AddApplesToPie() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void step8PrepareDoughForCover() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void step9CoverPieWithDough() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void step10BakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printRecipe() {
    step1HeatOven();
    step2WiskEgg();
    step3MixIngredients();
    step4PrepareApples();
    step5PrepareBakingTray();
    step6DoughInBakingTray();
    step7AddApplesToPie();
    step8PrepareDoughForCover();
    step9CoverPieWithDough();
    step10BakePie();
        System.out.println();
    }

    public void printIngredients() {
        System.out.println(unsaltedButter.printIngredients());
        System.out.println(whiteBastardSugar.printIngredients());
        System.out.println(flour.printIngredients());
        System.out.println(egg.printIngredients());
        System.out.println(vanillaSugar.printIngredients());
        System.out.println(salt.printIngredients());
        System.out.println(apple.printIngredients());
        System.out.println(granulatedSugar.printIngredients());
        System.out.println(cinnamon.printIngredients());
        System.out.println(breadCrumbs.printIngredients());
    }
}


