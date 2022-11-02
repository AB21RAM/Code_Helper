package com.example.codehelper


import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class C_prog2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cprog2)
        val one = findViewById<LinearLayout>(R.id.basic_conept)
        one.setOnClickListener {
            val intent = Intent(this,cp_1::class.java)
            startActivity(intent)
        }
    }
}
/*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Logic to load the starting destination
        //  when the Activity is first created
        if (savedInstanceState == null) {
            val fragment = ProductListFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment, ProductListFragment.TAG)
                .commit()
        }
    }

    // Logic to navigate the user to another destination.
    // This may include logic to initialize and set arguments on the destination
    // fragment or even transition animations between the fragments (not shown here).
    fun navigateToProductDetail(productId: String) {
        val fragment = new ProductDetailsFragment()
        val args = Bundle().apply {
            putInt(KEY_PRODUCT_ID, productId)
        }
        fragment.arguments = args

        supportFragmentManager.beginTransaction()
            .addToBackStack(ProductDetailsFragment.TAG)
            .replace(R.id.fragment_container, fragment, ProductDetailsFragment.TAG)
            .commit()
    }
}
*/