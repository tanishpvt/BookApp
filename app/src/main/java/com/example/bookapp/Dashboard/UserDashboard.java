package com.example.bookapp.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bookapp.Fragment.HomeFragment;
import com.example.bookapp.HomeAdapter.CatogeriesAdapter;
import com.example.bookapp.HomeAdapter.CatogeriesHelperClass;
import com.example.bookapp.HomeAdapter.FeaturedAdpater;
import com.example.bookapp.HomeAdapter.FeaturedHelperClass;
import com.example.bookapp.HomeAdapter.MostViewHelperClass;
import com.example.bookapp.HomeAdapter.MostViewedAdpater;
import com.example.bookapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        bottomNavigationView =findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemReselectedListener);


    }




    private  BottomNavigationView.OnNavigationItemSelectedListener navigationItemReselectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                           selectedFragment = new HomeFragment();
                           // startActivity(new Intent(UserDashboard.this,HomeActivity.class));
                            break;

                        case R.id.nav_library:
                           // selectedFragment= new SearchFragment();
                            break;

                        case R.id.nav_saved:
                       //     selectedFragment=null;
                           // startActivity(new Intent(MainActivity2.this,PostActivity.class));

                            break;

                        case R.id.nav_cart:
                            //selectedFragment=new NotificationFragment();
                            break;

                        case R.id.nav_profile:
//                            SharedPreferences.Editor editor= getSharedPreferences("PREFS",MODE_PRIVATE).edit();
//                            editor.putString("profileid", FirebaseAuth.getInstance().getCurrentUser().getUid());
//                            editor.apply();
//                            selectedFragment= new ProfileFragment();
                            break;
                    }
                    if(selectedFragment !=null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    }



                    return true;
                }
            };

}