package com.example.bookapp.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;

import com.example.bookapp.Fragment.CartFragment;
import com.example.bookapp.Fragment.HomeFragment;
import com.example.bookapp.Fragment.LibraryFragment;
import com.example.bookapp.Fragment.ProfileFragment;
import com.example.bookapp.Fragment.ReadFragment;
import com.example.bookapp.Fragment.ReviewFragment;
import com.example.bookapp.Fragment.savedFragment;
import com.example.bookapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class UserDashboard extends AppCompatActivity {


  int selectedindex= 0;

    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemReselectedListener);
        // default
        HomeFragment fragment1 = new HomeFragment();
        FragmentTransaction ft1=getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.fragment_container, fragment1, "");
        ft1.commit();



    }

    private  BottomNavigationView.OnNavigationItemSelectedListener navigationItemReselectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedindex = 0;
                           selectedFragment = new HomeFragment();
                           // startActivity(new Intent(UserDashboard.this,HomeActivity.class));
                            break;

                        case R.id.nav_library:
                            selectedindex = 1;
                            selectedFragment= new LibraryFragment();
                            break;

                        case R.id.nav_saved:
//                            selectedFragment= new savedFragment();
                            switch (selectedindex){
                                case 0:
                                    selectedFragment = new ReadFragment();
                                    break;
                                case 1:
                                    selectedFragment = new savedFragment();
                                    break;

                                case 2:
                                    selectedFragment = new savedFragment();
                                    break;


                                case 3:
                                    selectedFragment = new savedFragment();
                                    break;




                            }

                            //     selectedFragment=null;
                           // startActivity(new Intent(MainActivity2.this,PostActivity.class));

                            break;

                        case R.id.nav_cart:
                            selectedFragment=new CartFragment();
                            selectedindex = 2;

                            break;

                        case R.id.nav_profile:
                            selectedindex = 3;

//                            SharedPreferences.Editor editor= getSharedPreferences("PREFS",MODE_PRIVATE).edit();
//                            editor.putString("profileid", FirebaseAuth.getInstance().getCurrentUser().getUid());
//                            editor.apply();
                            selectedFragment= new ProfileFragment();
                            break;
                    }
                    if(selectedFragment !=null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    }

                    return true;
                }
            };

}