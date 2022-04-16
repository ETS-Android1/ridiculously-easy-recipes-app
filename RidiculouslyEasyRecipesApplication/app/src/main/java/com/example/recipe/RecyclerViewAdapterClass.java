package com.example.recipe;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapterClass extends RecyclerView.Adapter<RecyclerViewAdapterClass.HolderClass> {

    private Context context;
    private List<RecipesClass> recipesList;

    public RecyclerViewAdapterClass(Context context, List<RecipesClass> recipesList){
        this.context = context;
        this.recipesList = recipesList;
    }



    @NonNull
    @Override
    public HolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int index) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.cardview_recipe, viewGroup,false);

        return new HolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HolderClass holderClass, @SuppressLint("RecyclerView") final int index) {

        holderClass.recipeHeader.setText(recipesList.get(index).getName());
        holderClass.imageSubheader.setImageResource(recipesList.get(index).getThumbnail());
        holderClass.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RecipeActivity.class);

                intent.putExtra("RecipeName", recipesList.get(index).getName());
                intent.putExtra("RecipeIngredients", recipesList.get(index).getIngredients());
                intent.putExtra("RecipeMethodTitle", recipesList.get(index).getDirectionsHeader());
                intent.putExtra("Recipe", recipesList.get(index).getRecipe());
                intent.putExtra("Thumbnail", recipesList.get(index).getThumbnail());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipesList.size();
    }

    public class HolderClass extends RecyclerView.ViewHolder {

        TextView recipeHeader;
        CardView cardView;
        ImageView imageSubheader;

        public HolderClass(@NonNull View itemView) {
            super(itemView);

            recipeHeader = (TextView)itemView.findViewById(R.id.recipe_text);
            imageSubheader = (ImageView)itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}
