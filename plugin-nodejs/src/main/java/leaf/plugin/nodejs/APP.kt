package leaf.plugin.nodejs

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import io.github.caimucheng.leaf.plugin.PluginAPP
import io.github.caimucheng.leaf.plugin.creator.FragmentCreator
import leaf.plugin.nodejs.creator.APPFragmentCreator

class APP : PluginAPP() {

    private lateinit var hostContext: Context

    private lateinit var selfResources: Resources

    override fun onCreate(hostContext: Context, selfResources: Resources) {
        this.hostContext = hostContext
        this.selfResources = selfResources
    }

    override fun getFragmentCreator(): FragmentCreator {
        return APPFragmentCreator
    }

    override fun getPluginName(): String {
        return selfResources.getString(R.string.app_name)
    }

    override fun getPluginDescription(): String {
        return selfResources.getString(R.string.plugin_description)
    }

    override fun getPluginAuthor(): String {
        return selfResources.getString(R.string.plugin_author)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun getProjectCardIcon(): Drawable {
        return selfResources.getDrawable(R.drawable.nodejs_logo, hostContext.theme)
    }

    override fun getProjectCardSubscript(): String {
        return selfResources.getString(R.string.project_card_subscript)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun getTemplateIcon(): Drawable {
        return selfResources.getDrawable(R.mipmap.template_icon, hostContext.theme)
    }

    override fun getTemplateTitle(): String {
        return selfResources.getString(R.string.template_title)
    }

}