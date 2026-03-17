package cat.iticbcn.recetasapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.iticbcn.recetasapp.adapter.NatacioAdapter
import cat.iticbcn.recuandroid.Natacio

class NatacioFragment : Fragment() {

    private lateinit var adapter: NatacioAdapter
    private val natacio = listOf(
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),
        Natacio("Natacio en piscina", "400", "24/02/2023 8am"),


        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_natacio, container, false)

        // RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.natacioRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return view
    }


}