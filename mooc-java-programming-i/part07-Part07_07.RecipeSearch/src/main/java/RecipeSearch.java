
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
import java.util.List;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String fileName = scanner.nextLine();


        ArrayList<Recipe> recipes = readRecipesFromFile(fileName);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");


        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String query = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int query = Integer.parseInt(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= query) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String query = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    for (String ingredient : recipe.getIngredients()) {
                        if (Objects.equals(ingredient, query)) {
                            System.out.println(recipe);
                        }
                    }
                }
            }
            if (command.equals("stop")) {
                break;
            }
        }
    }

    public static ArrayList<Recipe> readRecipesFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    assignRecipeParts(recipes, recipeParts);
                }

            }
            if (!recipeParts.isEmpty()) {
                assignRecipeParts(recipes, recipeParts);
            }

        } catch (Exception e) {
            System.out.println("Error reading " + fileName);
        }
        return recipes;

    }


    public static void assignRecipeParts(ArrayList<Recipe> recipes, ArrayList<String> recipeParts) {
        String name;
        int cookingTime;
        name = recipeParts.get(0);
        cookingTime = Integer.parseInt(recipeParts.get(1));
        recipeParts.remove(0);
        recipeParts.remove(0);
        recipes.add(new Recipe(name, cookingTime, new ArrayList<>(recipeParts)));
        recipeParts.clear();
    }
}



