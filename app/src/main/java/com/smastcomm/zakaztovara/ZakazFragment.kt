package com.smastcomm.zakaztovara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.smastcomm.zakaztovara.databinding.FragmentDashboardBinding
import com.smastcomm.zakaztovara.databinding.FragmentZakazBinding
import com.smastcomm.zakaztovara.ui.dashboard.DashboardViewModel


class ZakazFragment : Fragment() {
    private var _binding: FragmentZakazBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val zakazViewModel =
            ViewModelProvider(this).get(ZakazViewModel::class.java)

        _binding = FragmentZakazBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textZakaz
        zakazViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}