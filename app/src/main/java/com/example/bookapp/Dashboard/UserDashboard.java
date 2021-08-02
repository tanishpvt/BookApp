package com.example.bookapp.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bookapp.Fragment.CartFragment;
import com.example.bookapp.Fragment.HomeFragment;
import com.example.bookapp.Fragment.LibraryFragment;
import com.example.bookapp.Fragment.savedFragment;
import com.example.bookapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class UserDashboard extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemReselectedListener);


    }


    @Override
    protected void onStart() {
        selectedFragment = new HomeFragment();
        super.onStart();
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
                            selectedFragment= new LibraryFragment();
                            break;

                        case R.id.nav_saved:
                            selectedFragment= new savedFragment();

                            //     selectedFragment=null;
                           // startActivity(new Intent(MainActivity2.this,PostActivity.class));

                            break;

                        case R.id.nav_cart:
                            selectedFragment=new CartFragment();
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