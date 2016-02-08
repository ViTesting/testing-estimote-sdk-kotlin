package eu.dubedout.testingestimote.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import eu.dubedout.testingestimote.R
import eu.dubedout.testingestimote.presenter.MainActivityPresenter
import eu.dubedout.testingestimote.view.viewable.MainActivityViewable
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), MainActivityViewable {

    val presenter: MainActivityPresenter by lazy {
        MainActivityPresenter(context = this, viewable = this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews();

    }

    private fun initializeViews() {
        activityMainRegisterNewBeacon.onClick { presenter.onRegisterNewBeaconClick() }
    }

    override fun launchRegisterBeacon() = startActivity<RegisterBeaconActivity>()
}

