package com.factorybyte.demosc1;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.factorybyte.demosc1.adapters.ViewPagerAdapter;
import com.factorybyte.demosc1.fragments.OptionAFragment;
import com.factorybyte.demosc1.fragments.OptionBFragment;
import com.factorybyte.demosc1.fragments.OptionCFragment;
import com.factorybyte.demosc1.helpers.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BottomNavigationView navigationView = findViewById(R.id.navegation);

        BottomNavigationViewHelper helper = new BottomNavigationViewHelper();

        helper.removeShiftMode(navigationView);

        final ViewPager viewPager = findViewById(R.id.view_pager);


        Fragment optionA = new OptionAFragment();
        Fragment optionB = new OptionBFragment();
        Fragment optionC = new OptionCFragment();


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFragment(optionA);
        adapter.addFragment(optionB);
        adapter.addFragment(optionC);

        viewPager.setAdapter(adapter);









        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){

                    case R.id.optionA :
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.optionB:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.optionC:
                        viewPager.setCurrentItem(2);
                        return true;

                }
                return false;
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                navigationView.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });



        /*


        ImageView miimagen = findViewById(R.id.miimage);

        ImageView photo = findViewById(R.id.photo);

        Button vermas = findViewById(R.id.vermas);

        final TextView description = findViewById(R.id.description);

        TextView vermas_texto = findViewById(R.id.vermas_texto);

        int param = 145;
        if (description.getText().length() > param){
            String aux = description.getText().toString();
            description.setText(aux.substring(0, param) + "...");

            vermas_texto.setVisibility(View.VISIBLE);


        }






        Glide
                .with(this)
                .load("https://images.pexels.com/photos/985635/pexels-photo-985635.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                .apply(options.fitCenter().centerCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(photo);






        ImageButton llamar = findViewById(R.id.llamar);



        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                    Intent intent = new Intent(Intent.ACTION_CALL,  Uri.parse("tel:" + "75116755"));
                    startActivity(intent);
                }else{
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }


            }
        });





        ImageButton pagar = findViewById(R.id.pagar);


        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getApplicationContext(), PaymentActivity.class);
                intent.putExtra("image", "https://images.pexels.com/photos/985635/pexels-photo-985635.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
                intent.putExtra("product_title", getResources().getString(R.string.vestido));
                intent.putExtra("precio", "150");
                intent.putExtra("descripcion", description.getText().toString());
                startActivity(intent);
            }
        });


*/



    }
}
