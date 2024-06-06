package com.cafeteria;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cafeteria.adapter.ProductAdapter;
import com.cafeteria.databinding.ActivityProductsBinding;
import com.cafeteria.model.Products;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    private final ArrayList<Products> productsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        com.cafeteria.databinding.ActivityProductsBinding binding = ActivityProductsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        RecyclerView recyclerViewProducts = binding.recyclerViewProducts;
        recyclerViewProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewProducts.setHasFixedSize(true);
        ProductAdapter productAdapter = new ProductAdapter(productsList, this);
        recyclerViewProducts.setAdapter(productAdapter);
        getProducts();
    }

    private void getProducts() {

        Products product1 = new Products(
                R.drawable.image_1,
                "Café Preto",
                "Café puro e forte, feito com grãos selecionados.",
                "R$ 5,00"
        );
        productsList.add(product1);

        Products product2 = new Products(
                R.drawable.image_2,
                "Café Expresso",
                "Expresso encorpado e aromático, com crema perfeita.",
                "R$ 7,00"
        );
        productsList.add(product2);

        Products product3 = new Products(
                R.drawable.image_3,
                "Café Gelado",
                "Café refrescante com gelo, suave e revigorante.",
                "R$ 10,00"
        );
        productsList.add(product3);

        Products product4 = new Products(
                R.drawable.image_4,
                "Chocolate Quente",
                "Chocolate cremoso e quente.",
                "R$ 8,00"
        );
        productsList.add(product4);

        Products product5 = new Products(
                R.drawable.image_5,
                "Chocolate Quente Premium",
                "Chocolate quente com chantilly e raspas de chocolate.",
                "R$ 14,00"
        );
        productsList.add(product5);

        Products product6 = new Products(
                R.drawable.image_6,
                "Brownie",
                "Brownie denso e úmido com intenso sabor de chocolate.",
                "R$ 10,00"
        );
        productsList.add(product6);

        Products product7 = new Products(
                R.drawable.image_7,
                "Cookies",
                "Cookies grande e macio com gotas de chocolate.",
                "R$ 6,00"
        );
        productsList.add(product7);

        Products product8 = new Products(
                R.drawable.image_8,
                "Macarons",
                "Delicados macarons franceses em diversos sabores.",
                "R$ 6,00"
        );
        productsList.add(product8);

        Products product9 = new Products(
                R.drawable.image_9,
                "Donuts",
                "Donuts macios, cobertos com glacê ou açúcar.",
                "R$ 8,00"
        );
        productsList.add(product9);

        Products product10 = new Products(
                R.drawable.image_10,
                "Fatia de Torta de Prestígio",
                "Torta de chocolate com recheio de coco.",
                "R$ 12,00"
        );
        productsList.add(product10);

        Products product11 = new Products(
                R.drawable.image_11,
                "Fatia de Torta de Limão",
                "Torta com base crocante, recheio de limão e merengue.",
                "R$ 12,00"
        );
        productsList.add(product11);

        Products product12 = new Products(
                R.drawable.image_12,
                "Croissant Recheado",
                "Croissant recheado com chocolate branco e morango.",
                "R$ 12,00"
        );
        productsList.add(product12);

        Products product13 = new Products(
                R.drawable.image_13,
                "Panqueca Americana",
                "Panquecas fofas servidas com caldas variadas.",
                "R$ 18,00"
        );
        productsList.add(product13);

        Products product14 = new Products(
                R.drawable.image_14,
                "Croissant",
                "Croissant clássico, leve e folhado.",
                "R$ 8,00"
        );
        productsList.add(product14);

        Products product15 = new Products(
                R.drawable.image_15,
                "Cachorro-Quente",
                "Cachorro-quente tradicional com queijo maçaricado.",
                "R$ 14,00"
        );
        productsList.add(product15);

        Products product16 = new Products(
                R.drawable.image_16,
                "Esfirra",
                "Esfirra recheada com carne, frango ou queijo.",
                "R$ 6,00"
        );
        productsList.add(product16);

        Products product17 = new Products(
                R.drawable.image_17,
                "Coxinha Tradicional",
                "Coxinha recheada com frango desfiado.",
                "R$ 7,00"
        );
        productsList.add(product17);

        Products product18 = new Products(
                R.drawable.image_18,
                "Pão de Queijo",
                "Pão de queijo crocante por fora e macio por dentro.",
                "R$ 5,00"
        );
        productsList.add(product18);
    }
}
