package litec.candycode;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R -> gradle erzwugt resource klasse -> zugriff auf xml datein/elemente

        TextView textview = (TextView) this.findViewById(R.id.textView_Products);
        textview.setText("Products");
    }
}
