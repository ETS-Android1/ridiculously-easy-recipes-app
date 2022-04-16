package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapterClass recyclerViewAdapter;

    List<RecipesClass> recipesClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipesClassList = new ArrayList<>();
        recipesClassList.add(new RecipesClass("FRENCH TOAST", "The BEST French Toast recipe on the planet! Fluffy and tender on the inside, and gloriously brown on the outside with a little crisp. Learn how to make amazing French Toast, from what bread to use, the perfect batter, and how to cook. Start your morning right! Is there nothing better than French Toast for Sunday breakfast? Thick slices of break, soaked in a mixture of beaten eggs with milk and cinnamon, toasted in a frying pan, and served with butter and maple syrup. One of the most popular breakfast dishes for a reason.\n" +
                "\n       INGREDIENTS:\n" +
                "- 4 large eggs\n" +
                "- 2/3 cup milk\n" +
                "- 1 teaspoon cinnamon\n" +
                "- 8 thick slices of bread (the thicker the better)\n" +
                "- Butter, vegetable oil, or olive oil\n" +
                "\n" +
                "       Optional:\n" +
                "- Maple syrup\n" +
                "- Powdered sugar\n" +
                "- 2 teaspoons of freshly grated orange zest\n" +
                "- Fresh berries or any other fruit you prefer\n", "STEPS",
                "\n1) Make the egg mixture:\n" +
                        "In a medium bowl, whisk together the eggs, milk, and cinnamon. Stir in the orange zest and/or triple sec if using. Whisk the mixture until well blended and pour into a shallow bowl, wide enough to place a slice of the bread you will be using.\n" +
                        "\n2) Soak bread slices in egg mixture:\n" +
                        "Place each slice of bread into the milk egg mixture, allowing the bread to soak in some of it.\n" +
                        "\n3) Fry the french toast:\n" +
                        "Melt some butter in a large skillet over medium high heat. Shake off the excess egg mixture from the bread and place the bread slices onto the hot skillet. Fry the French toast until browned on one side, then flip and brown the other side.\n" +
                        "\n4) Serve:\n" +
                        "Serve the French toast hot with butter, maple syrup, and/or fresh berries.\n", R.drawable.french_toast));

        recipesClassList.add(new RecipesClass("CHOCOLATE CAKE", "The Best Chocolate Cake Recipe in the world! A one bowl chocolate cake recipe that is quick, easy, and delicious! " +
                "It's a pretty bold claim. The best chocolate cake recipe ever? Through years of experimentation, feedback and evaluation, this recipe has been perfected. " +
                "Just one bite of this decadent, moist chocolate cake with chocolate frosting will get you hooked. For it to unanimously be the best ever, there must be evidence through a large sample-size. " +
                "Thousands of people have delivered positive feedback and many said this was the best chocolate cake they’d ever tasted! Cake has long been a delicious treat and dessert across the world. Of all the cake flavors, chocolate cake is one of most popular and most loved. " +
                "It’s just simply because the best of both worlds are – cake and chocolate – can be found in this delightful baked product. Now let's show you how to create the perfect chocolate cake.\n" +

                "\n       INGREDIENTS:\n" +
                "- 2 large eggs\n" +
                "- 1 cup milk\n" +
                "- 2 cups all-purpose flour\n" +
                "- 3/4 cup unsweetened cocoa powder\n" +
                "- 2 teaspoons baking powder\n" +
                "- 1 1/2 teaspoons baking soda\n" +
                "- 1 teaspoon salt\n" +
                "- 1 teaspoon espresso powder\n" +
                "- Chocolate Buttercream Frosting Recipe\n" +
                "- 2 teaspoons vanilla extract\n" +
                "- 1 cup boiling water\n" +
                "- 1/2 cup vegetable oil\n", "STEPS",
                "\n1) Preheat the oven:\n" +
                        "Preheat the oven to 350F. Prepare two 9-inch cake pans by spraying them with baking spray or buttering and lightly flouring.\n" +
                        "\n2) Add the ingredients:\n" +
                        "Add flour, sugar, cocoa, baking powder, baking soda, salt and espresso powder to a large bowl or the bowl of a stand mixer. Whisk through to combine. Stir for several minutes until it is combined well.\n" +
                        "Add milk, vegetable oil, eggs, and vanilla extract to the flour mixture and mix together on medium speed until the batter is well combined.\n" +
                        "Reduce the speed and carefully add the boiling water to the cake batter. Mix thoroughly until the batter is well combined.\n" +
                        "\n3) Place in the oven:\n" +
                        "Distribute the cake batter evenly between the two prepared cake pans. Bake for 30-35 minutes. You can get an indication by placing a toothpick in the center of the cake and checking if it comes out clean.\n" +
                        "\n4) Remove from the oven and serve:\n" +
                        "Remove from the oven carefully and allow the cake to cool for about 10 minutes, remove the pan and cool completely. Lastly, frost the cake with Chocolate Buttercream Frosting.\n", R.drawable.chocolate_cake));

        recipesClassList.add(new RecipesClass("CHOCOLATE BUTTERCREAM FROSTING", "The Best Chocolate Buttercream Frosting Recipe in the world! One serving of chocolate frosting that is quick, easy, and delicious! " +
                "The Perfect Chocolate Buttercream Frosting recipe essential for birthday cakes and celebrations! It’s the best chocolate buttercream frosting! It complements many different cakes and baked goods, but it is best paired with this moist chocolate cake recipe.\n" +

                "\n       INGREDIENTS:\n" +
                "- 1 1/2 cups softened butter\n" +
                "- 1/2 cup milk\n" +
                "- 5 cups confectioner's sugar\n" +
                "- 1 cup unsweetened cocoa\n" +
                "- 2 teaspoons vanilla extract\n" +
                "- 1/2 teaspoon espresso powder\n" +
                "- small pinch of salt\n" +
                "- 1 teaspoon water\n" +
                "- 1 teaspoon cream\n", "STEPS",
                "\n1) Add cocoa:\n" +
                        "Add cocoa to a large bowl or bowl of stand mixer. Whisk thoroughly to remove any lumps.\n" +
                        "\n2) Cream it up:\n" +
                        "Cream together butter and cocoa powder until well-combined.\n" +
                        "Add sugar and milk to cocoa mixture by adding 1 cup of sugar followed by about a tablespoon of milk. After each addition has been combined, turn mixer onto a high speed for about a minute. Repeat until all sugar and milk have been added.\n" +
                        "\n3) Flavour time:\n" +
                        "Add vanilla extract and espresso powder and combine well.\n" +
                        "\n4) Assess and serve:\n" +
                        "If frosting appears too dry, add a little more milk, a tablespoon at a time until it reaches the right consistency. If it appears too wet and does not hold its form, then add more confectioner's sugar. Add a tablespoon at a time until it reaches the right consistency.\n", R.drawable.chocolate_buttercream_frosting));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        recyclerViewAdapter = new RecyclerViewAdapterClass(this, recipesClassList);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        recyclerView.setAdapter(recyclerViewAdapter);


    }

}
