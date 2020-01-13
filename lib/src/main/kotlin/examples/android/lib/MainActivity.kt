package examples.android.lib
  
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.appcompat.app.AlertDialog
import examples.android.lib.R

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val parent = LinearLayout(this).apply {
      orientation = LinearLayout.VERTICAL
    }.also { it.addView(Button(this).apply { text = "Foo!" }) }
    setContentView(parent, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
    AlertDialog.Builder(this)
        .setTitle(getResources().getString(R.string.demo_header))
        .setMessage("Blah blah blah?")
        .show()
  }
}

