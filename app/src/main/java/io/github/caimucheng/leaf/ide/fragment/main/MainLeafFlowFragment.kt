package io.github.caimucheng.leaf.ide.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.caimucheng.leaf.ide.databinding.FragmentMainLeafFlowBinding

class MainLeafFlowFragment : Fragment() {

    private lateinit var viewBinding: FragmentMainLeafFlowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentMainLeafFlowBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}