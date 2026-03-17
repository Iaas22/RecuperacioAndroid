package cat.iticbcn.recuandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.iticbcn.recetasapp.NatacioFragment
import cat.iticbcn.recetasapp.adapter.NatacioAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        lateinit var adapter: NatacioAdapter

        val natacio = listOf(
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),
            Natacio("Natació en piscina", "4000", "25/03/26 9am"),

            )

            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, NatacioFragment())
                    .commit()
            }
            val recyclerView = findViewById<RecyclerView>(R.id.natacio)
            recyclerView.layoutManager = LinearLayoutManager(this)

            adapter = NatacioAdapter(natacio)
            recyclerView.adapter = adapter
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, NatacioFragment())
                .commit()
        }


    }





    }
