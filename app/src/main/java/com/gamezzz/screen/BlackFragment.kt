package com.gamezzz.screen
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gamezzz.R
import com.gamezzz.app.*
import com.gamezzz.databinding.FragmentBlackDiBinding

class BlackFragment : Fragment() {

    val binding by lazy { FragmentBlackDiBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        goToWebView = {
        binding.zug.isVisible = false
        with(binding.webViewDI) {
        settings.setLoadsImagesAutomatically(true)
        webViewClient = WebViewClient()
        settings.allowFileAccess = true
        settings.mixedContentMode = 0
        settings.javaScriptEnabled = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        Log.d("aas1", finalUrl)
        loadUrl(finalUrl)
    }
}

        goToGame = {
            findNavController().navigate(R.id.action_blackFragment_to_loudingFragment)
        }

        return binding.root

    }
}
