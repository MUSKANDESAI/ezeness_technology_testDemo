package com.shopping.main.muskandesai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shopping.main.muskandesai.Adepter.ShowBestTitleAdapter;
import com.shopping.main.muskandesai.Adepter.ShowCategoryAdapter;
import com.shopping.main.muskandesai.Adepter.ShowHeadAdapter;
import com.shopping.main.muskandesai.Adepter.ShowSubCategoryAdapter;
import com.shopping.main.muskandesai.Adepter.ShowTopTitleAdapter;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerv_view1,recyclerv_view_1,recyclerv_view2,recyclerv_view4,recyclerv_view3;
    private ArrayList<String> head = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> name1 = new ArrayList<>();
    private ArrayList<String> name4 = new ArrayList<>();
    private ArrayList<String> name3 = new ArrayList<>();
    private LinearLayoutManager HorizontalLayout;
    private ArrayList<Integer> icon = new ArrayList<>();
    private ArrayList<Integer> icon1 = new ArrayList<>();
    private ArrayList<Integer> icon4 = new ArrayList<>();
    private ArrayList<Integer> icon3 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerv_view1 = (RecyclerView)findViewById(R.id.recyclerv_view);
        recyclerv_view_1 = (RecyclerView)findViewById(R.id.recyclerv_view1);
        recyclerv_view2 = (RecyclerView)findViewById(R.id.recyclerv_view2);
        recyclerv_view3 = (RecyclerView)findViewById(R.id.recyclerv_view3);
        recyclerv_view4 = (RecyclerView)findViewById(R.id.recyclerv_view4);

        Category();
        Category1();
        Category2();
        Category4();
        Category3();
    }

    private void Category() {
        head.add("HEAD TIL 1");
        head.add("HEAD TIL 2");
        head.add("HEAD TIL 3");
        head.add("HEAD TIL 4");
        head.add("HEAD TIL 5");
        head.add("HEAD TIL 6");
        head.add("HEAD TIL 7");
        head.add("HEAD TIL 8");
        head.add("HEAD TIL 9");
        head.add("HEAD TIL 10");

        initRecyclerView();

    }

    private void Category1() {
        icon.add(R.drawable.layers);
        name.add("Main Category 1");

        icon.add(R.drawable.layers);
        name.add("Main Category 2");

        icon.add(R.drawable.layers);
        name.add("Main Category 3");

        icon.add(R.drawable.layers);
        name.add("Main Category 4");

        icon.add(R.drawable.layers);
        name.add("Main Category 5");

        icon.add(R.drawable.layers);
        name.add("Main Category 6");

        icon.add(R.drawable.layers);
        name.add("Main Category 7");

        icon.add(R.drawable.layers);
        name.add("Main Category 8");



        initRecyclerView1();

    }

    private void Category2() {
        icon1.add(R.drawable.pak3);
        name1.add("@_user1");

        icon1.add(R.drawable.pak3);
        name1.add("@_user2");

        icon1.add(R.drawable.pak3);
        name1.add("@_user3");

        icon1.add(R.drawable.pak3);
        name1.add("@_user4");

        icon1.add(R.drawable.pak3);
        name1.add("@_user5");

        icon1.add(R.drawable.pak3);
        name1.add("@_user6");

        icon1.add(R.drawable.pak3);
        name1.add("@_user7");

        icon1.add(R.drawable.pak3);
        name1.add("@_user8");




        initRecyclerView2();

    }

    private void Category4() {
        icon4.add(R.drawable.images);
        name4.add("00.00/-");

        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");


        icon4.add(R.drawable.images);
        name4.add("00.00/-");







        initRecyclerView4();

    }

    private void Category3() {
        icon3.add(R.drawable.images);
        name3.add("00.00/-");

        icon3.add(R.drawable.images);
        name3.add("00.00/-");

        icon3.add(R.drawable.images);
        name3.add("00.00/-");

        icon3.add(R.drawable.images);
        name3.add("00.00/-");

        icon3.add(R.drawable.images);
        name3.add("00.00/-");

        icon3.add(R.drawable.images);
        name3.add("00.00/-");


        initRecyclerView3();

    }

    private void initRecyclerView() {
        recyclerv_view1.setNestedScrollingEnabled(false);
        recyclerv_view1.setHasFixedSize(true);
        ShowHeadAdapter techJobCloseAdapter = new ShowHeadAdapter(HomeActivity.this,head);
        recyclerv_view1.setAdapter(techJobCloseAdapter);

        HorizontalLayout
                = new LinearLayoutManager(
                HomeActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerv_view1.setLayoutManager(HorizontalLayout);
    }

    private void initRecyclerView1() {
        recyclerv_view_1.setNestedScrollingEnabled(false);
        recyclerv_view_1.setHasFixedSize(true);
        ShowCategoryAdapter techJobCloseAdapter = new ShowCategoryAdapter(HomeActivity.this,name,icon);
        recyclerv_view_1.setAdapter(techJobCloseAdapter);

        HorizontalLayout
                = new LinearLayoutManager(
                HomeActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerv_view_1.setLayoutManager(HorizontalLayout);
    }

    private void initRecyclerView2() {
        recyclerv_view2.setNestedScrollingEnabled(false);
        recyclerv_view2.setHasFixedSize(true);
        ShowTopTitleAdapter techJobCloseAdapter = new ShowTopTitleAdapter(HomeActivity.this,name1,icon1);
        recyclerv_view2.setAdapter(techJobCloseAdapter);

        HorizontalLayout
                = new LinearLayoutManager(
                HomeActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerv_view2.setLayoutManager(HorizontalLayout);
    }

    private void initRecyclerView4() {
        recyclerv_view4.setNestedScrollingEnabled(false);
        recyclerv_view4.setHasFixedSize(true);
        ShowBestTitleAdapter techJobCloseAdapter = new ShowBestTitleAdapter(HomeActivity.this,name4,icon4);


        GridLayoutManager layoutManager=new GridLayoutManager(HomeActivity.this,3);

        // at last set adapter to recycler view.
        recyclerv_view4.setLayoutManager(layoutManager);
        recyclerv_view4.setAdapter(techJobCloseAdapter);
    }

    private void initRecyclerView3() {
        recyclerv_view3.setNestedScrollingEnabled(false);
        recyclerv_view3.setHasFixedSize(true);
        ShowSubCategoryAdapter techJobCloseAdapter = new ShowSubCategoryAdapter(HomeActivity.this,name3,icon3);

        recyclerv_view3.setAdapter(techJobCloseAdapter);

        HorizontalLayout
                = new LinearLayoutManager(
                HomeActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerv_view3.setLayoutManager(HorizontalLayout);
    }
}