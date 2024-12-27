package com.example.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.common.nav.Dashboard
import com.example.home.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textHome
    homeViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
      binding.button1.setOnClickListener {
          findNavController().navigate(Dashboard("test"))
//          findNavController().navigate(Dashboard("test"))
//          findNavController().navigate(R.id.navigation_dashboard)
//          val request = NavDeepLinkRequest.Builder
//              .fromUri("navtest1://dashboard".toUri())
//              .build()
//          findNavController().navigate(request)
      }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}